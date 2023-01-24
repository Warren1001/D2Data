package io.github.warren1001.d2data.enums

enum class D2MonPreset(val header: String) {
	
	ACT("Act"),
	PLACE("Place");
	
	companion object {
		const val SHEET_NAME = "monpreset"
		val HEADERS = values().map { it.header }
	}
	
}