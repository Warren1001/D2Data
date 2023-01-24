package io.github.warren1001.d2data.enums

enum class D2Colors(val header: String) {
	
	TRANSFORM_COLOR("Transform Color"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "colors"
		val HEADERS = values().map { it.header }
	}
	
}