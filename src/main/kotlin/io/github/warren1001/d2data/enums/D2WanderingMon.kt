package io.github.warren1001.d2data.enums

enum class D2WanderingMon(override val header: String): D2Header {
	
	CLASS("class");
	
	companion object {
		const val SHEET_NAME = "wanderingmon"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = CLASS
		const val HARDCODE = false // TODO probably not?
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}