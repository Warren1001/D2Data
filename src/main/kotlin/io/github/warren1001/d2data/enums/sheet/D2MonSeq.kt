package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2MonSeq(override val header: String): D2Header {
	
	SEQUENCE("sequence"),
	MODE("mode"),
	FRAME("frame"),
	DIR("dir"),
	EVENT("event"),
	EOL("*eol");
	
	companion object {
		val FILE_PATH = "global/excel/monseq.txt".properSeparator()
		val HEADERS = values().map { it.header }
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = null
			override fun isHardcode() = HARDCODE
		}
	}
	
}