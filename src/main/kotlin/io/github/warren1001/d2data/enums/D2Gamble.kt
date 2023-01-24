package io.github.warren1001.d2data.enums

enum class D2Gamble(val header: String) {
	
	NAME("name"),
	CODE("code");
	
	companion object {
		const val SHEET_NAME = "gamble"
		val HEADERS = values().map { it.header }
	}
	
}