package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2ObjPreset(header: String, vararg headerHistory: String): D2Header {
	
	INDEX("Index"),
	ACT("Act"),
	OBJECT_CLASS("ObjectClass"),
	NOTES("*Notes"),
	EOL("*eol");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/objpreset.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = null
			override fun isHardcode() = HARDCODE
		}
	}
	
}