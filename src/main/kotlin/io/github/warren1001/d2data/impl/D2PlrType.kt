package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2PlrType(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "plrtype") {
	
	companion object {
		
		const val NAME = "Name"
		const val TOKEN = "Token"
		
	}
	
}