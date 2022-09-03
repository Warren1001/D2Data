package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Runes(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "runes") {
	
	companion object {
		
		private val HEADERS = listOf("Name", "*Rune Name", "complete", "server", "*Patch Release", "itype1", "itype2", "itype3", "itype4", "itype5", "itype6", "etype1", "etype2", "etype3", "*RunesUsed", "Rune1", "Rune2", "Rune3", "Rune4", "Rune5", "Rune6", "T1Code1", "T1Param1", "T1Min1", "T1Max1", "T1Code2", "T1Param2", "T1Min2", "T1Max2", "T1Code3", "T1Param3", "T1Min3", "T1Max3", "T1Code4", "T1Param4", "T1Min4", "T1Max4", "T1Code5", "T1Param5", "T1Min5", "T1Max5", "T1Code6", "T1Param6", "T1Min6", "T1Max6", "T1Code7", "T1Param7", "T1Min7", "T1Max7", "*eol")
		
		const val ID = "Name"
		const val RUNEWORD_NAME = "*Rune Name"
		const val COMPLETE = "complete"
		const val SERVER = "server"
		const val PATCH_RELEASE = "*Patch Release"
		const val I_TYPE_1 = "itype1"
		const val I_TYPE_2 = "itype2"
		const val I_TYPE_3 = "itype3"
		const val I_TYPE_4 = "itype4"
		const val I_TYPE_5 = "itype5"
		const val I_TYPE_6 = "itype6"
		const val E_TYPE_1 = "etype1"
		const val E_TYPE_2 = "etype2"
		const val E_TYPE_3 = "etype3"
		const val RUNES_USED = "*RunesUsed"
		const val RUNE_1 = "Rune1"
		const val RUNE_2 = "Rune2"
		const val RUNE_3 = "Rune3"
		const val RUNE_4 = "Rune4"
		const val RUNE_5 = "Rune5"
		const val RUNE_6 = "Rune6"
		const val T1_CODE_1 = "T1Code1"
		const val T1_PARAM_1 = "T1Param1"
		const val T1_MIN_1 = "T1Min1"
		const val T1_MAX_1 = "T1Max1"
		const val T1_CODE_2 = "T1Code2"
		const val T1_PARAM_2 = "T1Param2"
		const val T1_MIN_2 = "T1Min2"
		const val T1_MAX_2 = "T1Max2"
		const val T1_CODE_3 = "T1Code3"
		const val T1_PARAM_3 = "T1Param3"
		const val T1_MIN_3 = "T1Min3"
		const val T1_MAX_3 = "T1Max3"
		const val T1_CODE_4 = "T1Code4"
		const val T1_PARAM_4 = "T1Param4"
		const val T1_MIN_4 = "T1Min4"
		const val T1_MAX_4 = "T1Max4"
		const val T1_CODE_5 = "T1Code5"
		const val T1_PARAM_5 = "T1Param5"
		const val T1_MIN_5 = "T1Min5"
		const val T1_MAX_5 = "T1Max5"
		const val T1_CODE_6 = "T1Code6"
		const val T1_PARAM_6 = "T1Param6"
		const val T1_MIN_6 = "T1Min6"
		const val T1_MAX_6 = "T1Max6"
		const val T1_CODE_7 = "T1Code7"
		const val T1_PARAM_7 = "T1Param7"
		const val T1_MIN_7 = "T1Min7"
		const val T1_MAX_7 = "T1Max7"
		const val EOL = "*eol"
		
	}
	
	init { verify(HEADERS) }
	
}