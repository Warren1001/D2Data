package io.github.warren1001.d2data.enums

enum class D2ArmType(val header: String) {
	
	NAME("Name"),
	TOKEN("Token");
	
	companion object {
		const val SHEET_NAME = "armtype"
		val HEADERS = values().map { it.header }
	}
	
}