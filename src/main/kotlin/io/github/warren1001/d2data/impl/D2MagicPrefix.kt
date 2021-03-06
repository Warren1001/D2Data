package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2MagicPrefix(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "magicprefix") {
	
	companion object {
		
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
	
	/*fun getFormattedList(): Map<String, String> {
		val map = mutableMapOf<String, String>()
		val properties = manager.getSheet(D2SheetManager.PROPERTIES)
		forEach { key ->
			val code = getValue(key, MOD_1_CODE)
			val min = getValue(key, MOD_1_MIN)
			val max = getValue(key, MOD_1_MAX)
			val propDesc = properties.getValue(code, D2Properties.TOOLTIP).replace("#", if (min == max) min else "$min-$max")
			println("$key: $propDesc")
		}
		return map
	}*/
	
}