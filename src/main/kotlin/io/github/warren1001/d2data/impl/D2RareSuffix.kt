package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2RareSuffix(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "raresuffix") {
	
	companion object {
		
		private val HEADERS = listOf("name", "version", "itype1", "itype2", "itype3", "itype4", "itype5", "itype6", "itype7", "etype1", "etype2", "etype3", "etype4")
		
		const val NAME = "name"
		const val VERSION = "version"
		const val I_TYPE_1 = "itype1"
		const val I_TYPE_2 = "itype2"
		const val I_TYPE_3 = "itype3"
		const val I_TYPE_4 = "itype4"
		const val I_TYPE_5 = "itype5"
		const val I_TYPE_6 = "itype6"
		const val I_TYPE_7 = "itype7"
		const val E_TYPE_1 = "etype1"
		const val E_TYPE_2 = "etype2"
		const val E_TYPE_3 = "etype3"
		const val E_TYPE_4 = "etype4"
		
	}
	
	init { verify(HEADERS) }
	
}