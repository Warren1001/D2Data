package io.github.warren1001.d2data

import com.fasterxml.jackson.core.json.JsonReadFeature
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File

class D2Json(val file: File) {
	
	companion object {
		val mapper = ObjectMapper().also {
			it.enable(JsonReadFeature.ALLOW_JAVA_COMMENTS.mappedFeature())
			it.enable(JsonReadFeature.ALLOW_TRAILING_COMMA.mappedFeature())
		}
	}
	
	init {
		require(file.exists()) { "File does not exist: ${file.absolutePath}" }
		require(file.isFile) { "File is not a file: ${file.absolutePath}" }
		require(file.extension == "json") { "File is not a JSON file: ${file.absolutePath}" }
	}
	
	val name = file.nameWithoutExtension
	val root: JsonNode = file.readText().replace("\uFEFF", "").let {
		try {
			mapper.readTree(it)
		} catch (e: Exception) {
			println("Error parsing JSON file: ${file.absolutePath}")
			throw e
		}
	}
	private val lookup: Map<String, JsonNode> = if (root.isArray) {
		root.asIterable().associateBy { it["Key"].asText() }
	} else {
		emptyMap()
	}
	
	operator fun get(key: String): JsonNode = lookup[key]!!
	
	fun save() = mapper.writeValue(file, root)
	
}