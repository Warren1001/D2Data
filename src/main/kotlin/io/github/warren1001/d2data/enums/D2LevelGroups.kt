package io.github.warren1001.d2data.enums

enum class D2LevelGroups(val header: String) {
	
	NAME("Name"),
	ID("Id"),
	STRING_NAME("*StringName"),
	GROUP_NAME("GroupName");

	companion object {
		const val SHEET_NAME = "levelgroups"
		val HEADERS = values().map { it.header }
	}
	
}