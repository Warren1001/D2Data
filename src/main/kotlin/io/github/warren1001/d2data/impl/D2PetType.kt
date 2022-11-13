package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2PetType(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "pettype") {
	
	companion object {
		
		private val HEADERS = listOf("pet type", "group", "basemax", "warp", "range", "partysend", "unsummon", "automap", "name", "drawhp", "icontype", "baseicon", "mclass1", "micon1", "mclass2", "micon2", "mclass3", "micon3", "mclass4", "micon4")
		
		const val PET_TYPE = "pet type"
		const val GROUP = "group"
		const val BASE_MAX = "basemax"
		const val WARP = "warp"
		const val RANGE = "range"
		const val PARTY_SEND = "partysend"
		const val UNSUMMON = "unsummon"
		const val AUTOMAP = "automap"
		const val NAME = "name"
		const val DRAW_HP = "drawhp"
		const val ICON_TYPE = "icontype"
		const val BASE_ICON = "baseicon"
		const val M_CLASS_1 = "mclass1"
		const val M_ICON_1 = "micon1"
		const val M_CLASS_2 = "mclass2"
		const val M_ICON_2 = "micon2"
		const val M_CLASS_3 = "mclass3"
		const val M_ICON_3 = "micon3"
		const val M_CLASS_4 = "mclass4"
		const val M_ICON_4 = "micon4"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}