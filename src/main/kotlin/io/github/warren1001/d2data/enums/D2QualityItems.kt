package io.github.warren1001.d2data.enums

enum class D2QualityItems(val header: String) {
	
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
	
	companion object {
		const val SHEET_NAME = "qualityitems"
		val HEADERS = values().map { it.header }
	}
	
}