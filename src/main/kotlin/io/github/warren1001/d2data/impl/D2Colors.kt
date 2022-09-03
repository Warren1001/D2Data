package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Colors(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "colors") {
	
	companion object {
		
		private val HEADERS = listOf("Transform Color", "Code")
		
		const val TRANSFORM_COLOR = "Transform Color"
		const val CODE = "Code"
		
	}
	
	init { verify(HEADERS) }
	
}