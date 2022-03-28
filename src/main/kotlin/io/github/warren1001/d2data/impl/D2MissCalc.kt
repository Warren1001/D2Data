package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2MissCalc(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "misscalc") {
	
	companion object {
		
		const val CODE = "code"
		const val DESCRIPTION = "*description"
		
	}
	
}