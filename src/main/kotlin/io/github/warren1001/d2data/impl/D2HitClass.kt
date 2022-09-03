package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2HitClass(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "hitclass") {
	
	companion object {
		
		private val HEADERS = listOf("Hit Class", "Code")
		
		const val HIT_CLASS = "Hit Class"
		const val CODE = "Code"
		
	}
	
	init { verify(HEADERS) }
	
}