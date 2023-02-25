package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2CubeMod(override val header: String): D2Header {
	
	CUBE_MODIFIER_TYPE("cube modifier type"),
	CODE("Code");
	
	companion object {
		val FILE_PATH = "global/excel/cubemod.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = CUBE_MODIFIER_TYPE
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}