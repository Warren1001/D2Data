package io.github.warren1001.d2data.enums

enum class D2UniqueAppellation(val header: String) {
	
	NAME("Name");
	
	companion object {
		const val SHEET_NAME = "uniqueappellation"
		val HEADERS = values().map { it.header }
	}
	
}