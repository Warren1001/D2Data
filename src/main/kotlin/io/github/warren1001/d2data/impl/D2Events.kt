package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Events(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "events") {
	
	companion object {
		
		private val HEADERS = listOf("event", "*description")
		
		const val EVENT = "event"
		const val DESCRIPTION = "*description"
		
	}
	
	init { verify(HEADERS) }
	
}