package io.github.warren1001.d2data.enums

enum class D2CubeMod(val header: String) {
	
	CUBE_MODIFIER_TYPE("cube modifier type"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "cubemod"
		val HEADERS = values().map { it.header }
	}
	
}