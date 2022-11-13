package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2PlayerClass(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "playerclass") {
	
	companion object {
		
		private val HEADERS = listOf("Player Class", "Code")
		
		const val PLAYER_CLASS = "Player Class"
		const val CODE = "Code"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}