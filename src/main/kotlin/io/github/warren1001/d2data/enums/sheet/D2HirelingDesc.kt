package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2HirelingDesc(override val header: String): D2Header {
	
	ID("id"),
	HCIDX("*hcIdx"),
	ALTERNATE_VOICE("alternateVoice"),
	EOL("*eol");

	companion object {
		val FILE_PATH = "global/excel/hirelingdesc.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = ID
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}