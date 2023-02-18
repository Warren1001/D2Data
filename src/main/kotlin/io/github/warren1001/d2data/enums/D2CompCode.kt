package io.github.warren1001.d2data.enums

enum class D2CompCode(override val header: String): D2Header {
	
	COMPONENT("component"),
	CODE("code");
	
	companion object {
		const val SHEET_NAME = "compcode"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = COMPONENT
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}