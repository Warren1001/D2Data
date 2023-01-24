package io.github.warren1001.d2data.enums

enum class D2PlrMode(val header: String) {
	
	NAME("Name"),
	TOKEN("Token"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "plrmode"
		val HEADERS = values().map { it.header }
	}
	
}