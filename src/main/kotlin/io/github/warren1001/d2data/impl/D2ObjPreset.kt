package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2ObjPreset(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "objpreset") {
	
	companion object {
		
		private val HEADERS = listOf("Index", "Act", "ObjectClass", "*Notes", "*eol")
		
		const val INDEX = "Index"
		const val ACT = "Act"
		const val OBJECT_CLASS = "ObjectClass"
		const val NOTES = "*Notes"
		const val EOL = "*eol"
		
	}
	
	init { verify(HEADERS) }
	
}