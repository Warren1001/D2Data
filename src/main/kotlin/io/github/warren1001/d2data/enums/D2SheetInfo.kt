package io.github.warren1001.d2data.enums

interface D2SheetInfo {
	fun getSheetName(): String
	fun getHeaders(): List<String>
	fun getUniqueHeader(): D2Header?
	fun isHardcode(): Boolean
}
