package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2MonPreset(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "monpreset") {
	
	companion object {
		
		const val ACT = "Act"
		const val PLACE = "Place"
		
	}
	
}