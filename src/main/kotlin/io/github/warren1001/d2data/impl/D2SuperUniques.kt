package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2SuperUniques(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "superuniques") {
	
	companion object {
		
		private val HEADERS = listOf("Superunique", "Name", "Class", "hcIdx", "MonSound", "Mod1", "Mod2", "Mod3", "MinGrp", "MaxGrp", "AutoPos", "Stacks", "Replaceable", "Utrans", "Utrans(N)", "Utrans(H)", "TC", "TC(N)", "TC(H)", "*eol")
		
		const val SUPER_UNIQUE = "Superunique"
		const val NAME = "Name"
		const val CLASS = "Class"
		const val HC_IDX = "hcIdx"
		const val MON_SOUND = "MonSound"
		const val MOD_1 = "Mod1"
		const val MOD_2 = "Mod2"
		const val MOD_3 = "Mod3"
		const val MIN_GRP = "MinGrp"
		const val MAX_GRP = "MaxGrp"
		const val AUTO_POS = "AutoPos"
		const val STACKS = "Stacks"
		const val REPLACEABLE = "Replaceable"
		const val U_TRANS = "Utrans"
		const val U_TRANS_NIGHTMARE = "Utrans(N)"
		const val U_TRANS_HELL = "Utrans(H)"
		const val TC = "TC"
		const val TC_NIGHTMARE = "TC(N)"
		const val TC_HELL = "TC(H)"
		const val EOL = "*eol"
		
	}
	
	init { verify(HEADERS) }
	
}