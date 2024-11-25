package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2AutoMap(header: String, vararg headerHistory: String): D2Header {
	
	LEVEL_NAME("LevelName"),
	TILE_NAME("TileName"),
	STYLE("Style"),
	START_SEQUENCE("StartSequence"),
	END_SEQUENCE("EndSequence"),
	TYPE_1("*Type1"),
	CEL_1("Cel1"),
	TYPE_2("*Type2"),
	CEL_2("Cel2"),
	TYPE_3("*Type3"),
	CEL_3("Cel3"),
	TYPE_4("*Type4"),
	CEL_4("Cel4");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/automap.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = null
			override fun isHardcode() = HARDCODE
		}
	}
	
}