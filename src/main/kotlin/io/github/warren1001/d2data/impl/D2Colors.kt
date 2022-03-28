package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2Colors(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "colors") {
	
	companion object {
		
		const val TRANSFORM_COLOR = "Transform Color"
		const val CODE = "Code"
		
	}
	
}