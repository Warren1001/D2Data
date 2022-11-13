package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2WanderingMon(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "wanderingmon") {
	
	companion object {
		
		private val HEADERS = listOf("class")
		
		const val CLASS = "class"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}