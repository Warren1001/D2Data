package io.github.warren1001.d2data.enums

enum class D2Runes(override val header: String): D2Header {
	
	ID("Name"),
	RUNEWORD_NAME("*Rune Name"),
	COMPLETE("complete"),
	FIRST_LADDER_SEASON("firstLadderSeason"),
	LAST_LADDER_SEASON("lastLadderSeason"),
	PATCH_RELEASE("*Patch Release"),
	I_TYPE_1("itype1"),
	I_TYPE_2("itype2"),
	I_TYPE_3("itype3"),
	I_TYPE_4("itype4"),
	I_TYPE_5("itype5"),
	I_TYPE_6("itype6"),
	E_TYPE_1("etype1"),
	E_TYPE_2("etype2"),
	E_TYPE_3("etype3"),
	RUNES_USED("*RunesUsed"),
	RUNE_1("Rune1"),
	RUNE_2("Rune2"),
	RUNE_3("Rune3"),
	RUNE_4("Rune4"),
	RUNE_5("Rune5"),
	RUNE_6("Rune6"),
	T1_CODE_1("T1Code1"),
	T1_PARAM_1("T1Param1"),
	T1_MIN_1("T1Min1"),
	T1_MAX_1("T1Max1"),
	T1_CODE_2("T1Code2"),
	T1_PARAM_2("T1Param2"),
	T1_MIN_2("T1Min2"),
	T1_MAX_2("T1Max2"),
	T1_CODE_3("T1Code3"),
	T1_PARAM_3("T1Param3"),
	T1_MIN_3("T1Min3"),
	T1_MAX_3("T1Max3"),
	T1_CODE_4("T1Code4"),
	T1_PARAM_4("T1Param4"),
	T1_MIN_4("T1Min4"),
	T1_MAX_4("T1Max4"),
	T1_CODE_5("T1Code5"),
	T1_PARAM_5("T1Param5"),
	T1_MIN_5("T1Min5"),
	T1_MAX_5("T1Max5"),
	T1_CODE_6("T1Code6"),
	T1_PARAM_6("T1Param6"),
	T1_MIN_6("T1Min6"),
	T1_MAX_6("T1Max6"),
	T1_CODE_7("T1Code7"),
	T1_PARAM_7("T1Param7"),
	T1_MIN_7("T1Min7"),
	T1_MAX_7("T1Max7"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "runes"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = ID
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}