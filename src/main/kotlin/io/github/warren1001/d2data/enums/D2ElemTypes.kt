package io.github.warren1001.d2data.enums

enum class D2ElemTypes(val header: String) {
	
	ELEMENTAL_TYPE("Elemental Type"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "elemtypes"
		val HEADERS = values().map { it.header }
	}
	
}