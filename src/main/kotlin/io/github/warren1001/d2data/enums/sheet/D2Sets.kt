package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Sets(override val header: String): D2Header {
	
	INDEX("index"),
	NAME("name"),
	VERSION("version"),
	P_CODE_2_A("PCode2a"),
	P_PARAM_2_A("PParam2a"),
	P_MIN_2_A("PMin2a"),
	P_MAX_2_A("PMax2a"),
	P_CODE_2_B("PCode2b"),
	P_PARAM_2_B("PParam2b"),
	P_MIN_2_B("PMin2b"),
	P_MAX_2_B("PMax2b"),
	P_CODE_3_A("PCode3a"),
	P_PARAM_3_A("PParam3a"),
	P_MIN_3_A("PMin3a"),
	P_MAX_3_A("PMax3a"),
	P_CODE_3_B("PCode3b"),
	P_PARAM_3_B("PParam3b"),
	P_MIN_3_B("PMin3b"),
	P_MAX_3_B("PMax3b"),
	P_CODE_4_A("PCode4a"),
	P_PARAM_4_A("PParam4a"),
	P_MIN_4_A("PMin4a"),
	P_MAX_4_A("PMax4a"),
	P_CODE_4_B("PCode4b"),
	P_PARAM_4_B("PParam4b"),
	P_MIN_4_B("PMin4b"),
	P_MAX_4_B("PMax4b"),
	P_CODE_5_A("PCode5a"),
	P_PARAM_5_A("PParam5a"),
	P_MIN_5_A("PMin5a"),
	P_MAX_5_A("PMax5a"),
	P_CODE_5_B("PCode5b"),
	P_PARAM_5_B("PParam5b"),
	P_MIN_5_B("PMin5b"),
	P_MAX_5_B("PMax5b"),
	F_CODE_1("FCode1"),
	F_PARAM_1("FParam1"),
	F_MIN_1("FMin1"),
	F_MAX_1("FMax1"),
	F_CODE_2("FCode2"),
	F_PARAM_2("FParam2"),
	F_MIN_2("FMin2"),
	F_MAX_2("FMax2"),
	F_CODE_3("FCode3"),
	F_PARAM_3("FParam3"),
	F_MIN_3("FMin3"),
	F_MAX_3("FMax3"),
	F_CODE_4("FCode4"),
	F_PARAM_4("FParam4"),
	F_MIN_4("FMin4"),
	F_MAX_4("FMax4"),
	F_CODE_5("FCode5"),
	F_PARAM_5("FParam5"),
	F_MIN_5("FMin5"),
	F_MAX_5("FMax5"),
	F_CODE_6("FCode6"),
	F_PARAM_6("FParam6"),
	F_MIN_6("FMin6"),
	F_MAX_6("FMax6"),
	F_CODE_7("FCode7"),
	F_PARAM_7("FParam7"),
	F_MIN_7("FMin7"),
	F_MAX_7("FMax7"),
	F_CODE_8("FCode8"),
	F_PARAM_8("FParam8"),
	F_MIN_8("FMin8"),
	F_MAX_8("FMax8"),
	EOL("*eol");
	
	companion object {
		val FILE_PATH = "global/excel/sets.txt".properSeparator()
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