package io.github.warren1001.d2data.enums

enum class D2MonLvl(val header: String) {
	
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
		const val SHEET_NAME = "monlvl"
		val HEADERS = values().map { it.header }
	}
	
}