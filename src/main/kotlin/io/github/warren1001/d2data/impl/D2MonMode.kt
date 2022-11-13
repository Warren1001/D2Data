package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonMode(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "monmode") {
	
	companion object {
		
		private val HEADERS = listOf("name", "token", "code")
		
		const val NAME = "name"
		const val TOKEN = "token"
		const val CODE = "code"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}