package io.github.warren1001.d2data.enums

enum class D2ActInfo(override val header: String): D2Header {
	
	ACT("act"),
	TOWN("town"),
	START("start"),
	MAX_NPC_ITEM_LEVEL("maxnpcitemlevel"),
	CLASS_LEVEL_RANGE_START("classlevelrangestart"),
	CLASS_LEVEL_RANGE_END("classlevelrangeend"),
	WANDERING_NPC_START("wanderingnpcstart"),
	WANDERING_NPC_RANGE("wanderingnpcrange"),
	COMMON_ACT_COF("commonactcof"),
	WAYPOINT_1("waypoint1"),
	WAYPOINT_2("waypoint2"),
	WAYPOINT_3("waypoint3"),
	WAYPOINT_4("waypoint4"),
	WAYPOINT_5("waypoint5"),
	WAYPOINT_6("waypoint6"),
	WAYPOINT_7("waypoint7"),
	WAYPOINT_8("waypoint8"),
	WAYPOINT_9("waypoint9"),
	WANDERING_MONSTER_POPULATE_CHANCE("wanderingMonsterPopulateChance"),
	WANDERING_MONSTER_REGION_TOTAL("wanderingMonsterRegionTotal"),
	WANDERING_POPULATE_RANDOM_CHANCE("wanderingPopulateRandomChance");
	
	companion object {
		const val SHEET_NAME = "actinfo"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = ACT
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}