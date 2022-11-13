package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2LevelGroups(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "levelgroups") {

	companion object {
		
		private val HEADERS = listOf(
			"Name",
			"Id",
			"*StringName",
			"GroupName",
		)
		
		const val NAME = "Name"
		const val ID = "Id"
		const val STRING_NAME = "*StringName"
		const val GROUP_NAME = "GroupName"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}