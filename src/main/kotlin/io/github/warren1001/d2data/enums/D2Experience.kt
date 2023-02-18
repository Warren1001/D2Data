package io.github.warren1001.d2data.enums

enum class D2Experience(override val header: String): D2Header {
	
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
		val UNIQUE_HEADER = LEVEL
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}