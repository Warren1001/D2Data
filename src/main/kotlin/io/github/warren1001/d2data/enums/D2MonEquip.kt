package io.github.warren1001.d2data.enums

enum class D2MonEquip(override val header: String): D2Header {
	
	MONSTER("monster"),
	ON_INIT("oninit"),
	LEVEL("level"),
	ITEM_1("item1"),
	LOC_1("loc1"),
	MOD_1("mod1"),
	ITEM_2("item2"),
	LOC_2("loc2"),
	MOD_2("mod2"),
	ITEM_3("item3"),
	LOC_3("loc3"),
	MOD_3("mod3"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "monequip"
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