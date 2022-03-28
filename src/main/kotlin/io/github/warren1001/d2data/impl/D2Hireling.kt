package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2Hireling(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "hireling") {
	
	companion object {
		
		const val HIRELING = "Hireling"
		const val SUB_TYPE = "*SubType"
		const val VERSION = "Version"
		const val ID = "Id"
		const val CLASS = "Class"
		const val ACT = "Act"
		const val DIFFICULTY = "Difficulty"
		const val LEVEL = "Level"
		const val SELLER = "Seller"
		const val NAME_FIRST = "NameFirst"
		const val NAME_LAST = "NameLast"
		const val GOLD = "Gold"
		const val EXP_LVL = "Exp/Lvl"
		const val HP = "HP"
		const val HP_LVL = "HP/Lvl"
		const val DEFENSE = "Defense"
		const val DEF_LVL = "Def/Lvl"
		const val STR = "Str"
		const val STR_LVL = "Str/Lvl"
		const val DEX = "Dex"
		const val DEX_LVL = "Dex/Lvl"
		const val AR = "AR"
		const val AR_LVL = "AR/Lvl"
		const val DMG_MIN = "Dmg-Min"
		const val DMG_MAX = "Dmg-Max"
		const val DMG_LVL = "Dmg/Lvl"
		const val RESIST_FIRE = "ResistFire"
		const val RESIST_FIRE_LVL = "ResistFire/Lvl"
		const val RESIST_COLD = "ResistCold"
		const val RESIST_COLD_LVL = "ResistCold/Lvl"
		const val RESIST_LIGHTNING = "ResistLightning"
		const val RESIST_LIGHTNING_LVL = "ResistLightning/Lvl"
		const val RESIST_POISON = "ResistPoison"
		const val RESIST_POISON_LVL = "ResistPoison/Lvl"
		const val HIRE_DESC = "HireDesc"
		const val DEFAULT_CHANCE = "DefaultChance"
		const val SKILL_1 = "Skill1"
		const val MODE_1 = "Mode1"
		const val CHANCE_1 = "Chance1"
		const val CHANCE_PER_LVL_1 = "ChancePerLvl1"
		const val LEVEL_1 = "Level1"
		const val LVL_PER_LVL_1 = "LvlPerLvl1"
		const val SKILL_2 = "Skill2"
		const val MODE_2 = "Mode2"
		const val CHANCE_2 = "Chance2"
		const val CHANCE_PER_LVL_2 = "ChancePerLvl2"
		const val LEVEL_2 = "Level2"
		const val LVL_PER_LVL_2 = "LvlPerLvl2"
		const val SKILL_3 = "Skill3"
		const val MODE_3 = "Mode3"
		const val CHANCE_3 = "Chance3"
		const val CHANCE_PER_LVL_3 = "ChancePerLvl3"
		const val LEVEL_3 = "Level3"
		const val LVL_PER_LVL_3 = "LvlPerLvl3"
		const val SKILL_4 = "Skill4"
		const val MODE_4 = "Mode4"
		const val CHANCE_4 = "Chance4"
		const val CHANCE_PER_LVL_4 = "ChancePerLvl4"
		const val LEVEL_4 = "Level4"
		const val LVL_PER_LVL_4 = "LvlPerLvl4"
		const val SKILL_5 = "Skill5"
		const val MODE_5 = "Mode5"
		const val CHANCE_5 = "Chance5"
		const val CHANCE_PER_LVL_5 = "ChancePerLvl5"
		const val LEVEL_5 = "Level5"
		const val LVL_PER_LVL_5 = "LvlPerLvl5"
		const val SKILL_6 = "Skill6"
		const val MODE_6 = "Mode6"
		const val CHANCE_6 = "Chance6"
		const val CHANCE_PER_LVL_6 = "ChancePerLvl6"
		const val LEVEL_6 = "Level6"
		const val LVL_PER_LVL_6 = "LvlPerLvl6"
		const val HIRING_MAX_LEVEL_DIFFERENCE = "HiringMaxLevelDifference"
		const val RESURRECT_COST_MULTIPLIER = "resurrectcostmultiplier"
		const val RESURRECT_COST_DIVISOR = "resurrectcostdivisor"
		const val RESURRECT_COST_MAX = "resurrectcostmax"
		
	}
	
}