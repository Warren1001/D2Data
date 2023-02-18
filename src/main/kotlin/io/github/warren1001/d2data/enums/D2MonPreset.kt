package io.github.warren1001.d2data.enums

enum class D2MonPreset(override val header: String): D2Header {
	
	ACT("Act"),
	PLACE("Place");
	
	companion object {
		const val SHEET_NAME = "monpreset"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = PLACE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}