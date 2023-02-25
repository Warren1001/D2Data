package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2UniqueItems(override val header: String): D2Header {
	
	INDEX("index"),
	ID("*ID"),
	VERSION("version"),
	ENABLED("enabled"),
	FIRST_LADDER_SEASON("firstLadderSeason"),
	LAST_LADDER_SEASON("lastLadderSeason"),
	RARITY("rarity"),
	NO_LIMIT("nolimit"),
	LVL("lvl"),
	LVL_REQ("lvl req"),
	CODE("code"),
	ITEM_NAME("*ItemName"),
	CARRY_1("carry1"),
	COST_MULT("cost mult"),
	COST_ADD("cost add"),
	CHR_TRANSFORM("chrtransform"),
	INV_TRANSFORM("invtransform"),
	FLIPPY_FILE("flippyfile"),
	INV_FILE("invfile"),
	DROP_SOUND("dropsound"),
	DROP_SFX_FRAME("dropsfxframe"),
	USE_SOUND("usesound"),
	PROP_1("prop1"),
	PAR_1("par1"),
	MIN_1("min1"),
	MAX_1("max1"),
	PROP_2("prop2"),
	PAR_2("par2"),
	MIN_2("min2"),
	MAX_2("max2"),
	PROP_3("prop3"),
	PAR_3("par3"),
	MIN_3("min3"),
	MAX_3("max3"),
	PROP_4("prop4"),
	PAR_4("par4"),
	MIN_4("min4"),
	MAX_4("max4"),
	PROP_5("prop5"),
	PAR_5("par5"),
	MIN_5("min5"),
	MAX_5("max5"),
	PROP_6("prop6"),
	PAR_6("par6"),
	MIN_6("min6"),
	MAX_6("max6"),
	PROP_7("prop7"),
	PAR_7("par7"),
	MIN_7("min7"),
	MAX_7("max7"),
	PROP_8("prop8"),
	PAR_8("par8"),
	MIN_8("min8"),
	MAX_8("max8"),
	PROP_9("prop9"),
	PAR_9("par9"),
	MIN_9("min9"),
	MAX_9("max9"),
	PROP_10("prop10"),
	PAR_10("par10"),
	MIN_10("min10"),
	MAX_10("max10"),
	PROP_11("prop11"),
	PAR_11("par11"),
	MIN_11("min11"),
	MAX_11("max11"),
	PROP_12("prop12"),
	PAR_12("par12"),
	MIN_12("min12"),
	MAX_12("max12"),
	DIABLO_CLONE_WEIGHT("diablocloneweight"),
	EOL("*eol");
	
	companion object {
		val FILE_PATH = "global/excel/uniqueitems.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = ID
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}