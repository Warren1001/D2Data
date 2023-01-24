package io.github.warren1001.d2data.enums

enum class D2CompCode(val header: String) {
	
	COMPONENT("component"),
	CODE("code");
	
	companion object {
		const val SHEET_NAME = "compcode"
		val HEADERS = values().map { it.header }
	}
	
}