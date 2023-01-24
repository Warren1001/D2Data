package io.github.warren1001.d2data.enums

enum class D2Events(val header: String) {
	
	EVENT("event"),
	DESCRIPTION("*description");
	
	companion object {
		const val SHEET_NAME = "events"
		val HEADERS = values().map { it.header }
	}
	
}