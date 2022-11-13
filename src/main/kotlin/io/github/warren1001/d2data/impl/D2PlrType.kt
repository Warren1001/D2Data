package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2PlrType(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "plrtype") {
	
	companion object {
		
		private val HEADERS = listOf("Name", "Token")
		
		const val NAME = "Name"
		const val TOKEN = "Token"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}