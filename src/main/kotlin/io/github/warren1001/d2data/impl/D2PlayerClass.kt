package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2PlayerClass(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "playerclass") {
	
	companion object {
		
		const val PLAYER_CLASS = "Player Class"
		const val CODE = "Code"
		
	}
	
}