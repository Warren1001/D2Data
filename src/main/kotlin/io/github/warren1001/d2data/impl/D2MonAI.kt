package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2MonAI(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "monai") {
	
	companion object {
		
		const val AI = "AI"
		const val AIP_1 = "*aip1"
		const val AIP_2 = "*aip2"
		const val AIP_3 = "*aip3"
		const val AIP_4 = "*aip4"
		const val AIP_5 = "*aip5"
		const val AIP_6 = "*aip6"
		const val AIP_7 = "*aip7"
		const val AIP_8 = "*aip8"
		const val EOL = "*eol"
		
	}
	
}