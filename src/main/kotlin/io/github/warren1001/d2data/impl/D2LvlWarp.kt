package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2LvlWarp(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "lvlwarp") {
	
	companion object {
		
		const val NAME = "Name"
		const val ID = "Id"
		const val SELECT_X = "SelectX"
		const val SELECT_Y = "SelectY"
		const val SELECT_DX = "SelectDX"
		const val SELECT_DY = "SelectDY"
		const val EXIT_WALK_X = "ExitWalkX"
		const val EXIT_WALK_Y = "ExitWalkY"
		const val OFFSET_X = "OffsetX"
		const val OFFSET_Y = "OffsetY"
		const val LIT_VERSION = "LitVersion"
		const val TILES = "Tiles"
		const val NO_INTERACT = "NoInteract"
		const val DIRECTION = "Direction"
		const val UNIQUE_ID = "UniqueId"
		
	}
	
}