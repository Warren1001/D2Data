package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2ElemTypes(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "elemtypes") {
	
	companion object {
		
		private val HEADERS = listOf("Elemental Type", "Code")
		
		const val ELEMENTAL_TYPE = "Elemental Type"
		const val CODE = "Code"
		
	}
	
	init { verify(HEADERS) }
	
}