package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2SuperUniques(header: String, vararg headerHistory: String): D2Header {
	
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
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/superuniques.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = SUPER_UNIQUE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}