package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2StorePage(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "storepage") {
	
	companion object {
		
		private val HEADERS = listOf("Store Page", "Code")
		
		const val STORE_PAGE = "Store Page"
		const val CODE = "Code"
		
	}
	
	init { verify(HEADERS) }
	
}