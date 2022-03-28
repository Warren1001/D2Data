package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2StorePage(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "storepage") {
	
	companion object {
		
		const val STORE_PAGE = "Store Page"
		const val CODE = "Code"
		
	}
	
}