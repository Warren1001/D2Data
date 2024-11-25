package io.github.warren1001.d2data.enums.sheet

interface D2SheetInfo {
	fun getFilePath(): String
	fun getHeaders(): List<List<String>>
	fun getUniqueHeader(): D2Header?
	fun isHardcode(): Boolean
}
