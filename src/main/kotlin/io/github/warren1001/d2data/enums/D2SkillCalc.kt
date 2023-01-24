package io.github.warren1001.d2data.enums

enum class D2SkillCalc(val header: String) {
	
	CODE("code"),
	DESCRIPTION("*Description");
	
	companion object {
		const val SHEET_NAME = "skillcalc"
		val HEADERS = values().map { it.header }
	}
	
}