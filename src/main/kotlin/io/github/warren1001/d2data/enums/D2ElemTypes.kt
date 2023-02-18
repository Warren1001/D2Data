package io.github.warren1001.d2data.enums

enum class D2ElemTypes(override val header: String): D2Header {
	
	ELEMENTAL_TYPE("Elemental Type"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "elemtypes"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = ELEMENTAL_TYPE
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}