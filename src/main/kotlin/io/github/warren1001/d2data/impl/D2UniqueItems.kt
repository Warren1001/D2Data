package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2UniqueItems(manager: D2Sheets, dir: File) : D2Sheet(manager, dir, "uniqueitems") {
	
	companion object {
		
		private val HEADERS = listOf(
			"index",
			"*ID",
			"version",
			"enabled",
			"ladder",
			"rarity",
			"nolimit",
			"lvl",
			"lvl req",
			"code",
			"*ItemName",
			"carry1",
			"cost mult",
			"cost add",
			"chrtransform",
			"invtransform",
			"flippyfile",
			"invfile",
			"dropsound",
			"dropsfxframe",
			"usesound",
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
			"prop10",
			"par10",
			"min10",
			"max10",
			"prop11",
			"par11",
			"min11",
			"max11",
			"prop12",
			"par12",
			"min12",
			"max12",
			"diablocloneweight",
			"*eol"
		)
		
		const val INDEX = "index"
		const val ID = "*ID"
		const val VERSION = "version"
		const val ENABLED = "enabled"
		const val LADDER = "ladder"
		const val RARITY = "rarity"
		const val NO_LIMIT = "nolimit"
		const val LVL = "lvl"
		const val LVL_REQ = "lvl req"
		const val CODE = "code"
		const val ITEM_NAME = "*ItemName"
		const val CARRY_1 = "carry1"
		const val COST_MULT = "cost mult"
		const val COST_ADD = "cost add"
		const val CHR_TRANSFORM = "chrtransform"
		const val INV_TRANSFORM = "invtransform"
		const val FLIPPY_FILE = "flippyfile"
		const val INV_FILE = "invfile"
		const val DROP_SOUND = "dropsound"
		const val DROP_SFX_FRAME = "dropsfxframe"
		const val USE_SOUND = "usesound"
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
		const val PROP_10 = "prop10"
		const val PAR_10 = "par10"
		const val MIN_10 = "min10"
		const val MAX_10 = "max10"
		const val PROP_11 = "prop11"
		const val PAR_11 = "par11"
		const val MIN_11 = "min11"
		const val MAX_11 = "max11"
		const val PROP_12 = "prop12"
		const val PAR_12 = "par12"
		const val MIN_12 = "min12"
		const val MAX_12 = "max12"
		const val DIABLO_CLONE_WEIGHT = "diablocloneweight"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}