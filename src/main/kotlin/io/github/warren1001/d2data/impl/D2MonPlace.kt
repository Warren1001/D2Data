package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonPlace(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "monplace") {
	
	companion object {
		
		private val HEADERS = listOf("code")
		
		const val CODE = "code"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}