package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2RarePrefix(override val header: String): D2Header {
	
	NAME("name"),
	VERSION("version"),
	I_TYPE_1("itype1"),
	I_TYPE_2("itype2"),
	I_TYPE_3("itype3"),
	I_TYPE_4("itype4"),
	I_TYPE_5("itype5"),
	I_TYPE_6("itype6"),
	I_TYPE_7("itype7"),
	E_TYPE_1("etype1"),
	E_TYPE_2("etype2"),
	E_TYPE_3("etype3"),
	E_TYPE_4("etype4");
	
	companion object {
		val FILE_PATH = "global/excel/rareprefix.txt".properSeparator()
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