package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2ItemStatCost(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "itemstatcost") {
	
	companion object {
		
		private val HEADERS = listOf("Stat", "*ID", "Send Other", "Signed", "Send Bits", "Send Param Bits", "UpdateAnimRate", "Saved", "CSvSigned", "CSvBits", "CSvParam", "fCallback", "fMin", "MinAccr", "Encode", "Add", "Multiply", "ValShift", "1.09-Save Bits", "1.09-Save Add", "Save Bits", "Save Add", "Save Param Bits", "keepzero", "op", "op param", "op base", "op stat1", "op stat2", "op stat3", "direct", "maxstat", "damagerelated", "itemevent1", "itemeventfunc1", "itemevent2", "itemeventfunc2", "descpriority", "descfunc", "descval", "descstrpos", "descstrneg", "descstr2", "dgrp", "dgrpfunc", "dgrpval", "dgrpstrpos", "dgrpstrneg", "dgrpstr2", "stuff", "advdisplay", "*eol")
		
		const val STAT = "Stat"
		const val ID = "*ID"
		const val SEND_OTHER = "Send Other"
		const val SIGNED = "Signed"
		const val SEND_BITS = "Send Bits"
		const val SEND_PARAM_BITS = "Send Param Bits"
		const val UPDATE_ANIM_RATE = "UpdateAnimRate"
		const val SAVED = "Saved"
		const val CSvSIGNED = "CSvSigned"
		const val CSvBITS = "CSvBits"
		const val CSvPARAM = "CSvParam"
		const val F_CALLBACK = "fCallback"
		const val F_MIN = "fMin"
		const val MIN_ACCR = "MinAccr"
		const val ENCODE = "Encode"
		const val ADD = "Add"
		const val MULTIPLY = "Multiply"
		const val VAL_SHIFT = "ValShift"
		const val SAVE_BITS_1_09 = "1.09-Save Bits"
		const val SAVE_ADD_1_09 = "1.09-Save Add"
		const val SAVE_BITS = "Save Bits"
		const val SAVE_ADD = "Save Add"
		const val SAVE_PARAM_BITS = "Save Param Bits"
		const val KEEP_ZERO = "keepzero"
		const val OP = "op"
		const val OP_PARAM = "op param"
		const val OP_BASE = "op base"
		const val OP_STAT_1 = "op stat1"
		const val OP_STAT_2 = "op stat2"
		const val OP_STAT_3 = "op stat3"
		const val DIRECT = "direct"
		const val MAX_STAT = "maxstat"
		const val DAMAGE_RELATED = "damagerelated"
		const val ITEM_EVENT_1 = "itemevent1"
		const val ITEM_EVENT_FUNC_1 = "itemeventfunc1"
		const val ITEM_EVENT_2 = "itemevent2"
		const val ITEM_EVENT_FUNC_2 = "itemeventfunc2"
		const val DESC_PRIORITY = "descpriority"
		const val DESC_FUNC = "descfunc"
		const val DESC_VAL = "descval"
		const val DESC_STR_POS = "descstrpos"
		const val DESC_STR_NEG = "descstrneg"
		const val DESC_STR_2 = "descstr2"
		const val DGRP = "dgrp"
		const val DGRP_FUNC = "dgrpfunc"
		const val DGRP_VAL = "dgrpval"
		const val DGRP_STR_POS = "dgrpstrpos"
		const val DGRP_STR_NEG = "dgrpstrneg"
		const val DGRP_STR_2 = "dgrpstr2"
		const val STUFF = "stuff"
		const val ADV_DISPLAY = "advdisplay"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}