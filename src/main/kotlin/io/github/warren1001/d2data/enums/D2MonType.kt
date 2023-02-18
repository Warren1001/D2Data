package io.github.warren1001.d2data.enums

enum class D2MonType(override val header: String): D2Header {
	
	TYPE("type"),
	EQUIV_1("equiv1"),
	EQUIV_2("equiv2"),
	EQUIV_3("equiv3"),
	STRPLUR("strplur"),
	ELEMENT("element"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "montype"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = TYPE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}