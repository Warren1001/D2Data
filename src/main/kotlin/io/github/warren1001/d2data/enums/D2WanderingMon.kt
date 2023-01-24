package io.github.warren1001.d2data.enums

enum class D2WanderingMon(val header: String) {
	
	CLASS("class");
	
	companion object {
		const val SHEET_NAME = "wanderingmon"
		val HEADERS = values().map { it.header }
	}
	
}