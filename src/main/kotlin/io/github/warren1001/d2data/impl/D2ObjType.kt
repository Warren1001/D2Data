package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2ObjType(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "objtype") {
	
	companion object {
		
		private val HEADERS = listOf("Name", "Token")
		
		const val NAME = "Name"
		const val TOKEN = "Token"
		
	}
	
	init { verify(HEADERS) }
	
}