package io.github.warren1001.d2data.enums

enum class D2MonPlace(val header: String) {
	
	CODE("code");
	
	companion object {
		const val SHEET_NAME = "monplace"
		val HEADERS = values().map { it.header }
	}
	
}