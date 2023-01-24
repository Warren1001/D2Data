package io.github.warren1001.d2data.enums

enum class D2MonSeq(val header: String) {
	
	SEQUENCE("sequence"),
	MODE("mode"),
	FRAME("frame"),
	DIR("dir"),
	EVENT("event"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "monseq"
		val HEADERS = values().map { it.header }
	}
	
}