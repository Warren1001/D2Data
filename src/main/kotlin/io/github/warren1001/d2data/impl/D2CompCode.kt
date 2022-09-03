package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2CompCode(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "compcode") {
	
	companion object {
		
		private val HEADERS = listOf("component", "code")
		
		const val COMPONENT = "component"
		const val CODE = "code"
		
	}
	
	init { verify(HEADERS) }
	
}