package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonStats2(manager: D2Sheets, dir: File) : D2Sheet(manager, dir, "monstats2") {
	
	companion object {
		
		private val HEADERS = listOf(
			"Id",
			"*hcIdx",
			"Height",
			"OverlayHeight",
			"pixHeight",
			"SizeX",
			"SizeY",
			"spawnCol",
			"MeleeRng",
			"BaseW",
			"HitClass",
			"HDv",
			"TRv",
			"LGv",
			"Rav",
			"Lav",
			"RHv",
			"LHv",
			"SHv",
			"S1v",
			"S2v",
			"S3v",
			"S4v",
			"S5v",
			"S6v",
			"S7v",
			"S8v",
			"HD",
			"TR",
			"LG",
			"RA",
			"LA",
			"RH",
			"LH",
			"SH",
			"S1",
			"S2",
			"S3",
			"S4",
			"S5",
			"S6",
			"S7",
			"S8",
			"TotalPieces",
			"mDT",
			"mNU",
			"mWL",
			"mGH",
			"mA1",
			"mA2",
			"mBL",
			"mSC",
			"mS1",
			"mS2",
			"mS3",
			"mS4",
			"mDD",
			"mKB",
			"mSQ",
			"mRN",
			"dDT",
			"dNU",
			"dWL",
			"dGH",
			"dA1",
			"dA2",
			"dBL",
			"dSC",
			"dS1",
			"dS2",
			"dS3",
			"dS4",
			"dDD",
			"dKB",
			"dSQ",
			"dRN",
			"A1mv",
			"A2mv",
			"SCmv",
			"S1mv",
			"S2mv",
			"S3mv",
			"S4mv",
			"noGfxHitTest",
			"htTop",
			"htLeft",
			"htWidth",
			"htHeight",
			"restore",
			"automapCel",
			"noMap",
			"noOvly",
			"isSel",
			"alSel",
			"noSel",
			"shiftSel",
			"corpseSel",
			"isAtt",
			"revive",
			"limitCorpses",
			"critter",
			"small",
			"large",
			"soft",
			"inert",
			"objCol",
			"deadCol",
			"unflatDead",
			"Shadow",
			"noUniqueShift",
			"compositeDeath",
			"localBlood",
			"Bleed",
			"Light",
			"light-r",
			"light-g",
			"light-b",
			"Utrans",
			"Utrans(N)",
			"Utrans(H)",
			"InfernoLen",
			"InfernoAnim",
			"InfernoRollback",
			"ResurrectMode",
			"ResurrectSkill",
			"SpawnUniqueMod",
			"*eol"
		)
		
		const val ID = "Id"
		const val HC_IDX = "*hcIdx"
		const val HEIGHT = "Height"
		const val OVERLAY_HEIGHT = "OverlayHeight"
		const val PIX_HEIGHT = "pixHeight"
		const val SIZE_X = "SizeX"
		const val SIZE_Y = "SizeY"
		const val SPAWN_COL = "spawnCol"
		const val MELEE_RNG = "MeleeRng"
		const val BASE_W = "BaseW"
		const val HIT_CLASS = "HitClass"
		const val HDV = "HDv"
		const val TRV = "TRv"
		const val LGV = "LGv"
		const val RAV = "Rav"
		const val LAV = "Lav"
		const val RHV = "RHv"
		const val LHV = "LHv"
		const val SHV = "SHv"
		const val S1_V = "S1v"
		const val S2_V = "S2v"
		const val S3_V = "S3v"
		const val S4_V = "S4v"
		const val S5_V = "S5v"
		const val S6_V = "S6v"
		const val S7_V = "S7v"
		const val S8_V = "S8v"
		const val HD = "HD"
		const val TR = "TR"
		const val LG = "LG"
		const val RA = "RA"
		const val LA = "LA"
		const val RH = "RH"
		const val LH = "LH"
		const val SH = "SH"
		const val S1 = "S1"
		const val S2 = "S2"
		const val S3 = "S3"
		const val S4 = "S4"
		const val S5 = "S5"
		const val S6 = "S6"
		const val S7 = "S7"
		const val S8 = "S8"
		const val TOTAL_PIECES = "TotalPieces"
		const val M_DT = "mDT"
		const val M_NU = "mNU"
		const val M_WL = "mWL"
		const val M_GH = "mGH"
		const val M_A1 = "mA1"
		const val M_A2 = "mA2"
		const val M_BL = "mBL"
		const val M_SC = "mSC"
		const val M_S1 = "mS1"
		const val M_S2 = "mS2"
		const val M_S3 = "mS3"
		const val M_S4 = "mS4"
		const val M_DD = "mDD"
		const val M_KB = "mKB"
		const val M_SQ = "mSQ"
		const val M_RN = "mRN"
		const val D_DT = "dDT"
		const val D_NU = "dNU"
		const val D_WL = "dWL"
		const val D_GH = "dGH"
		const val D_A1 = "dA1"
		const val D_A2 = "dA2"
		const val D_BL = "dBL"
		const val D_SC = "dSC"
		const val D_S1 = "dS1"
		const val D_S2 = "dS2"
		const val D_S3 = "dS3"
		const val D_S4 = "dS4"
		const val D_DD = "dDD"
		const val D_KB = "dKB"
		const val D_SQ = "dSQ"
		const val D_RN = "dRN"
		const val A1_MV = "A1mv"
		const val A2_MV = "A2mv"
		const val S_CMV = "SCmv"
		const val S1_MV = "S1mv"
		const val S2_MV = "S2mv"
		const val S3_MV = "S3mv"
		const val S4_MV = "S4mv"
		const val NO_GFX_HIT_TEST = "noGfxHitTest"
		const val HT_TOP = "htTop"
		const val HT_LEFT = "htLeft"
		const val HT_WIDTH = "htWidth"
		const val HT_HEIGHT = "htHeight"
		const val RESTORE = "restore"
		const val AUTOMAP_CEL = "automapCel"
		const val NO_MAP = "noMap"
		const val NO_OVLY = "noOvly"
		const val IS_SEL = "isSel"
		const val AL_SEL = "alSel"
		const val NO_SEL = "noSel"
		const val SHIFT_SEL = "shiftSel"
		const val CORPSE_SEL = "corpseSel"
		const val IS_ATT = "isAtt"
		const val REVIVE = "revive"
		const val LIMIT_CORPSES = "limitCorpses"
		const val CRITTER = "critter"
		const val SMALL = "small"
		const val LARGE = "large"
		const val SOFT = "soft"
		const val INERT = "inert"
		const val OBJ_COL = "objCol"
		const val DEAD_COL = "deadCol"
		const val UNFLAT_DEAD = "unflatDead"
		const val SHADOW = "Shadow"
		const val NO_UNIQUE_SHIFT = "noUniqueShift"
		const val COMPOSITE_DEATH = "compositeDeath"
		const val LOCAL_BLOOD = "localBlood"
		const val BLEED = "Bleed"
		const val LIGHT = "Light"
		const val LIGHT_R = "light-r"
		const val LIGHT_G = "light-g"
		const val LIGHT_B = "light-b"
		const val UTRANS = "Utrans"
		const val UTRANS_NIGHTMARE = "Utrans(N)"
		const val UTRANS_HELL = "Utrans(H)"
		const val INFERNO_LEN = "InfernoLen"
		const val INFERNO_ANIM = "InfernoAnim"
		const val INFERNO_ROLLBACK = "InfernoRollback"
		const val RESURRECT_MODE = "ResurrectMode"
		const val RESURRECT_SKILL = "ResurrectSkill"
		const val SPAWN_UNIQUE_MOD = "SpawnUniqueMod"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}