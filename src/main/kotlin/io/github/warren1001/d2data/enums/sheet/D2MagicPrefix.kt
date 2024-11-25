package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2MagicPrefix(header: String, vararg headerHistory: String): D2Header {
	
	NAME("Name"),
	VERSION("version"),
	SPAWNABLE("spawnable"),
	RARE("rare"),
	LEVEL("level"),
	MAX_LEVEL("maxlevel"),
	LEVEL_REQ("levelreq"),
	CLASS_SPECIFIC("classspecific"),
	CLASS("class"),
	CLASS_LEVEL_REQ("classlevelreq"),
	FREQUENCY("frequency"),
	GROUP("group"),
	MOD_1_CODE("mod1code"),
	MOD_1_PARAM("mod1param"),
	MOD_1_MIN("mod1min"),
	MOD_1_MAX("mod1max"),
	MOD_2_CODE("mod2code"),
	MOD_2_PARAM("mod2param"),
	MOD_2_MIN("mod2min"),
	MOD_2_MAX("mod2max"),
	MOD_3_CODE("mod3code"),
	MOD_3_PARAM("mod3param"),
	MOD_3_MIN("mod3min"),
	MOD_3_MAX("mod3max"),
	TRANSFORM_COLOR("transformcolor"),
	ITYPE_1("itype1"),
	ITYPE_2("itype2"),
	ITYPE_3("itype3"),
	ITYPE_4("itype4"),
	ITYPE_5("itype5"),
	ITYPE_6("itype6"),
	ITYPE_7("itype7"),
	ETYPE_1("etype1"),
	ETYPE_2("etype2"),
	ETYPE_3("etype3"),
	ETYPE_4("etype4"),
	ETYPE_5("etype5"),
	MULTIPLY("multiply"),
	ADD("add");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/magicprefix.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = null
			override fun isHardcode() = HARDCODE
		}
	}
	
}