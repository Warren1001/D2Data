package io.github.warren1001.d2data.enums

enum class D2SuperUniques(val header: String) {
	
	SUPER_UNIQUE("Superunique"),
	NAME("Name"),
	CLASS("Class"),
	HC_IDX("hcIdx"),
	MON_SOUND("MonSound"),
	MOD_1("Mod1"),
	MOD_2("Mod2"),
	MOD_3("Mod3"),
	MIN_GRP("MinGrp"),
	MAX_GRP("MaxGrp"),
	AUTO_POS("AutoPos"),
	STACKS("Stacks"),
	REPLACEABLE("Replaceable"),
	U_TRANS("Utrans"),
	U_TRANS_NIGHTMARE("Utrans(N)"),
	U_TRANS_HELL("Utrans(H)"),
	TC("TC"),
	TC_DESECRATED("TC Desecrated"),
	TC_NIGHTMARE("TC(N)"),
	TC_NIGHTMARE_DESECRATED("TC(N) Desecrated"),
	TC_HELL("TC(H)"),
	TC_HELL_DESECRATED("TC(H) Desecrated"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "superuniques"
		val HEADERS = values().map { it.header }
	}
	
}