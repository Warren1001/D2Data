package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2LvlPrest(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "lvlprest") {
	
	companion object {
		
		const val NAME = "Name"
		const val DEF = "Def"
		const val LEVEL_ID = "LevelId"
		const val POPULATE = "Populate"
		const val LOGICALS = "Logicals"
		const val OUTDOORS = "Outdoors"
		const val ANIMATE = "Animate"
		const val KILL_EDGE = "KillEdge"
		const val FILL_BLANKS = "FillBlanks"
		const val SIZE_X = "SizeX"
		const val SIZE_Y = "SizeY"
		const val AUTO_MAP = "AutoMap"
		const val SCAN = "Scan"
		const val POPS = "Pops"
		const val POP_PAD = "PopPad"
		const val FILES = "Files"
		const val FILE_1 = "File1"
		const val FILE_2 = "File2"
		const val FILE_3 = "File3"
		const val FILE_4 = "File4"
		const val FILE_5 = "File5"
		const val FILE_6 = "File6"
		const val DT_1_MASK = "Dt1Mask"
		
	}
	
}