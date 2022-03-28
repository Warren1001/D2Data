package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2ObjPreset(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "objpreset") {
	
	companion object {
		
		const val INDEX = "Index"
		const val ACT = "Act"
		const val OBJECT_CLASS = "ObjectClass"
		const val NOTES = "*Notes"
		const val EOL = "*eol"
		
	}
	
}