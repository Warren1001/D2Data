package io.github.warren1001.d2data.enums

enum class D2StorePage(val header: String) {
	
	STORE_PAGE("Store Page"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "storepage"
		val HEADERS = values().map { it.header }
	}
	
}