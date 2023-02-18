package io.github.warren1001.d2data.enums

enum class D2StorePage(override val header: String): D2Header {
	
	STORE_PAGE("Store Page"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "storepage"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = STORE_PAGE
		const val HARDCODE = true
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}