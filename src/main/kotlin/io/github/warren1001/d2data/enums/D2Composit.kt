package io.github.warren1001.d2data.enums

enum class D2Composit(val header: String) {
	
	NAME("Name"),
	TOKEN("Token");
	
	companion object {
		const val SHEET_NAME = "composit"
		val HEADERS = values().map { it.header }
	}
	
}