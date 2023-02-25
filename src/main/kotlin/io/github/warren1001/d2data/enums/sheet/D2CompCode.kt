package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2CompCode(override val header: String): D2Header {
	
	COMPONENT("component"),
	CODE("code");
	
	companion object {
		val FILE_PATH = "global/excel/compcode.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = COMPONENT
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}