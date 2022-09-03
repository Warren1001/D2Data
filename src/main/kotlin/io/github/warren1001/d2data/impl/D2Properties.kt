package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Properties(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "properties") {
	
	companion object {
		
		private val HEADERS = listOf("code", "*Enabled", "func1", "stat1", "set1", "val1", "func2", "stat2", "set2", "val2", "func3", "stat3", "set3", "val3", "func4", "stat4", "set4", "val4", "func5", "stat5", "set5", "val5", "func6", "stat6", "set6", "val6", "func7", "stat7", "set7", "val7", "*Tooltip", "*Parameter", "*Min", "*Max", "*Notes", "*eol")
		
		const val CODE = "code"
		const val ENABLED = "*Enabled"
		const val FUNC_1 = "func1"
		const val STAT_1 = "stat1"
		const val SET_1 = "set1"
		const val VAL_1 = "val1"
		const val FUNC_2 = "func2"
		const val STAT_2 = "stat2"
		const val SET_2 = "set2"
		const val VAL_2 = "val2"
		const val FUNC_3 = "func3"
		const val STAT_3 = "stat3"
		const val SET_3 = "set3"
		const val VAL_3 = "val3"
		const val FUNC_4 = "func4"
		const val STAT_4 = "stat4"
		const val SET_4 = "set4"
		const val VAL_4 = "val4"
		const val FUNC_5 = "func5"
		const val STAT_5 = "stat5"
		const val SET_5 = "set5"
		const val VAL_5 = "val5"
		const val FUNC_6 = "func6"
		const val STAT_6 = "stat6"
		const val SET_6 = "set6"
		const val VAL_6 = "val6"
		const val FUNC_7 = "func7"
		const val STAT_7 = "stat7"
		const val SET_7 = "set7"
		const val VAL_7 = "val7"
		const val TOOLTIP = "*Tooltip"
		const val PARAMETER = "*Parameter"
		const val MIN = "*Min"
		const val MAX = "*Max"
		const val NOTES = "*Notes"
		const val EOL = "*eol"
		
	}
	
	init { verify(HEADERS) }
	
}