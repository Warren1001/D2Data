package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2AutoMap(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "automap") {
	
	companion object {
		
		private val HEADERS = listOf("LevelName", "TileName", "Style", "StartSequence", "EndSequence", "*Type1", "Cel1", "*Type2", "Cel2", "*Type3", "Cel3", "*Type4", "Cel4")
		
		const val LEVEL_NAME = "LevelName"
		const val TILE_NAME = "TileName"
		const val STYLE = "Style"
		const val START_SEQUENCE = "StartSequence"
		const val END_SEQUENCE = "EndSequence"
		const val TYPE_1 = "*Type1"
		const val CEL_1 = "Cel1"
		const val TYPE_2 = "*Type2"
		const val CEL_2 = "Cel2"
		const val TYPE_3 = "*Type3"
		const val CEL_3 = "Cel3"
		const val TYPE_4 = "*Type4"
		const val CEL_4 = "Cel4"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}