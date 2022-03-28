package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2HitClass(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "hitclass") {
	
	companion object {
		
		const val HIT_CLASS = "Hit Class"
		const val CODE = "Code"
		
	}
	
}