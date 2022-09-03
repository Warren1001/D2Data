package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonType(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "montype") {
	
	companion object {
		
		private val HEADERS = listOf("type", "equiv1", "equiv2", "equiv3", "strplur", "element", "*eol")
		
		const val TYPE = "type"
		const val EQUIV_1 = "equiv1"
		const val EQUIV_2 = "equiv2"
		const val EQUIV_3 = "equiv3"
		const val STRPLUR = "strplur"
		const val ELEMENT = "element"
		const val EOL = "*eol"
		
	}
	
	init { verify(HEADERS) }
	
}