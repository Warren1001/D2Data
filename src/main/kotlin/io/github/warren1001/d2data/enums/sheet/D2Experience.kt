package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

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
		val FILE_PATH = "global/excel/experience.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = LEVEL
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}