package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Shrines(header: String, vararg headerHistory: String): D2Header {
	
	NAME("Name"),
	SHRINE_TYPE("*Shrine Type"),
	EFFECT("*Effect"),
	CODE("Code"),
	ARG_0("Arg0"),
	ARG_1("Arg1"),
	DURATION_IN_FRAMES("Duration in frames"),
	RESET_TIME_IN_MINUTES("reset time in minutes"),
	RARITY("rarity"),
	STRING_NAME("StringName"),
	STRING_PHRASE("StringPhrase"),
	EFFECTCLASS("effectclass"),
	LEVEL_MIN("LevelMin");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/shrines.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = CODE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}