package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Gamble(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "gamble") {
	
	companion object {
		
		private val HEADERS = listOf("name", "code")
		
		const val NAME = "name"
		const val CODE = "code"
		
	}
	
	init { verify(HEADERS) }
	
}