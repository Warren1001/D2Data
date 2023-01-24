package io.github.warren1001.d2data.enums

enum class D2MonAI(val header: String) {
	
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
	}
	
}