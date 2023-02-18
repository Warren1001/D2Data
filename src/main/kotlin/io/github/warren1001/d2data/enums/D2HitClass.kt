package io.github.warren1001.d2data.enums

enum class D2HitClass(override val header: String): D2Header {
	
	HIT_CLASS("Hit Class"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "hitclass"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = HIT_CLASS
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}