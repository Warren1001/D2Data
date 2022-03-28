package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2Books(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "books") {
	
	companion object {
		
		const val NAME = "Name"
		const val SCROLL_SPELL_CODE = "ScrollSpellCode"
		const val BOOK_SPELL_CODE = "BookSpellCode"
		const val P_SPELL = "pSpell"
		const val SPELL_ICON = "SpellIcon"
		const val SCROLL_SKILL = "ScrollSkill"
		const val BOOK_SKILL = "BookSkill"
		const val BASE_COST = "BaseCost"
		const val COST_PER_CHARGE = "CostPerCharge"
		
	}
	
}