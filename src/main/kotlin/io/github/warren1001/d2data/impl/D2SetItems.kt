package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2SetItems(manager: D2Sheets, dir: File) : D2Sheet(manager, dir, "setitems") {
	
	companion object {
		
		private val HEADERS = listOf(
			"index",
			"*ID",
			"set",
			"item",
			"*ItemName",
			"rarity",
			"lvl",
			"lvl req",
			"chrtransform",
			"invtransform",
			"invfile",
			"flippyfile",
			"dropsound",
			"dropsfxframe",
			"usesound",
			"cost mult",
			"cost add",
			"add func",
			"prop1",
			"par1",
			"min1",
			"max1",
			"prop2",
			"par2",
			"min2",
			"max2",
			"prop3",
			"par3",
			"min3",
			"max3",
			"prop4",
			"par4",
			"min4",
			"max4",
			"prop5",
			"par5",
			"min5",
			"max5",
			"prop6",
			"par6",
			"min6",
			"max6",
			"prop7",
			"par7",
			"min7",
			"max7",
			"prop8",
			"par8",
			"min8",
			"max8",
			"prop9",
			"par9",
			"min9",
			"max9",
			"aprop1a",
			"apar1a",
			"amin1a",
			"amax1a",
			"aprop1b",
			"apar1b",
			"amin1b",
			"amax1b",
			"aprop2a",
			"apar2a",
			"amin2a",
			"amax2a",
			"aprop2b",
			"apar2b",
			"amin2b",
			"amax2b",
			"aprop3a",
			"apar3a",
			"amin3a",
			"amax3a",
			"aprop3b",
			"apar3b",
			"amin3b",
			"amax3b",
			"aprop4a",
			"apar4a",
			"amin4a",
			"amax4a",
			"aprop4b",
			"apar4b",
			"amin4b",
			"amax4b",
			"aprop5a",
			"apar5a",
			"amin5a",
			"amax5a",
			"aprop5b",
			"apar5b",
			"amin5b",
			"amax5b",
			"diablocloneweight",
			"*eol"
		)
		
		const val INDEX = "index"
		const val ID = "*ID"
		const val SET = "set"
		const val ITEM = "item"
		const val ITEM_NAME = "*ItemName"
		const val RARITY = "rarity"
		const val LVL = "lvl"
		const val LVL_REQ = "lvl req"
		const val CHR_TRANSFORM = "chrtransform"
		const val INV_TRANSFORM = "invtransform"
		const val INV_FILE = "invfile"
		const val FLIPPY_FILE = "flippyfile"
		const val DROP_SOUND = "dropsound"
		const val DROP_SFX_FRAME = "dropsfxframe"
		const val USE_SOUND = "usesound"
		const val COST_MULT = "cost mult"
		const val COST_ADD = "cost add"
		const val ADD_FUNC = "add func"
		const val PROP_1 = "prop1"
		const val PAR_1 = "par1"
		const val MIN_1 = "min1"
		const val MAX_1 = "max1"
		const val PROP_2 = "prop2"
		const val PAR_2 = "par2"
		const val MIN_2 = "min2"
		const val MAX_2 = "max2"
		const val PROP_3 = "prop3"
		const val PAR_3 = "par3"
		const val MIN_3 = "min3"
		const val MAX_3 = "max3"
		const val PROP_4 = "prop4"
		const val PAR_4 = "par4"
		const val MIN_4 = "min4"
		const val MAX_4 = "max4"
		const val PROP_5 = "prop5"
		const val PAR_5 = "par5"
		const val MIN_5 = "min5"
		const val MAX_5 = "max5"
		const val PROP_6 = "prop6"
		const val PAR_6 = "par6"
		const val MIN_6 = "min6"
		const val MAX_6 = "max6"
		const val PROP_7 = "prop7"
		const val PAR_7 = "par7"
		const val MIN_7 = "min7"
		const val MAX_7 = "max7"
		const val PROP_8 = "prop8"
		const val PAR_8 = "par8"
		const val MIN_8 = "min8"
		const val MAX_8 = "max8"
		const val PROP_9 = "prop9"
		const val PAR_9 = "par9"
		const val MIN_9 = "min9"
		const val MAX_9 = "max9"
		const val A_PROP_1_A = "aprop1a"
		const val A_PAR_1_A = "apar1a"
		const val A_MIN_1_A = "amin1a"
		const val A_MAX_1_A = "amax1a"
		const val A_PROP_1_B = "aprop1b"
		const val A_PAR_1_B = "apar1b"
		const val A_MIN_1_B = "amin1b"
		const val A_MAX_1_B = "amax1b"
		const val A_PROP_2_A = "aprop2a"
		const val A_PAR_2_A = "apar2a"
		const val A_MIN_2_A = "amin2a"
		const val A_MAX_2_A = "amax2a"
		const val A_PROP_2_B = "aprop2b"
		const val A_PAR_2_B = "apar2b"
		const val A_MIN_2_B = "amin2b"
		const val A_MAX_2_B = "amax2b"
		const val A_PROP_3_A = "aprop3a"
		const val A_PAR_3_A = "apar3a"
		const val A_MIN_3_A = "amin3a"
		const val A_MAX_3_A = "amax3a"
		const val A_PROP_3_B = "aprop3b"
		const val A_PAR_3_B = "apar3b"
		const val A_MIN_3_B = "amin3b"
		const val A_MAX_3_B = "amax3b"
		const val A_PROP_4_A = "aprop4a"
		const val A_PAR_4_A = "apar4a"
		const val A_MIN_4_A = "amin4a"
		const val A_MAX_4_A = "amax4a"
		const val A_PROP_4_B = "aprop4b"
		const val A_PAR_4_B = "apar4b"
		const val A_MIN_4_B = "amin4b"
		const val A_MAX_4_B = "amax4b"
		const val A_PROP_5_A = "aprop5a"
		const val A_PAR_5_A = "apar5a"
		const val A_MIN_5_A = "amin5a"
		const val A_MAX_5_A = "amax5a"
		const val A_PROP_5_B = "aprop5b"
		const val A_PAR_5_B = "apar5b"
		const val A_MIN_5_B = "amin5b"
		const val A_MAX_5_B = "amax5b"
		const val DIABLO_CLONE_WEIGHT = "diablocloneweight"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}