package io.github.warren1001.d2data.enums

enum class D2Experience(val header: String) {
	
	LEVEL("Level"),
	AMAZON("Amazon"),
	SORCERESS("Sorceress"),
	NECROMANCER("Necromancer"),
	PALADIN("Paladin"),
	BARBARIAN("Barbarian"),
	DRUID("Druid"),
	ASSASSIN("Assassin"),
	EXP_RATIO("ExpRatio");
	
	companion object {
		const val SHEET_NAME = "experience"
		val HEADERS = values().map { it.header }
	}
	
}