package io.github.warren1001.d2data.enums

enum class D2TreasureClassEx(val header: String) {
	
	TREASURE_CLASS("Treasure Class"),
	GROUP("group"),
	LEVEL("level"),
	PICKS("Picks"),
	UNIQUE("Unique"),
	SET("Set"),
	RARE("Rare"),
	MAGIC("Magic"),
	NO_DROP("NoDrop"),
	ITEM_1("Item1"),
	PROB_1("Prob1"),
	ITEM_2("Item2"),
	PROB_2("Prob2"),
	ITEM_3("Item3"),
	PROB_3("Prob3"),
	ITEM_4("Item4"),
	PROB_4("Prob4"),
	ITEM_5("Item5"),
	PROB_5("Prob5"),
	ITEM_6("Item6"),
	PROB_6("Prob6"),
	ITEM_7("Item7"),
	PROB_7("Prob7"),
	ITEM_8("Item8"),
	PROB_8("Prob8"),
	ITEM_9("Item9"),
	PROB_9("Prob9"),
	ITEM_10("Item10"),
	PROB_10("Prob10"),
	ITEM_PROB_SUM("*ItemProbSum"),
	ITEM_PROB_TOTAL("*ItemProbTotal"),
	TREASURE_CLASS_DROP_CHANCE("*TreasureClassDropChance"),
	LADDER("ladder"),
	NO_ALWAYS_SPAWN("noAlwaysSpawn"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "treasureclassex"
		val HEADERS = values().map { it.header }
	}
	
}