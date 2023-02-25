package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

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
		val FILE_PATH = "global/excel/lvlmaze.txt".properSeparator()
		val HEADERS = values().map { it.header }
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