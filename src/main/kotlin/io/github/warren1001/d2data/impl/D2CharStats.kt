package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2CharStats(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "charstats") {
	
	companion object {
		
		const val CLASS = "class"
		const val STR = "str"
		const val DEX = "dex"
		const val INT = "int"
		const val VIT = "vit"
		const val STAMINA = "stamina"
		const val HP_ADD = "hpadd"
		const val MANA_REGEN = "ManaRegen"
		const val TO_HIT_FACTOR = "ToHitFactor"
		const val WALK_VELOCITY = "WalkVelocity"
		const val RUN_VELOCITY = "RunVelocity"
		const val RUN_DRAIN = "RunDrain"
		const val COMMENT = "*Comment"
		const val LIFE_PER_LEVEL = "LifePerLevel"
		const val STAMINA_PER_LEVEL = "StaminaPerLevel"
		const val MANA_PER_LEVEL = "ManaPerLevel"
		const val LIFE_PER_VITALITY = "LifePerVitality"
		const val STAMINA_PER_VITALITY = "StaminaPerVitality"
		const val MANA_PER_MAGIC = "ManaPerMagic"
		const val STAT_PER_LEVEL = "StatPerLevel"
		const val SKILLS_PER_LEVEL = "SkillsPerLevel"
		const val LIGHT_RADIUS = "LightRadius"
		const val BLOCK_FACTOR = "BlockFactor"
		const val MINIMUM_CASTING_DELAY = "MinimumCastingDelay"
		const val START_SKILL = "StartSkill"
		const val SKILL_1 = "Skill 1"
		const val SKILL_2 = "Skill 2"
		const val SKILL_3 = "Skill 3"
		const val SKILL_4 = "Skill 4"
		const val SKILL_5 = "Skill 5"
		const val SKILL_6 = "Skill 6"
		const val SKILL_7 = "Skill 7"
		const val SKILL_8 = "Skill 8"
		const val SKILL_9 = "Skill 9"
		const val SKILL_10 = "Skill 10"
		const val STR_ALL_SKILLS = "StrAllSkills"
		const val STR_SKILL_TAB_1 = "StrSkillTab1"
		const val STR_SKILL_TAB_2 = "StrSkillTab2"
		const val STR_SKILL_TAB_3 = "StrSkillTab3"
		const val STR_CLASS_ONLY = "StrClassOnly"
		const val HEALTH_POTION_PERCENT = "HealthPotionPercent"
		const val MANA_POTION_PERCENT = "ManaPotionPercent"
		const val BASE_W_CLASS = "baseWClass"
		const val ITEM_1 = "item1"
		const val ITEM_1_LOC = "item1loc"
		const val ITEM_1_COUNT = "item1count"
		const val ITEM_1_QUALITY = "item1quality"
		const val ITEM_2 = "item2"
		const val ITEM_2_LOC = "item2loc"
		const val ITEM_2_COUNT = "item2count"
		const val ITEM_2_QUALITY = "item2quality"
		const val ITEM_3 = "item3"
		const val ITEM_3_LOC = "item3loc"
		const val ITEM_3_COUNT = "item3count"
		const val ITEM_3_QUALITY = "item3quality"
		const val ITEM_4 = "item4"
		const val ITEM_4_LOC = "item4loc"
		const val ITEM_4_COUNT = "item4count"
		const val ITEM_4_QUALITY = "item4quality"
		const val ITEM_5 = "item5"
		const val ITEM_5_LOC = "item5loc"
		const val ITEM_5_COUNT = "item5count"
		const val ITEM_5_QUALITY = "item5quality"
		const val ITEM_6 = "item6"
		const val ITEM_6_LOC = "item6loc"
		const val ITEM_6_COUNT = "item6count"
		const val ITEM_6_QUALITY = "item6quality"
		const val ITEM_7 = "item7"
		const val ITEM_7_LOC = "item7loc"
		const val ITEM_7_COUNT = "item7count"
		const val ITEM_7_QUALITY = "item7quality"
		const val ITEM_8 = "item8"
		const val ITEM_8_LOC = "item8loc"
		const val ITEM_8_COUNT = "item8count"
		const val ITEM_8_QUALITY = "item8quality"
		const val ITEM_9 = "item9"
		const val ITEM_9_LOC = "item9loc"
		const val ITEM_9_COUNT = "item9count"
		const val ITEM_9_QUALITY = "item9quality"
		const val ITEM_10 = "item10"
		const val ITEM_10_LOC = "item10loc"
		const val ITEM_10_COUNT = "item10count"
		const val ITEM_10_QUALITY = "item10quality"
		
	}
	
}