package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2LowQualityItems(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "lowqualityitems") {
	
	companion object {
		
		private val HEADERS = listOf("Name")
		
		const val NAME = "Name"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}