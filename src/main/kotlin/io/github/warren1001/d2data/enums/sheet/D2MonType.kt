package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2MonType(override val header: String): D2Header {
	
	TYPE("type"),
	EQUIV_1("equiv1"),
	EQUIV_2("equiv2"),
	EQUIV_3("equiv3"),
	STRPLUR("strplur"),
	ELEMENT("element"),
	EOL("*eol");
	
	companion object {
		val FILE_PATH = "global/excel/montype.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = TYPE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}