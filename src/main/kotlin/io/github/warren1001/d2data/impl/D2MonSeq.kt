package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonSeq(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "monseq") {
	
	companion object {
		
		private val HEADERS = listOf("sequence", "mode", "frame", "dir", "event", "*eol")
		
		const val SEQUENCE = "sequence"
		const val MODE = "mode"
		const val FRAME = "frame"
		const val DIR = "dir"
		const val EVENT = "event"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}