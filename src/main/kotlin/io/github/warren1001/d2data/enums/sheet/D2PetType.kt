package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2PetType(override val header: String): D2Header {
	
	PET_TYPE("pet type"),
	GROUP("group"),
	BASE_MAX("basemax"),
	WARP("warp"),
	RANGE("range"),
	PARTY_SEND("partysend"),
	UNSUMMON("unsummon"),
	AUTOMAP("automap"),
	NAME("name"),
	DRAW_HP("drawhp"),
	ICON_TYPE("icontype"),
	BASE_ICON("baseicon"),
	M_CLASS_1("mclass1"),
	M_ICON_1("micon1"),
	M_CLASS_2("mclass2"),
	M_ICON_2("micon2"),
	M_CLASS_3("mclass3"),
	M_ICON_3("micon3"),
	M_CLASS_4("mclass4"),
	M_ICON_4("micon4");
	
	companion object {
		val FILE_PATH = "global/excel/pettype.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = PET_TYPE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}