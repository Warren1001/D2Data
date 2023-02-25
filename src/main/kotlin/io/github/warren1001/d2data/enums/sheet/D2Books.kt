package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Books(override val header: String): D2Header {
	
	NAME("Name"),
	SCROLL_SPELL_CODE("ScrollSpellCode"),
	BOOK_SPELL_CODE("BookSpellCode"),
	P_SPELL("pSpell"),
	SPELL_ICON("SpellIcon"),
	SCROLL_SKILL("ScrollSkill"),
	BOOK_SKILL("BookSkill"),
	BASE_COST("BaseCost"),
	COST_PER_CHARGE("CostPerCharge");
	
	companion object {
		val FILE_PATH = "global/excel/books.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = NAME
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}