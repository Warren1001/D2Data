package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2QualityItems(header: String, vararg headerHistory: String): D2Header {
	
	MOD_1_CODE("mod1code"),
	MOD_1_PARAM("mod1param"),
	MOD_1_MIN("mod1min"),
	MOD_1_MAX("mod1max"),
	MOD_2_CODE("mod2code"),
	MOD_2_PARAM("mod2param"),
	MOD_2_MIN("mod2min"),
	MOD_2_MAX("mod2max"),
	ARMOR("armor"),
	WEAPON("weapon"),
	SHIELD("shield"),
	SCEPTER("scepter"),
	WAND("wand"),
	STAFF("staff"),
	BOW("bow"),
	BOOTS("boots"),
	GLOVES("gloves"),
	BELT("belt");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/qualityitems.txt".properSeparator()
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