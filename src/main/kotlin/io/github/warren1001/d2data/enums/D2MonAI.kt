package io.github.warren1001.d2data.enums

enum class D2MonAI(override val header: String): D2Header {
	
	AI("AI"),
	AIP_1("*aip1"),
	AIP_2("*aip2"),
	AIP_3("*aip3"),
	AIP_4("*aip4"),
	AIP_5("*aip5"),
	AIP_6("*aip6"),
	AIP_7("*aip7"),
	AIP_8("*aip8"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "monai"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = AI
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}