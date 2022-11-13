package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonUMod(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "monumod") {
	
	companion object {
		
		private val HEADERS = listOf("uniquemod", "id", "enabled", "version", "xfer", "champion", "fPick", "exclude1", "exclude2", "cpick", "cpick (N)", "cpick (H)", "upick", "upick (N)", "upick (H)", "constants", "*constant desc", "*eol")
		
		const val UNIQUE_MOD = "uniquemod"
		const val ID = "id"
		const val ENABLED = "enabled"
		const val VERSION = "version"
		const val XFER = "xfer"
		const val CHAMPION = "champion"
		const val F_PICK = "fPick"
		const val EXCLUDE_1 = "exclude1"
		const val EXCLUDE_2 = "exclude2"
		const val CPICK = "cpick"
		const val CPICK_NIGHTMARE = "cpick (N)"
		const val CPICK_HELL = "cpick (H)"
		const val UPICK = "upick"
		const val UPICK_NIGHTMARE = "upick (N)"
		const val UPICK_HELL = "upick (H)"
		const val CONSTANTS = "constants"
		const val CONSTANT_DESC = "*constant desc"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}