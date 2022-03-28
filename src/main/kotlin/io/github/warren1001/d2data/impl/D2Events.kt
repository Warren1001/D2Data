package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2Events(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "events") {
	
	companion object {
		
		const val EVENT = "event"
		const val DESCRIPTION = "*description"
		
	}
	
}