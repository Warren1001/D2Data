package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonLvl(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "monlvl") {
	
	companion object {
		
		private val HEADERS = listOf("Level", "AC", "AC(N)", "AC(H)", "L-AC", "L-AC(N)", "L-AC(H)", "TH", "TH(N)", "TH(H)", "L-TH", "L-TH(N)", "L-TH(H)", "HP", "HP(N)", "HP(H)", "L-HP", "L-HP(N)", "L-HP(H)", "DM", "DM(N)", "DM(H)", "L-DM", "L-DM(N)", "L-DM(H)", "XP", "XP(N)", "XP(H)", "L-XP", "L-XP(N)", "L-XP(H)")
		
		const val LEVEL = "Level"
		const val AC = "AC"
		const val AC_NIGHTMARE = "AC(N)"
		const val AC_HELL = "AC(H)"
		const val L_AC = "L-AC"
		const val L_AC_NIGHTMARE = "L-AC(N)"
		const val L_AC_HELL = "L-AC(H)"
		const val TH = "TH"
		const val TH_NIGHTMARE = "TH(N)"
		const val TH_HELL = "TH(H)"
		const val L_TH = "L-TH"
		const val L_TH_NIGHTMARE = "L-TH(N)"
		const val L_TH_HELL = "L-TH(H)"
		const val HP = "HP"
		const val HP_NIGHTMARE = "HP(N)"
		const val HP_HELL = "HP(H)"
		const val L_HP = "L-HP"
		const val L_HP_NIGHTMARE = "L-HP(N)"
		const val L_HP_HELL = "L-HP(H)"
		const val DM = "DM"
		const val DM_NIGHTMARE = "DM(N)"
		const val DM_HELL = "DM(H)"
		const val L_DM = "L-DM"
		const val L_DM_NIGHTMARE = "L-DM(N)"
		const val L_DM_HELL = "L-DM(H)"
		const val XP = "XP"
		const val XP_NIGHTMARE = "XP(N)"
		const val XP_HELL = "XP(H)"
		const val L_XP = "L-XP"
		const val L_XP_NIGHTMARE = "L-XP(N)"
		const val L_XP_HELL = "L-XP(H)"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}