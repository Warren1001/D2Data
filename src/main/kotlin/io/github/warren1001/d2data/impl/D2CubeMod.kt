package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2CubeMod(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "cubemod") {
	
	companion object {
		
		private val HEADERS = listOf("cube modifier type", "Code")
		
		const val CUBE_MODIFIER_TYPE = "cube modifier type"
		const val CODE = "Code"
		
	}
	
	init { verify(HEADERS) }
	
}