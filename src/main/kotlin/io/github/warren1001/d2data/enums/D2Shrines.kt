package io.github.warren1001.d2data.enums

enum class D2Shrines(val header: String) {
	
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
	
	companion object {
		const val SHEET_NAME = "shrines"
		val HEADERS = values().map { it.header }
	}
	
}