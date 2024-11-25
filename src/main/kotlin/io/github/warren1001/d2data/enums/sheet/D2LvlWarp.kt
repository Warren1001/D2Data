package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2LvlWarp(header: String, vararg headerHistory: String): D2Header {
	
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
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/lvlwarp.txt".properSeparator()
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