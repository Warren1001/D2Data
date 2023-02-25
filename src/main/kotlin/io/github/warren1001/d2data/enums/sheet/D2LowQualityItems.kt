package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2LowQualityItems(override val header: String): D2Header {
	
	NAME("Name");
	
	companion object {
		val FILE_PATH = "global/excel/lowqualityitems.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = NAME
		const val HARDCODE = true // TODO PK says this is hardcoded but i kinda question it
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}