package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2SkillCalc(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "skillcalc") {
	
	companion object {
		
		private val HEADERS = listOf("code", "*Description")
		
		const val CODE = "code"
		const val DESCRIPTION = "*Description"
		
	}
	
	init { verify(HEADERS) }
	
}