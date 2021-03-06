package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2Experience(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "experience") {
	
	companion object {
		
		const val LEVEL = "Level"
		const val AMAZON = "Amazon"
		const val SORCERESS = "Sorceress"
		const val NECROMANCER = "Necromancer"
		const val PALADIN = "Paladin"
		const val BARBARIAN = "Barbarian"
		const val DRUID = "Druid"
		const val ASSASSIN = "Assassin"
		const val EXP_RATIO = "ExpRatio"
		
	}
	
}