package io.github.warren1001.d2data.enums

enum class D2MonMode(val header: String) {
	
	NAME("name"),
	TOKEN("token"),
	CODE("code");
	
	companion object {
		const val SHEET_NAME = "monmode"
		val HEADERS = values().map { it.header }
	}
	
}