package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2PlrMode(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "plrmode") {
	
	companion object {
		
		private val HEADERS = listOf("Name", "Token", "Code")
		
		const val NAME = "Name"
		const val TOKEN = "Token"
		const val CODE = "Code"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}