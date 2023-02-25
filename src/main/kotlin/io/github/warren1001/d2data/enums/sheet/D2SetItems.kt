package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2SetItems(override val header: String): D2Header {
	
	INDEX("index"),
	ID("*ID"),
	SET("set"),
	ITEM("item"),
	ITEM_NAME("*ItemName"),
	RARITY("rarity"),
	LVL("lvl"),
	LVL_REQ("lvl req"),
	CHR_TRANSFORM("chrtransform"),
	INV_TRANSFORM("invtransform"),
	INV_FILE("invfile"),
	FLIPPY_FILE("flippyfile"),
	DROP_SOUND("dropsound"),
	DROP_SFX_FRAME("dropsfxframe"),
	USE_SOUND("usesound"),
	COST_MULT("cost mult"),
	COST_ADD("cost add"),
	ADD_FUNC("add func"),
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
	A_PROP_1_A("aprop1a"),
	A_PAR_1_A("apar1a"),
	A_MIN_1_A("amin1a"),
	A_MAX_1_A("amax1a"),
	A_PROP_1_B("aprop1b"),
	A_PAR_1_B("apar1b"),
	A_MIN_1_B("amin1b"),
	A_MAX_1_B("amax1b"),
	A_PROP_2_A("aprop2a"),
	A_PAR_2_A("apar2a"),
	A_MIN_2_A("amin2a"),
	A_MAX_2_A("amax2a"),
	A_PROP_2_B("aprop2b"),
	A_PAR_2_B("apar2b"),
	A_MIN_2_B("amin2b"),
	A_MAX_2_B("amax2b"),
	A_PROP_3_A("aprop3a"),
	A_PAR_3_A("apar3a"),
	A_MIN_3_A("amin3a"),
	A_MAX_3_A("amax3a"),
	A_PROP_3_B("aprop3b"),
	A_PAR_3_B("apar3b"),
	A_MIN_3_B("amin3b"),
	A_MAX_3_B("amax3b"),
	A_PROP_4_A("aprop4a"),
	A_PAR_4_A("apar4a"),
	A_MIN_4_A("amin4a"),
	A_MAX_4_A("amax4a"),
	A_PROP_4_B("aprop4b"),
	A_PAR_4_B("apar4b"),
	A_MIN_4_B("amin4b"),
	A_MAX_4_B("amax4b"),
	A_PROP_5_A("aprop5a"),
	A_PAR_5_A("apar5a"),
	A_MIN_5_A("amin5a"),
	A_MAX_5_A("amax5a"),
	A_PROP_5_B("aprop5b"),
	A_PAR_5_B("apar5b"),
	A_MIN_5_B("amin5b"),
	A_MAX_5_B("amax5b"),
	DIABLO_CLONE_WEIGHT("diablocloneweight"),
	EOL("*eol");
	
	companion object {
		val FILE_PATH = "global/excel/setitems.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = INDEX
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}