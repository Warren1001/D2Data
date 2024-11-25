package io.github.warren1001.d2data.file

import com.fasterxml.jackson.core.json.JsonReadFeature
import com.fasterxml.jackson.databind.ObjectMapper
import io.github.warren1001.d2data.lang.MultiLangString
import java.io.File

class D2Lang(val file: File) {
	
	companion object {
		val LANGUAGES = listOf("enUS", "esES", "esMX", "frFR", "deDE", "itIT", "jaJP", "plPL", "ptBR", "ruRU", "koKR", "zhTW")
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
	private val strings: Map<String, MultiLangString> = file.readText(Charsets.UTF_8).replace("\uFEFF", "").let {
		try {
			mapper.readTree(it)
		} catch (e: Exception) {
			println("Error parsing JSON file: ${file.absolutePath}")
			throw e
		}
	}.associate {
		val key = it["Key"].asText()
		val map = it.fields().asSequence().filter { it.key != "id" && it.key != "Key" }.map { it.key to replace(it.value.asText()) }.toMap(HashMap())
		key.lowercase() to MultiLangString(key, map)
	}
	
	private fun replace(string: String) = string.replace(Regex("\\(?%\\+[id]\\)?"), "+%s").replace(Regex("%\\+?[id]"), "%s")
		.replace("%3", "%4\$s").replace("%2", "%3\$s").replace("%1", "%2\$s").replace("%0", "%1\$s")
		.replace("%+3", "+%4\$s").replace("%+2", "+%3\$s").replace("%+1", "+%2\$s").replace("%+0", "+%1\$s")
		.replace(Regex("ÿc[0-9]"), "")
	
	operator fun get(key: String): MultiLangString = strings[key.lowercase()] ?: error("No string for key ${key.lowercase()} in $name")
	
	fun has(key: String) = strings.containsKey(key.lowercase())
	
}