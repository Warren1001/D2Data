package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2ItemRatio(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "itemratio") {
	
	companion object {
		
		private val HEADERS = listOf("Function", "Version", "Uber", "Class Specific", "Unique", "UniqueDivisor", "UniqueMin", "Rare", "RareDivisor", "RareMin", "Set", "SetDivisor", "SetMin", "Magic", "MagicDivisor", "MagicMin", "HiQuality", "HiQualityDivisor", "Normal", "NormalDivisor")
		
		const val FUNCTION = "Function"
		const val VERSION = "Version"
		const val UBER = "Uber"
		const val CLASS_SPECIFIC = "Class Specific"
		const val UNIQUE = "Unique"
		const val UNIQUE_DIVISOR = "UniqueDivisor"
		const val UNIQUE_MIN = "UniqueMin"
		const val RARE = "Rare"
		const val RARE_DIVISOR = "RareDivisor"
		const val RARE_MIN = "RareMin"
		const val SET = "Set"
		const val SET_DIVISOR = "SetDivisor"
		const val SET_MIN = "SetMin"
		const val MAGIC = "Magic"
		const val MAGIC_DIVISOR = "MagicDivisor"
		const val MAGIC_MIN = "MagicMin"
		const val HI_QUALITY = "HiQuality"
		const val HI_QUALITY_DIVISOR = "HiQualityDivisor"
		const val NORMAL = "Normal"
		const val NORMAL_DIVISOR = "NormalDivisor"
		
	}
	
	init { verify(HEADERS) }
	
}