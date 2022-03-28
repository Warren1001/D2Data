package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2Shrines(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "shrines") {
	
	companion object {
		
		const val NAME = "Name"
		const val SHRINE_TYPE = "*Shrine Type"
		const val EFFECT = "*Effect"
		const val CODE = "Code"
		const val ARG_0 = "Arg0"
		const val ARG_1 = "Arg1"
		const val DURATION_IN_FRAMES = "Duration in frames"
		const val RESET_TIME_IN_MINUTES = "reset time in minutes"
		const val RARITY = "rarity"
		const val STRING_NAME = "StringName"
		const val STRING_PHRASE = "StringPhrase"
		const val EFFECTCLASS = "effectclass"
		const val LEVEL_MIN = "LevelMin"
		
	}
	
}