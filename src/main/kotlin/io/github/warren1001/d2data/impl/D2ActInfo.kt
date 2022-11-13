package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2ActInfo(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "actinfo") {

	companion object {
		
		private val HEADERS = listOf(
			"act",
			"town",
			"start",
			"maxnpcitemlevel",
			"classlevelrangestart",
			"classlevelrangeend",
			"wanderingnpcstart",
			"wanderingnpcrange",
			"commonactcof",
			"waypoint1",
			"waypoint2",
			"waypoint3",
			"waypoint4",
			"waypoint5",
			"waypoint6",
			"waypoint7",
			"waypoint8",
			"waypoint9",
			"wanderingMonsterPopulateChance",
			"wanderingMonsterRegionTotal",
			"wanderingPopulateRandomChance"
		)
		
		const val ACT = "act"
		const val TOWN = "town"
		const val START = "start"
		const val MAX_NPC_ITEM_LEVEL = "maxnpcitemlevel"
		const val CLASS_LEVEL_RANGE_START = "classlevelrangestart"
		const val CLASS_LEVEL_RANGE_END = "classlevelrangeend"
		const val WANDERING_NPC_START = "wanderingnpcstart"
		const val WANDERING_NPC_RANGE = "wanderingnpcrange"
		const val COMMON_ACT_COF = "commonactcof"
		const val WAYPOINT_1 = "waypoint1"
		const val WAYPOINT_2 = "waypoint2"
		const val WAYPOINT_3 = "waypoint3"
		const val WAYPOINT_4 = "waypoint4"
		const val WAYPOINT_5 = "waypoint5"
		const val WAYPOINT_6 = "waypoint6"
		const val WAYPOINT_7 = "waypoint7"
		const val WAYPOINT_8 = "waypoint8"
		const val WAYPOINT_9 = "waypoint9"
		const val WANDERING_MONSTER_POPULATE_CHANCE = "wanderingMonsterPopulateChance"
		const val WANDERING_MONSTER_REGION_TOTAL = "wanderingMonsterRegionTotal"
		const val WANDERING_POPULATE_RANDOM_CHANCE = "wanderingPopulateRandomChance"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}