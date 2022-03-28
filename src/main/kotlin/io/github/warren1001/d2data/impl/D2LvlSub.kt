package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2LvlSub(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "lvlsub") {
	
	companion object {
		
		const val NAME = "Name"
		const val TYPE = "Type"
		const val FILE = "File"
		const val CHECK_ALL = "CheckAll"
		const val BORD_TYPE = "BordType"
		const val GRID_SIZE = "GridSize"
		const val DT_1_MASK = "Dt1Mask"
		const val PROB_0 = "Prob0"
		const val TRIALS_0 = "Trials0"
		const val MAX_0 = "Max0"
		const val PROB_1 = "Prob1"
		const val TRIALS_1 = "Trials1"
		const val MAX_1 = "Max1"
		const val PROB_2 = "Prob2"
		const val TRIALS_2 = "Trials2"
		const val MAX_2 = "Max2"
		const val PROB_3 = "Prob3"
		const val TRIALS_3 = "Trials3"
		const val MAX_3 = "Max3"
		const val PROB_4 = "Prob4"
		const val TRIALS_4 = "Trials4"
		const val MAX_4 = "Max4"
		
	}
	
}