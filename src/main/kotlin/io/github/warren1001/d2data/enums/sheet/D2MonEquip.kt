package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2MonEquip(header: String, vararg headerHistory: String): D2Header {
	
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
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/monequip.txt".properSeparator()
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