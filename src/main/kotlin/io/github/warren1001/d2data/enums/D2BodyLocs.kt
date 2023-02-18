package io.github.warren1001.d2data.enums

enum class D2BodyLocs(override val header: String): D2Header {
	
	BODY_LOCATION("Body Location"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "bodylocs"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = BODY_LOCATION
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}