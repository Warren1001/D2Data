package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2CharStats(header: String, vararg headerHistory: String): D2Header {
	
	CLASS("class"),
	STR("str"),
	DEX("dex"),
	INT("int"),
	VIT("vit"),
	STAMINA("stamina"),
	HP_ADD("hpadd"),
	MANA_REGEN("ManaRegen"),
	TO_HIT_FACTOR("ToHitFactor"),
	WALK_VELOCITY("WalkVelocity"),
	RUN_VELOCITY("RunVelocity"),
	RUN_DRAIN("RunDrain"),
	COMMENT("*Comment"),
	LIFE_PER_LEVEL("LifePerLevel"),
	STAMINA_PER_LEVEL("StaminaPerLevel"),
	MANA_PER_LEVEL("ManaPerLevel"),
	LIFE_PER_VITALITY("LifePerVitality"),
	STAMINA_PER_VITALITY("StaminaPerVitality"),
	MANA_PER_MAGIC("ManaPerMagic"),
	STAT_PER_LEVEL("StatPerLevel"),
	SKILLS_PER_LEVEL("SkillsPerLevel"),
	LIGHT_RADIUS("LightRadius"),
	BLOCK_FACTOR("BlockFactor"),
	MINIMUM_CASTING_DELAY("MinimumCastingDelay"),
	START_SKILL("StartSkill"),
	SKILL_1("Skill 1"),
	SKILL_2("Skill 2"),
	SKILL_3("Skill 3"),
	SKILL_4("Skill 4"),
	SKILL_5("Skill 5"),
	SKILL_6("Skill 6"),
	SKILL_7("Skill 7"),
	SKILL_8("Skill 8"),
	SKILL_9("Skill 9"),
	SKILL_10("Skill 10"),
	STR_ALL_SKILLS("StrAllSkills"),
	STR_SKILL_TAB_1("StrSkillTab1"),
	STR_SKILL_TAB_2("StrSkillTab2"),
	STR_SKILL_TAB_3("StrSkillTab3"),
	STR_CLASS_ONLY("StrClassOnly"),
	HEALTH_POTION_PERCENT("HealthPotionPercent"),
	MANA_POTION_PERCENT("ManaPotionPercent"),
	BASE_W_CLASS("baseWClass"),
	ITEM_1("item1"),
	ITEM_1_LOC("item1loc"),
	ITEM_1_COUNT("item1count"),
	ITEM_1_QUALITY("item1quality"),
	ITEM_2("item2"),
	ITEM_2_LOC("item2loc"),
	ITEM_2_COUNT("item2count"),
	ITEM_2_QUALITY("item2quality"),
	ITEM_3("item3"),
	ITEM_3_LOC("item3loc"),
	ITEM_3_COUNT("item3count"),
	ITEM_3_QUALITY("item3quality"),
	ITEM_4("item4"),
	ITEM_4_LOC("item4loc"),
	ITEM_4_COUNT("item4count"),
	ITEM_4_QUALITY("item4quality"),
	ITEM_5("item5"),
	ITEM_5_LOC("item5loc"),
	ITEM_5_COUNT("item5count"),
	ITEM_5_QUALITY("item5quality"),
	ITEM_6("item6"),
	ITEM_6_LOC("item6loc"),
	ITEM_6_COUNT("item6count"),
	ITEM_6_QUALITY("item6quality"),
	ITEM_7("item7"),
	ITEM_7_LOC("item7loc"),
	ITEM_7_COUNT("item7count"),
	ITEM_7_QUALITY("item7quality"),
	ITEM_8("item8"),
	ITEM_8_LOC("item8loc"),
	ITEM_8_COUNT("item8count"),
	ITEM_8_QUALITY("item8quality"),
	ITEM_9("item9"),
	ITEM_9_LOC("item9loc"),
	ITEM_9_COUNT("item9count"),
	ITEM_9_QUALITY("item9quality"),
	ITEM_10("item10"),
	ITEM_10_LOC("item10loc"),
	ITEM_10_COUNT("item10count"),
	ITEM_10_QUALITY("item10quality");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/charstats.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = CLASS
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}