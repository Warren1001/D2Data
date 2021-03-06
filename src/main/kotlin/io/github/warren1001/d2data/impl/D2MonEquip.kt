package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2MonEquip(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "monequip") {
	
	companion object {
		
		const val MONSTER = "monster"
		const val ON_INIT = "oninit"
		const val LEVEL = "level"
		const val ITEM_1 = "item1"
		const val LOC_1 = "loc1"
		const val MOD_1 = "mod1"
		const val ITEM_2 = "item2"
		const val LOC_2 = "loc2"
		const val MOD_2 = "mod2"
		const val ITEM_3 = "item3"
		const val LOC_3 = "loc3"
		const val MOD_3 = "mod3"
		const val EOL = "*eol"
		
	}
	
}