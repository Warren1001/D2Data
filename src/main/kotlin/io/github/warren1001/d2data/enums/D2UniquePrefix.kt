package io.github.warren1001.d2data.enums

enum class D2UniquePrefix(val header: String) {
	
	NAME("Name");
	
	companion object {
		const val SHEET_NAME = "uniqueprefix"
		val HEADERS = values().map { it.header }
	}
	
}