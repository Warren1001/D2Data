package io.github.warren1001.d2data

import java.io.File

open class D2Sheet {
	
	val name: String
	
	protected val manager: D2Sheets
	private val headers: List<String>
	private val columnLookup: MutableMap<String, Int> = mutableMapOf()
	private val sheetLookup: MutableMap<String, List<String>> = mutableMapOf()
	
	constructor(manager: D2Sheets, dir: File, fileName: String): this(manager, File(dir.path, if (fileName.endsWith(".txt")) fileName else "$fileName.txt"))
	
	constructor(manager: D2Sheets, file: File) {
		this.name = file.nameWithoutExtension
		this.manager = manager
		val lines = file.readLines().toMutableList()
		headers = lines.removeFirst().split("\t")
		headers.forEachIndexed { i, column -> columnLookup[column] = i }
		//println(lines.size)
		lines.map { it.split("\t") }.forEach { sheetLookup[it[0]] = it }
		//println(sheetLookup.size)
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
		sheetLookup.keys.filter { it.isNotEmpty() && it.lowercase() != "expansion" }.forEach(action)
	}
	
	protected fun verify(headers: List<String>) {
		headers.filter { !this.headers.contains(it) }.forEach { println("Existing header removed from $name: $it") }
		this.headers.filter { !headers.contains(it) }.forEach { println("New header missing from $name: $it") }
	}
	
}