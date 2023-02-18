package io.github.warren1001.d2data.enums

enum class D2Properties(override val header: String): D2Header {
	
	CODE("code"),
	ENABLED("*Enabled"),
	FUNC_1("func1"),
	STAT_1("stat1"),
	SET_1("set1"),
	VAL_1("val1"),
	FUNC_2("func2"),
	STAT_2("stat2"),
	SET_2("set2"),
	VAL_2("val2"),
	FUNC_3("func3"),
	STAT_3("stat3"),
	SET_3("set3"),
	VAL_3("val3"),
	FUNC_4("func4"),
	STAT_4("stat4"),
	SET_4("set4"),
	VAL_4("val4"),
	FUNC_5("func5"),
	STAT_5("stat5"),
	SET_5("set5"),
	VAL_5("val5"),
	FUNC_6("func6"),
	STAT_6("stat6"),
	SET_6("set6"),
	VAL_6("val6"),
	FUNC_7("func7"),
	STAT_7("stat7"),
	SET_7("set7"),
	VAL_7("val7"),
	TOOLTIP("*Tooltip"),
	PARAMETER("*Parameter"),
	MIN("*Min"),
	MAX("*Max"),
	NOTES("*Notes"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "properties"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = CODE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}