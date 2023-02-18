package io.github.warren1001.d2data.enums

enum class D2Events(override val header: String): D2Header {
	
	EVENT("event"),
	DESCRIPTION("*description");
	
	companion object {
		const val SHEET_NAME = "events"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = EVENT
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}