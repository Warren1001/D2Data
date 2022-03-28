package io.github.warren1001.d2data

import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.nameWithoutExtension

open class D2Sheet {
	
	val name: String
	
	protected val manager: D2SheetManager
	private val headers: List<String>
	private val columnLookup: MutableMap<String, Int> = mutableMapOf()
	private val sheetLookup: MutableMap<String, List<String>> = mutableMapOf()
	
	constructor(manager: D2SheetManager, dir: File, fileName: String): this(manager, Paths.get(dir.path, if (fileName.endsWith(".txt")) fileName else "$fileName.txt"))
	
	constructor(manager: D2SheetManager, file: File): this(manager, file.toPath())
	
	constructor(manager: D2SheetManager, path: Path) {
		this.name = path.nameWithoutExtension
		this.manager = manager
		val lines = Files.readAllLines(path);
		headers = lines.removeFirst().split("\t")
		headers.forEachIndexed { i, column -> columnLookup[column] = i }
		println(lines.size)
		lines.map { it.split("\t") }.filter { it[3].isNotEmpty() && it[3].lowercase() != "expansion" }.forEach { sheetLookup[it[3] + "," + it[7]] = it }
		println(sheetLookup.size)
	}
	
	fun getValue(key: String, header: String): String? {
		val index = columnLookup[header] ?: return null
		val row = sheetLookup[key] ?: throw IllegalArgumentException("Could not find row named '$key'.")
		return row[index]
	}
	
	fun getHeaders(): List<String> {
		return headers
	}
	
	fun getSheetLookup(): Map<String, List<String>> {
		return sheetLookup
	}
	
	fun forEach(action: (key: String) -> Unit) {
		sheetLookup.keys.forEach(action)
	}
	
}