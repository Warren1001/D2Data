package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2TreasureClassEx(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "treasureclassex") {
	
	companion object {
		
		private val HEADERS = listOf("Treasure Class", "group", "level", "Picks", "Unique", "Set", "Rare", "Magic", "NoDrop", "Item1", "Prob1", "Item2", "Prob2", "Item3", "Prob3", "Item4", "Prob4", "Item5", "Prob5", "Item6", "Prob6", "Item7", "Prob7", "Item8", "Prob8", "Item9", "Prob9", "Item10", "Prob10", "*ItemProbSum", "*ItemProbTotal", "*TreasureClassDropChance", "*eol")
		
		const val TREASURE_CLASS = "Treasure Class"
		const val GROUP = "group"
		const val LEVEL = "level"
		const val PICKS = "Picks"
		const val UNIQUE = "Unique"
		const val SET = "Set"
		const val RARE = "Rare"
		const val MAGIC = "Magic"
		const val NO_DROP = "NoDrop"
		const val ITEM_1 = "Item1"
		const val PROB_1 = "Prob1"
		const val ITEM_2 = "Item2"
		const val PROB_2 = "Prob2"
		const val ITEM_3 = "Item3"
		const val PROB_3 = "Prob3"
		const val ITEM_4 = "Item4"
		const val PROB_4 = "Prob4"
		const val ITEM_5 = "Item5"
		const val PROB_5 = "Prob5"
		const val ITEM_6 = "Item6"
		const val PROB_6 = "Prob6"
		const val ITEM_7 = "Item7"
		const val PROB_7 = "Prob7"
		const val ITEM_8 = "Item8"
		const val PROB_8 = "Prob8"
		const val ITEM_9 = "Item9"
		const val PROB_9 = "Prob9"
		const val ITEM_10 = "Item10"
		const val PROB_10 = "Prob10"
		const val ITEM_PROB_SUM = "*ItemProbSum"
		const val ITEM_PROB_TOTAL = "*ItemProbTotal"
		const val TREASURE_CLASS_DROP_CHANCE = "*TreasureClassDropChance"
		const val EOL = "*eol"
		
	}
	
	init { verify(HEADERS) }
	
}