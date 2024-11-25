package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2LvlSub(header: String, vararg headerHistory: String): D2Header {
	
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
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/lvlsub.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = NAME
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}