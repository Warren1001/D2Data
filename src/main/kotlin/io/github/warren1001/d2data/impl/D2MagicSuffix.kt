package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MagicSuffix(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "magicsuffix") {
	
	companion object {
		
		private val HEADERS = listOf("Name", "version", "spawnable", "rare", "level", "maxlevel", "levelreq", "classspecific", "class", "classlevelreq", "frequency", "group", "mod1code", "mod1param", "mod1min", "mod1max", "mod2code", "mod2param", "mod2min", "mod2max", "mod3code", "mod3param", "mod3min", "mod3max", "transformcolor", "itype1", "itype2", "itype3", "itype4", "itype5", "itype6", "itype7", "etype1", "etype2", "etype3", "etype4", "etype5", "multiply", "add")
		
		const val NAME = "Name"
		const val VERSION = "version"
		const val SPAWNABLE = "spawnable"
		const val RARE = "rare"
		const val LEVEL = "level"
		const val MAX_LEVEL = "maxlevel"
		const val LEVEL_REQ = "levelreq"
		const val CLASS_SPECIFIC = "classspecific"
		const val CLASS = "class"
		const val CLASS_LEVEL_REQ = "classlevelreq"
		const val FREQUENCY = "frequency"
		const val GROUP = "group"
		const val MOD_1_CODE = "mod1code"
		const val MOD_1_PARAM = "mod1param"
		const val MOD_1_MIN = "mod1min"
		const val MOD_1_MAX = "mod1max"
		const val MOD_2_CODE = "mod2code"
		const val MOD_2_PARAM = "mod2param"
		const val MOD_2_MIN = "mod2min"
		const val MOD_2_MAX = "mod2max"
		const val MOD_3_CODE = "mod3code"
		const val MOD_3_PARAM = "mod3param"
		const val MOD_3_MIN = "mod3min"
		const val MOD_3_MAX = "mod3max"
		const val TRANSFORM_COLOR = "transformcolor"
		const val ITYPE_1 = "itype1"
		const val ITYPE_2 = "itype2"
		const val ITYPE_3 = "itype3"
		const val ITYPE_4 = "itype4"
		const val ITYPE_5 = "itype5"
		const val ITYPE_6 = "itype6"
		const val ITYPE_7 = "itype7"
		const val ETYPE_1 = "etype1"
		const val ETYPE_2 = "etype2"
		const val ETYPE_3 = "etype3"
		const val ETYPE_4 = "etype4"
		const val ETYPE_5 = "etype5"
		const val MULTIPLY = "multiply"
		const val ADD = "add"
		
	}
	
	init { verify(HEADERS) }
	
}