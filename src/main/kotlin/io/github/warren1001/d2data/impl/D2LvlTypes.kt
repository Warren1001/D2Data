package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2LvlTypes(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "lvltypes") {
	
	companion object {
		
		private val HEADERS = listOf("Name", "Id", "File 1", "File 2", "File 3", "File 4", "File 5", "File 6", "File 7", "File 8", "File 9", "File 10", "File 11", "File 12", "File 13", "File 14", "File 15", "File 16", "File 17", "File 18", "File 19", "File 20", "File 21", "File 22", "File 23", "File 24", "File 25", "File 26", "File 27", "File 28", "File 29", "File 30", "File 31", "File 32", "Act")
		
		const val NAME = "Name"
		const val ID = "Id"
		const val FILE_1 = "File 1"
		const val FILE_2 = "File 2"
		const val FILE_3 = "File 3"
		const val FILE_4 = "File 4"
		const val FILE_5 = "File 5"
		const val FILE_6 = "File 6"
		const val FILE_7 = "File 7"
		const val FILE_8 = "File 8"
		const val FILE_9 = "File 9"
		const val FILE_10 = "File 10"
		const val FILE_11 = "File 11"
		const val FILE_12 = "File 12"
		const val FILE_13 = "File 13"
		const val FILE_14 = "File 14"
		const val FILE_15 = "File 15"
		const val FILE_16 = "File 16"
		const val FILE_17 = "File 17"
		const val FILE_18 = "File 18"
		const val FILE_19 = "File 19"
		const val FILE_20 = "File 20"
		const val FILE_21 = "File 21"
		const val FILE_22 = "File 22"
		const val FILE_23 = "File 23"
		const val FILE_24 = "File 24"
		const val FILE_25 = "File 25"
		const val FILE_26 = "File 26"
		const val FILE_27 = "File 27"
		const val FILE_28 = "File 28"
		const val FILE_29 = "File 29"
		const val FILE_30 = "File 30"
		const val FILE_31 = "File 31"
		const val FILE_32 = "File 32"
		const val ACT = "Act"
		
	}
	
	init { verify(HEADERS) }
	
}