package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2WanderingMon(override val header: String): D2Header {
	
	CLASS("class");
	
	companion object {
		val FILE_PATH = "global/excel/wanderingmon.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = CLASS
		const val HARDCODE = false // TODO probably not?
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}