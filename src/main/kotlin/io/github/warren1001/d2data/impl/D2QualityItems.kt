package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2QualityItems(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "qualityitems") {
	
	companion object {
		
		const val MOD_1_CODE = "mod1code"
		const val MOD_1_PARAM = "mod1param"
		const val MOD_1_MIN = "mod1min"
		const val MOD_1_MAX = "mod1max"
		const val MOD_2_CODE = "mod2code"
		const val MOD_2_PARAM = "mod2param"
		const val MOD_2_MIN = "mod2min"
		const val MOD_2_MAX = "mod2max"
		const val ARMOR = "armor"
		const val WEAPON = "weapon"
		const val SHIELD = "shield"
		const val SCEPTER = "scepter"
		const val WAND = "wand"
		const val STAFF = "staff"
		const val BOW = "bow"
		const val BOOTS = "boots"
		const val GLOVES = "gloves"
		const val BELT = "belt"
		
	}
	
}