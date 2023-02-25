package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Hireling(override val header: String): D2Header {
	
	HIRELING("Hireling"),
	SUB_TYPE("*SubType"),
	VERSION("Version"),
	ID("Id"),
	CLASS("Class"),
	ACT("Act"),
	DIFFICULTY("Difficulty"),
	LEVEL("Level"),
	SELLER("Seller"),
	NAME_FIRST("NameFirst"),
	NAME_LAST("NameLast"),
	GOLD("Gold"),
	EXP_LVL("Exp/Lvl"),
	HP("HP"),
	HP_LVL("HP/Lvl"),
	DEFENSE("Defense"),
	DEF_LVL("Def/Lvl"),
	STR("Str"),
	STR_LVL("Str/Lvl"),
	DEX("Dex"),
	DEX_LVL("Dex/Lvl"),
	AR("AR"),
	AR_LVL("AR/Lvl"),
	DMG_MIN("Dmg-Min"),
	DMG_MAX("Dmg-Max"),
	DMG_LVL("Dmg/Lvl"),
	RESIST_FIRE("ResistFire"),
	RESIST_FIRE_LVL("ResistFire/Lvl"),
	RESIST_COLD("ResistCold"),
	RESIST_COLD_LVL("ResistCold/Lvl"),
	RESIST_LIGHTNING("ResistLightning"),
	RESIST_LIGHTNING_LVL("ResistLightning/Lvl"),
	RESIST_POISON("ResistPoison"),
	RESIST_POISON_LVL("ResistPoison/Lvl"),
	HIRE_DESC("HireDesc"),
	DEFAULT_CHANCE("DefaultChance"),
	SKILL_1("Skill1"),
	MODE_1("Mode1"),
	CHANCE_1("Chance1"),
	CHANCE_PER_LVL_1("ChancePerLvl1"),
	LEVEL_1("Level1"),
	LVL_PER_LVL_1("LvlPerLvl1"),
	SKILL_2("Skill2"),
	MODE_2("Mode2"),
	CHANCE_2("Chance2"),
	CHANCE_PER_LVL_2("ChancePerLvl2"),
	LEVEL_2("Level2"),
	LVL_PER_LVL_2("LvlPerLvl2"),
	SKILL_3("Skill3"),
	MODE_3("Mode3"),
	CHANCE_3("Chance3"),
	CHANCE_PER_LVL_3("ChancePerLvl3"),
	LEVEL_3("Level3"),
	LVL_PER_LVL_3("LvlPerLvl3"),
	SKILL_4("Skill4"),
	MODE_4("Mode4"),
	CHANCE_4("Chance4"),
	CHANCE_PER_LVL_4("ChancePerLvl4"),
	LEVEL_4("Level4"),
	LVL_PER_LVL_4("LvlPerLvl4"),
	SKILL_5("Skill5"),
	MODE_5("Mode5"),
	CHANCE_5("Chance5"),
	CHANCE_PER_LVL_5("ChancePerLvl5"),
	LEVEL_5("Level5"),
	LVL_PER_LVL_5("LvlPerLvl5"),
	SKILL_6("Skill6"),
	MODE_6("Mode6"),
	CHANCE_6("Chance6"),
	CHANCE_PER_LVL_6("ChancePerLvl6"),
	LEVEL_6("Level6"),
	LVL_PER_LVL_6("LvlPerLvl6"),
	HIRING_MAX_LEVEL_DIFFERENCE("HiringMaxLevelDifference"),
	RESURRECT_COST_MULTIPLIER("resurrectcostmultiplier"),
	RESURRECT_COST_DIVISOR("resurrectcostdivisor"),
	RESURRECT_COST_MAX("resurrectcostmax"),
	EQUIVALENT_CHAR_CLASS("equivalentcharclass");
	
	companion object {
		val FILE_PATH = "global/excel/hireling.txt".properSeparator()
		val HEADERS = values().map { it.header }
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = null
			override fun isHardcode() = HARDCODE
		}
	}
	
}