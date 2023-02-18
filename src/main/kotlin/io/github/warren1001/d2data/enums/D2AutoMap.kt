package io.github.warren1001.d2data.enums

enum class D2AutoMap(override val header: String): D2Header {
	
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
	
	companion object {
		const val SHEET_NAME = "automap"
		val HEADERS = values().map { it.header }
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = null
			override fun isHardcode() = HARDCODE
		}
	}
	
}