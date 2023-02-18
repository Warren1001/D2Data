package io.github.warren1001.d2data.enums

enum class D2LevelGroups(override val header: String): D2Header {
	
	NAME("Name"),
	ID("Id"),
	STRING_NAME("*StringName"),
	GROUP_NAME("GroupName");

	companion object {
		const val SHEET_NAME = "levelgroups"
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