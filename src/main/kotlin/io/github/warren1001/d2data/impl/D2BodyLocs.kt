package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2BodyLocs(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "bodylocs") {
	
	companion object {
		
		private val HEADERS = listOf("Body Location", "Code")
		
		const val BODY_LOCATION = "Body Location"
		const val CODE = "Code"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}