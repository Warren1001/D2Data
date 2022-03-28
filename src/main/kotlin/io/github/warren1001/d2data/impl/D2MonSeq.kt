package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2MonSeq(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "monseq") {
	
	companion object {
		
		const val SEQUENCE = "sequence"
		const val MODE = "mode"
		const val FRAME = "frame"
		const val DIR = "dir"
		const val EVENT = "event"
		const val EOL = "*eol"
		
	}
	
}