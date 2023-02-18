package io.github.warren1001.d2data.enums

enum class D2SkillCalc(override val header: String): D2Header {
	
	CODE("code"),
	DESCRIPTION("*Description");
	
	companion object {
		const val SHEET_NAME = "skillcalc"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = CODE
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}