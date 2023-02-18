package io.github.warren1001.d2data.enums

enum class D2MonSeq(override val header: String): D2Header {
	
	SEQUENCE("sequence"),
	MODE("mode"),
	FRAME("frame"),
	DIR("dir"),
	EVENT("event"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "monseq"
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