package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2ItemStatCost(override val header: String): D2Header {
	
	STAT("Stat"),
	ID("*ID"),
	SEND_OTHER("Send Other"),
	SIGNED("Signed"),
	SEND_BITS("Send Bits"),
	SEND_PARAM_BITS("Send Param Bits"),
	UPDATE_ANIM_RATE("UpdateAnimRate"),
	SAVED("Saved"),
	CSvSIGNED("CSvSigned"),
	CSvBITS("CSvBits"),
	CSvPARAM("CSvParam"),
	F_CALLBACK("fCallback"),
	F_MIN("fMin"),
	MIN_ACCR("MinAccr"),
	ENCODE("Encode"),
	ADD("Add"),
	MULTIPLY("Multiply"),
	VAL_SHIFT("ValShift"),
	SAVE_BITS_1_09("1.09-Save Bits"),
	SAVE_ADD_1_09("1.09-Save Add"),
	SAVE_BITS("Save Bits"),
	SAVE_ADD("Save Add"),
	SAVE_PARAM_BITS("Save Param Bits"),
	KEEP_ZERO("keepzero"),
	OP("op"),
	OP_PARAM("op param"),
	OP_BASE("op base"),
	OP_STAT_1("op stat1"),
	OP_STAT_2("op stat2"),
	OP_STAT_3("op stat3"),
	DIRECT("direct"),
	MAX_STAT("maxstat"),
	DAMAGE_RELATED("damagerelated"),
	ITEM_EVENT_1("itemevent1"),
	ITEM_EVENT_FUNC_1("itemeventfunc1"),
	ITEM_EVENT_2("itemevent2"),
	ITEM_EVENT_FUNC_2("itemeventfunc2"),
	DESC_PRIORITY("descpriority"),
	DESC_FUNC("descfunc"),
	DESC_VAL("descval"),
	DESC_STR_POS("descstrpos"),
	DESC_STR_NEG("descstrneg"),
	DESC_STR_2("descstr2"),
	DGRP("dgrp"),
	DGRP_FUNC("dgrpfunc"),
	DGRP_VAL("dgrpval"),
	DGRP_STR_POS("dgrpstrpos"),
	DGRP_STR_NEG("dgrpstrneg"),
	DGRP_STR_2("dgrpstr2"),
	STUFF("stuff"),
	ADV_DISPLAY("advdisplay"),
	EOL("*eol");
	
	companion object {
		val FILE_PATH = "global/excel/itemstatcost.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = STAT
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}