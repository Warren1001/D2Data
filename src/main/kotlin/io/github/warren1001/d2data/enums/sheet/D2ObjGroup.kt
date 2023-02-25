package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2ObjGroup(override val header: String): D2Header {
	
	GROUP_NAME("GroupName"),
	ID("*ID"),
	ID_0("ID0"),
	DENSITY_0("DENSITY0"),
	PROB_0("PROB0"),
	ID_1("ID1"),
	DENSITY_1("DENSITY1"),
	PROB_1("PROB1"),
	ID_2("ID2"),
	DENSITY_2("DENSITY2"),
	PROB_2("PROB2"),
	ID_3("ID3"),
	DENSITY_3("DENSITY3"),
	PROB_3("PROB3"),
	ID_4("ID4"),
	DENSITY_4("DENSITY4"),
	PROB_4("PROB4"),
	ID_5("ID5"),
	DENSITY_5("DENSITY5"),
	PROB_5("PROB5"),
	ID_6("ID6"),
	DENSITY_6("DENSITY6"),
	PROB_6("PROB6"),
	ID_7("ID7"),
	DENSITY_7("DENSITY7"),
	PROB_7("PROB7");
	
	companion object {
		val FILE_PATH = "global/excel/objgroup.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = ID
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}