package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonPreset(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "monpreset") {
	
	companion object {
		
		private val HEADERS = listOf("Act", "Place")
		
		const val ACT = "Act"
		const val PLACE = "Place"
		
	}
	
	init { verify(HEADERS) }
	
}