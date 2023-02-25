package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2MonLvl(override val header: String): D2Header {
	
	LEVEL("Level"),
	AC("AC"),
	AC_NIGHTMARE("AC(N)"),
	AC_HELL("AC(H)"),
	L_AC("L-AC"),
	L_AC_NIGHTMARE("L-AC(N)"),
	L_AC_HELL("L-AC(H)"),
	TH("TH"),
	TH_NIGHTMARE("TH(N)"),
	TH_HELL("TH(H)"),
	L_TH("L-TH"),
	L_TH_NIGHTMARE("L-TH(N)"),
	L_TH_HELL("L-TH(H)"),
	HP("HP"),
	HP_NIGHTMARE("HP(N)"),
	HP_HELL("HP(H)"),
	L_HP("L-HP"),
	L_HP_NIGHTMARE("L-HP(N)"),
	L_HP_HELL("L-HP(H)"),
	DM("DM"),
	DM_NIGHTMARE("DM(N)"),
	DM_HELL("DM(H)"),
	L_DM("L-DM"),
	L_DM_NIGHTMARE("L-DM(N)"),
	L_DM_HELL("L-DM(H)"),
	XP("XP"),
	XP_NIGHTMARE("XP(N)"),
	XP_HELL("XP(H)"),
	L_XP("L-XP"),
	L_XP_NIGHTMARE("L-XP(N)"),
	L_XP_HELL("L-XP(H)");
	
	companion object {
		val FILE_PATH = "global/excel/monlvl.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = LEVEL
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}