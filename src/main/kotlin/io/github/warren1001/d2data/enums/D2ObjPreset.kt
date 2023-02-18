package io.github.warren1001.d2data.enums

enum class D2ObjPreset(override val header: String): D2Header {
	
	INDEX("Index"),
	ACT("Act"),
	OBJECT_CLASS("ObjectClass"),
	NOTES("*Notes"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "objpreset"
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