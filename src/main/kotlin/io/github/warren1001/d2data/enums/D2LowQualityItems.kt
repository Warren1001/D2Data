package io.github.warren1001.d2data.enums

enum class D2LowQualityItems(val header: String) {
	
	NAME("Name");
	
	companion object {
		const val SHEET_NAME = "lowqualityitems"
		val HEADERS = values().map { it.header }
	}
	
}