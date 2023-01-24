package io.github.warren1001.d2data.enums

enum class D2MissCalc(val header: String) {
	
	CODE("code"),
	DESCRIPTION("*description");
	
	companion object {
		const val SHEET_NAME = "misscalc"
		val HEADERS = values().map { it.header }
	}
	
}