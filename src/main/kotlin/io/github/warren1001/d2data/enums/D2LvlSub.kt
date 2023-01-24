package io.github.warren1001.d2data.enums

enum class D2LvlSub(val header: String) {
	
	NAME("Name"),
	TYPE("Type"),
	FILE("File"),
	CHECK_ALL("CheckAll"),
	BORD_TYPE("BordType"),
	GRID_SIZE("GridSize"),
	DT_1_MASK("Dt1Mask"),
	PROB_0("Prob0"),
	TRIALS_0("Trials0"),
	MAX_0("Max0"),
	PROB_1("Prob1"),
	TRIALS_1("Trials1"),
	MAX_1("Max1"),
	PROB_2("Prob2"),
	TRIALS_2("Trials2"),
	MAX_2("Max2"),
	PROB_3("Prob3"),
	TRIALS_3("Trials3"),
	MAX_3("Max3"),
	PROB_4("Prob4"),
	TRIALS_4("Trials4"),
	MAX_4("Max4");
	
	companion object {
		const val SHEET_NAME = "lvlsub"
		val HEADERS = values().map { it.header }
	}
	
}