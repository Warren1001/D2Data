package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2ObjGroup(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "objgroup") {
	
	companion object {
		
		private val HEADERS = listOf("GroupName", "*ID", "ID0", "DENSITY0", "PROB0", "ID1", "DENSITY1", "PROB1", "ID2", "DENSITY2", "PROB2", "ID3", "DENSITY3", "PROB3", "ID4", "DENSITY4", "PROB4", "ID5", "DENSITY5", "PROB5", "ID6", "DENSITY6", "PROB6", "ID7", "DENSITY7", "PROB7")
		
		const val GROUP_NAME = "GroupName"
		const val ID = "*ID"
		const val ID_0 = "ID0"
		const val DENSITY_0 = "DENSITY0"
		const val PROB_0 = "PROB0"
		const val ID_1 = "ID1"
		const val DENSITY_1 = "DENSITY1"
		const val PROB_1 = "PROB1"
		const val ID_2 = "ID2"
		const val DENSITY_2 = "DENSITY2"
		const val PROB_2 = "PROB2"
		const val ID_3 = "ID3"
		const val DENSITY_3 = "DENSITY3"
		const val PROB_3 = "PROB3"
		const val ID_4 = "ID4"
		const val DENSITY_4 = "DENSITY4"
		const val PROB_4 = "PROB4"
		const val ID_5 = "ID5"
		const val DENSITY_5 = "DENSITY5"
		const val PROB_5 = "PROB5"
		const val ID_6 = "ID6"
		const val DENSITY_6 = "DENSITY6"
		const val PROB_6 = "PROB6"
		const val ID_7 = "ID7"
		const val DENSITY_7 = "DENSITY7"
		const val PROB_7 = "PROB7"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}