package io.github.warren1001.d2data.enums

enum class D2Colors(override val header: String): D2Header {
	
	TRANSFORM_COLOR("Transform Color"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "colors"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = TRANSFORM_COLOR
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}