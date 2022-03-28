package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2LvlMaze(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "lvlmaze") {
	
	companion object {
		
		const val NAME = "Name"
		const val LEVEL = "Level"
		const val ROOMS = "Rooms"
		const val ROOMS_NIGHTMARE = "Rooms(N)"
		const val ROOMS_HELL = "Rooms(H)"
		const val SIZE_X = "SizeX"
		const val SIZE_Y = "SizeY"
		const val MERGE = "Merge"
		
	}
	
}