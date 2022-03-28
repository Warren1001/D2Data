package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2Gamble(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "gamble") {
	
	companion object {
		
		const val NAME = "name"
		const val CODE = "code"
		
	}
	
}