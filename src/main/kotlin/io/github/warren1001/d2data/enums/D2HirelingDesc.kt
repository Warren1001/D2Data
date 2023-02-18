package io.github.warren1001.d2data.enums

enum class D2HirelingDesc(override val header: String): D2Header {
	
	ID("id"),
	HCIDX("*hcIdx"),
	ALTERNATE_VOICE("alternateVoice"),
	EOL("*eol");

	companion object {
		const val SHEET_NAME = "hirelingdesc"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = ID
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}