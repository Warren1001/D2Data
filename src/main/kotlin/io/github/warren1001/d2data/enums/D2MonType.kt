package io.github.warren1001.d2data.enums

enum class D2MonType(val header: String) {
	
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
	}
	
}