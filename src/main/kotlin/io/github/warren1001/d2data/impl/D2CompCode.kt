package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2CompCode(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "compcode") {
	
	companion object {
		
		const val COMPONENT = "component"
		const val CODE = "code"
		
	}
	
}