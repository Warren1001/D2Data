package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MissCalc(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "misscalc") {
	
	companion object {
		
		private val HEADERS = listOf("code", "*description")
		
		const val CODE = "code"
		const val DESCRIPTION = "*description"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}