package io.github.warren1001.d2data.enums

enum class D2LvlWarp(val header: String) {
	
	NAME("Name"),
	ID("Id"),
	SELECT_X("SelectX"),
	SELECT_Y("SelectY"),
	SELECT_DX("SelectDX"),
	SELECT_DY("SelectDY"),
	EXIT_WALK_X("ExitWalkX"),
	EXIT_WALK_Y("ExitWalkY"),
	OFFSET_X("OffsetX"),
	OFFSET_Y("OffsetY"),
	LIT_VERSION("LitVersion"),
	TILES("Tiles"),
	NO_INTERACT("NoInteract"),
	DIRECTION("Direction"),
	UNIQUE_ID("UniqueId");
	
	companion object {
		const val SHEET_NAME = "lvlwarp"
		val HEADERS = values().map { it.header }
	}
	
}