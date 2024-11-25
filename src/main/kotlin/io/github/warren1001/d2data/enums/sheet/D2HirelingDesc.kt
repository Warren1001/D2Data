package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2HirelingDesc(header: String, vararg headerHistory: String): D2Header {
	
	ID("id"),
	HCIDX("*hcIdx"),
	ALTERNATE_VOICE("alternateVoice"),
	EOL("*eol");

	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/hirelingdesc.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
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