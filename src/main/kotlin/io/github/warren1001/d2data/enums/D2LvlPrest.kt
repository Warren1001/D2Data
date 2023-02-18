package io.github.warren1001.d2data.enums

enum class D2LvlPrest(override val header: String): D2Header {
	
	NAME("Name"),
	DEF("Def"),
	LEVEL_ID("LevelId"),
	POPULATE("Populate"),
	LOGICALS("Logicals"),
	OUTDOORS("Outdoors"),
	ANIMATE("Animate"),
	KILL_EDGE("KillEdge"),
	FILL_BLANKS("FillBlanks"),
	SIZE_X("SizeX"),
	SIZE_Y("SizeY"),
	AUTO_MAP("AutoMap"),
	SCAN("Scan"),
	POPS("Pops"),
	POP_PAD("PopPad"),
	FILES("Files"),
	FILE_1("File1"),
	FILE_2("File2"),
	FILE_3("File3"),
	FILE_4("File4"),
	FILE_5("File5"),
	FILE_6("File6"),
	DT_1_MASK("Dt1Mask");
	
	companion object {
		const val SHEET_NAME = "lvlprest"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = NAME
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}