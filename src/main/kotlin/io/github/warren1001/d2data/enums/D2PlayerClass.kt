package io.github.warren1001.d2data.enums

enum class D2PlayerClass(val header: String) {
	
	PLAYER_CLASS("Player Class"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "playerclass"
		val HEADERS = values().map { it.header }
	}
	
}