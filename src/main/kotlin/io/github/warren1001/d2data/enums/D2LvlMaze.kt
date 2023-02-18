package io.github.warren1001.d2data.enums

enum class D2LvlMaze(override val header: String): D2Header {
	
	NAME("Name"),
	LEVEL("Level"),
	ROOMS("Rooms"),
	ROOMS_NIGHTMARE("Rooms(N)"),
	ROOMS_HELL("Rooms(H)"),
	SIZE_X("SizeX"),
	SIZE_Y("SizeY"),
	MERGE("Merge");
	
	companion object {
		const val SHEET_NAME = "lvlmaze"
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