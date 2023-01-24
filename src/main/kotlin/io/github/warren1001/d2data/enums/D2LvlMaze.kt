package io.github.warren1001.d2data.enums

enum class D2LvlMaze(val header: String) {
	
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
	}
	
}