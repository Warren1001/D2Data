package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2HitClass(override val header: String): D2Header {
	
	HIT_CLASS("Hit Class"),
	CODE("Code");
	
	companion object {
		val FILE_PATH = "global/excel/hitclass.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = HIT_CLASS
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}