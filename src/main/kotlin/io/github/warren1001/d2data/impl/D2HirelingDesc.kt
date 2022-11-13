package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2HirelingDesc(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "hirelingdesc") {

	companion object {
		
		private val HEADERS = listOf(
			"id",
			"*hcIdx",
			"alternateVoice",
			"*eol",
		)
		
		const val ID = "id"
		const val HCIDX = "*hcIdx"
		const val ALTERNATE_VOICE = "alternateVoice"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}