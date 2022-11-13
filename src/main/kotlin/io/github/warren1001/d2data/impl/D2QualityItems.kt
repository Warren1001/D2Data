package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2QualityItems(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "qualityitems") {
	
	companion object {
		
		private val HEADERS = listOf("mod1code", "mod1param", "mod1min", "mod1max", "mod2code", "mod2param", "mod2min", "mod2max", "armor", "weapon", "shield", "scepter", "wand", "staff", "bow", "boots", "gloves", "belt")
		
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
	
	override fun getTrueHeaders() = HEADERS
	
}