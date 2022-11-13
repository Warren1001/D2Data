package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonStats(manager: D2Sheets, dir: File) : D2Sheet(manager, dir, "monstats") {
	
	companion object {
		
		private val HEADERS = listOf(
			"Id",
			"*hcIdx",
			"BaseId",
			"NextInClass",
			"TransLvl",
			"NameStr",
			"MonStatsEx",
			"MonProp",
			"MonType",
			"AI",
			"DescStr",
			"Code",
			"enabled",
			"rangedtype",
			"placespawn",
			"spawn",
			"spawnx",
			"spawny",
			"spawnmode",
			"minion1",
			"minion2",
			"SetBoss",
			"BossXfer",
			"PartyMin",
			"PartyMax",
			"MinGrp",
			"MaxGrp",
			"sparsePopulate",
			"Velocity",
			"Run",
			"Rarity",
			"Level",
			"Level(N)",
			"Level(H)",
			"MonSound",
			"UMonSound",
			"threat",
			"aidel",
			"aidel(N)",
			"aidel(H)",
			"aidist",
			"aidist(N)",
			"aidist(H)",
			"aip1",
			"aip1(N)",
			"aip1(H)",
			"aip2",
			"aip2(N)",
			"aip2(H)",
			"aip3",
			"aip3(N)",
			"aip3(H)",
			"aip4",
			"aip4(N)",
			"aip4(H)",
			"aip5",
			"aip5(N)",
			"aip5(H)",
			"aip6",
			"aip6(N)",
			"aip6(H)",
			"aip7",
			"aip7(N)",
			"aip7(H)",
			"aip8",
			"aip8(N)",
			"aip8(H)",
			"MissA1",
			"MissA2",
			"MissS1",
			"MissS2",
			"MissS3",
			"MissS4",
			"MissC",
			"MissSQ",
			"Align",
			"isSpawn",
			"isMelee",
			"npc",
			"interact",
			"inventory",
			"inTown",
			"lUndead",
			"hUndead",
			"demon",
			"flying",
			"opendoors",
			"boss",
			"primeevil",
			"killable",
			"switchai",
			"noAura",
			"nomultishot",
			"neverCount",
			"petIgnore",
			"deathDmg",
			"genericSpawn",
			"zoo",
			"CannotDesecrate",
			"rightArmItemType",
			"leftArmItemType",
			"canNotUseTwoHandedItems",
			"SendSkills",
			"Skill1",
			"Sk1mode",
			"Sk1lvl",
			"Skill2",
			"Sk2mode",
			"Sk2lvl",
			"Skill3",
			"Sk3mode",
			"Sk3lvl",
			"Skill4",
			"Sk4mode",
			"Sk4lvl",
			"Skill5",
			"Sk5mode",
			"Sk5lvl",
			"Skill6",
			"Sk6mode",
			"Sk6lvl",
			"Skill7",
			"Sk7mode",
			"Sk7lvl",
			"Skill8",
			"Sk8mode",
			"Sk8lvl",
			"Drain",
			"Drain(N)",
			"Drain(H)",
			"coldeffect",
			"coldeffect(N)",
			"coldeffect(H)",
			"ResDm",
			"ResMa",
			"ResFi",
			"ResLi",
			"ResCo",
			"ResPo",
			"ResDm(N)",
			"ResMa(N)",
			"ResFi(N)",
			"ResLi(N)",
			"ResCo(N)",
			"ResPo(N)",
			"ResDm(H)",
			"ResMa(H)",
			"ResFi(H)",
			"ResLi(H)",
			"ResCo(H)",
			"ResPo(H)",
			"DamageRegen",
			"SkillDamage",
			"noRatio",
			"ShieldBlockOverride",
			"ToBlock",
			"ToBlock(N)",
			"ToBlock(H)",
			"Crit",
			"minHP",
			"maxHP",
			"AC",
			"Exp",
			"A1MinD",
			"A1MaxD",
			"A1TH",
			"A2MinD",
			"A2MaxD",
			"A2TH",
			"S1MinD",
			"S1MaxD",
			"S1TH",
			"MinHP(N)",
			"MaxHP(N)",
			"AC(N)",
			"Exp(N)",
			"A1MinD(N)",
			"A1MaxD(N)",
			"A1TH(N)",
			"A2MinD(N)",
			"A2MaxD(N)",
			"A2TH(N)",
			"S1MinD(N)",
			"S1MaxD(N)",
			"S1TH(N)",
			"MinHP(H)",
			"MaxHP(H)",
			"AC(H)",
			"Exp(H)",
			"A1MinD(H)",
			"A1MaxD(H)",
			"A1TH(H)",
			"A2MinD(H)",
			"A2MaxD(H)",
			"A2TH(H)",
			"S1MinD(H)",
			"S1MaxD(H)",
			"S1TH(H)",
			"El1Mode",
			"El1Type",
			"El1Pct",
			"El1MinD",
			"El1MaxD",
			"El1Dur",
			"El1Pct(N)",
			"El1MinD(N)",
			"El1MaxD(N)",
			"El1Dur(N)",
			"El1Pct(H)",
			"El1MinD(H)",
			"El1MaxD(H)",
			"El1Dur(H)",
			"El2Mode",
			"El2Type",
			"El2Pct",
			"El2MinD",
			"El2MaxD",
			"El2Dur",
			"El2Pct(N)",
			"El2MinD(N)",
			"El2MaxD(N)",
			"El2Dur(N)",
			"El2Pct(H)",
			"El2MinD(H)",
			"El2MaxD(H)",
			"El2Dur(H)",
			"El3Mode",
			"El3Type",
			"El3Pct",
			"El3MinD",
			"El3MaxD",
			"El3Dur",
			"El3Pct(N)",
			"El3MinD(N)",
			"El3MaxD(N)",
			"El3Dur(N)",
			"El3Pct(H)",
			"El3MinD(H)",
			"El3MaxD(H)",
			"El3Dur(H)",
			"TreasureClass", "TreasureClassChamp", "TreasureClassUnique", "TreasureClassQuest", "TreasureClassDesecrated", "TreasureClassDesecratedChamp", "TreasureClassDesecratedUnique",
			"TreasureClass(N)", "TreasureClassChamp(N)", "TreasureClassUnique(N)", "TreasureClassQuest(N)", "TreasureClassDesecrated(N)", "TreasureClassDesecratedChamp(N)",
			"TreasureClassDesecratedUnique(N)", "TreasureClass(H)", "TreasureClassChamp(H)", "TreasureClassUnique(H)", "TreasureClassQuest(H)", "TreasureClassDesecrated(H)",
			"TreasureClassDesecratedChamp(H)", "TreasureClassDesecratedUnique(H)",
			"TCQuestId",
			"TCQuestCP",
			"SplEndDeath",
			"SplGetModeChart",
			"SplEndGeneric",
			"SplClientEnd",
			"*eol"
		)
		
		const val ID = "Id"
		const val HC_IDX = "*hcIdx"
		const val BASE_ID = "BaseId"
		const val NEXT_IN_CLASS = "NextInClass"
		const val TRANS_LVL = "TransLvl"
		const val NAME_STR = "NameStr"
		const val MON_STATS_EX = "MonStatsEx"
		const val MON_PROP = "MonProp"
		const val MON_TYPE = "MonType"
		const val AI = "AI"
		const val DESC_STR = "DescStr"
		const val CODE = "Code"
		const val ENABLED = "enabled"
		const val RANGED_TYPE = "rangedtype"
		const val PLACE_SPAWN = "placespawn"
		const val SPAWN = "spawn"
		const val SPAWN_X = "spawnx"
		const val SPAWN_Y = "spawny"
		const val SPAWN_MODE = "spawnmode"
		const val MINION_1 = "minion1"
		const val MINION_2 = "minion2"
		const val SET_BOSS = "SetBoss"
		const val BOSS_XFER = "BossXfer"
		const val PARTY_MIN = "PartyMin"
		const val PARTY_MAX = "PartyMax"
		const val MIN_GRP = "MinGrp"
		const val MAX_GRP = "MaxGrp"
		const val SPARSE_POPULATE = "sparsePopulate"
		const val VELOCITY = "Velocity"
		const val RUN = "Run"
		const val RARITY = "Rarity"
		const val LEVEL = "Level"
		const val LEVEL_NIGHTMARE = "Level(N)"
		const val LEVEL_HELL = "Level(H)"
		const val MON_SOUND = "MonSound"
		const val U_MON_SOUND = "UMonSound"
		const val THREAT = "threat"
		const val AIDEL = "aidel"
		const val AIDEL_NIGHTMARE = "aidel(N)"
		const val AIDEL_HELL = "aidel(H)"
		const val AIDIST = "aidist"
		const val AIDIST_NIGHTMARE = "aidist(N)"
		const val AIDIST_HELL = "aidist(H)"
		const val AIP_1 = "aip1"
		const val AIP_1_NIGHTMARE = "aip1(N)"
		const val AIP_1_HELL = "aip1(H)"
		const val AIP_2 = "aip2"
		const val AIP_2_NIGHTMARE = "aip2(N)"
		const val AIP_2_HELL = "aip2(H)"
		const val AIP_3 = "aip3"
		const val AIP_3_NIGHTMARE = "aip3(N)"
		const val AIP_3_HELL = "aip3(H)"
		const val AIP_4 = "aip4"
		const val AIP_4_NIGHTMARE = "aip4(N)"
		const val AIP_4_HELL = "aip4(H)"
		const val AIP_5 = "aip5"
		const val AIP_5_NIGHTMARE = "aip5(N)"
		const val AIP_5_HELL = "aip5(H)"
		const val AIP_6 = "aip6"
		const val AIP_6_NIGHTMARE = "aip6(N)"
		const val AIP_6_HELL = "aip6(H)"
		const val AIP_7 = "aip7"
		const val AIP_7_NIGHTMARE = "aip7(N)"
		const val AIP_7_HELL = "aip7(H)"
		const val AIP_8 = "aip8"
		const val AIP_8_NIGHTMARE = "aip8(N)"
		const val AIP_8_HELL = "aip8(H)"
		const val MISS_A_1 = "MissA1"
		const val MISS_A_2 = "MissA2"
		const val MISS_S_1 = "MissS1"
		const val MISS_S_2 = "MissS2"
		const val MISS_S_3 = "MissS3"
		const val MISS_S_4 = "MissS4"
		const val MISS_C = "MissC"
		const val MISS_SQ = "MissSQ"
		const val ALIGN = "Align"
		const val IS_SPAWN = "isSpawn"
		const val IS_MELEE = "isMelee"
		const val NPC = "npc"
		const val INTERACT = "interact"
		const val INVENTORY = "inventory"
		const val IN_TOWN = "inTown"
		const val L_UNDEAD = "lUndead"
		const val H_UNDEAD = "hUndead"
		const val DEMON = "demon"
		const val FLYING = "flying"
		const val OPENDOORS = "opendoors"
		const val BOSS = "boss"
		const val PRIMEEVIL = "primeevil"
		const val KILLABLE = "killable"
		const val SWITCHAI = "switchai"
		const val NO_AURA = "noAura"
		const val NOMULTISHOT = "nomultishot"
		const val NEVER_COUNT = "neverCount"
		const val PET_IGNORE = "petIgnore"
		const val DEATH_DMG = "deathDmg"
		const val GENERIC_SPAWN = "genericSpawn"
		const val ZOO = "zoo"
		const val CANNOT_DESECRATE = "CannotDesecrate"
		const val RIGHT_ARM_ITEM_TYPE = "rightArmItemType"
		const val LEFT_ARM_ITEM_TYPE = "leftArmItemType"
		const val CAN_NOT_USE_TWO_HANDED_ITEMS = "canNotUseTwoHandedItems"
		const val SEND_SKILLS = "SendSkills"
		const val SKILL_1 = "Skill1"
		const val SK_1_MODE = "Sk1mode"
		const val SK_1_LVL = "Sk1lvl"
		const val SKILL_2 = "Skill2"
		const val SK_2_MODE = "Sk2mode"
		const val SK_2_LVL = "Sk2lvl"
		const val SKILL_3 = "Skill3"
		const val SK_3_MODE = "Sk3mode"
		const val SK_3_LVL = "Sk3lvl"
		const val SKILL_4 = "Skill4"
		const val SK_4_MODE = "Sk4mode"
		const val SK_4_LVL = "Sk4lvl"
		const val SKILL_5 = "Skill5"
		const val SK_5_MODE = "Sk5mode"
		const val SK_5_LVL = "Sk5lvl"
		const val SKILL_6 = "Skill6"
		const val SK_6_MODE = "Sk6mode"
		const val SK_6_LVL = "Sk6lvl"
		const val SKILL_7 = "Skill7"
		const val SK_7_MODE = "Sk7mode"
		const val SK_7_LVL = "Sk7lvl"
		const val SKILL_8 = "Skill8"
		const val SK_8_MODE = "Sk8mode"
		const val SK_8_LVL = "Sk8lvl"
		const val DRAIN = "Drain"
		const val DRAIN_NIGHTMARE = "Drain(N)"
		const val DRAIN_HELL = "Drain(H)"
		const val COLD_EFFECT = "coldeffect"
		const val COLD_EFFECT_NIGHTMARE = "coldeffect(N)"
		const val COLD_EFFECT_HELL = "coldeffect(H)"
		const val RES_DM = "ResDm"
		const val RES_MA = "ResMa"
		const val RES_FI = "ResFi"
		const val RES_LI = "ResLi"
		const val RES_CO = "ResCo"
		const val RES_PO = "ResPo"
		const val RES_DM_NIGHTMARE = "ResDm(N)"
		const val RES_MA_NIGHTMARE = "ResMa(N)"
		const val RES_FI_NIGHTMARE = "ResFi(N)"
		const val RES_LI_NIGHTMARE = "ResLi(N)"
		const val RES_CO_NIGHTMARE = "ResCo(N)"
		const val RES_PO_NIGHTMARE = "ResPo(N)"
		const val RES_DM_HELL = "ResDm(H)"
		const val RES_MA_HELL = "ResMa(H)"
		const val RES_FI_HELL = "ResFi(H)"
		const val RES_LI_HELL = "ResLi(H)"
		const val RES_CO_HELL = "ResCo(H)"
		const val RES_PO_HELL = "ResPo(H)"
		const val DAMAGE_REGEN = "DamageRegen"
		const val SKILL_DAMAGE = "SkillDamage"
		const val NO_RATIO = "noRatio"
		const val SHIELD_BLOCK_OVERRIDE = "ShieldBlockOverride"
		const val TO_BLOCK = "ToBlock"
		const val TO_BLOCK_NIGHTMARE = "ToBlock(N)"
		const val TO_BLOCK_HELL = "ToBlock(H)"
		const val CRIT = "Crit"
		const val MIN_HP = "minHP"
		const val MAX_HP = "maxHP"
		const val AC = "AC"
		const val EXP = "Exp"
		const val A1_MIN_D = "A1MinD"
		const val A1_MAX_D = "A1MaxD"
		const val A1_TH = "A1TH"
		const val A2_MIN_D = "A2MinD"
		const val A2_MAX_D = "A2MaxD"
		const val A2_TH = "A2TH"
		const val S1_MIN_D = "S1MinD"
		const val S1_MAX_D = "S1MaxD"
		const val S1_TH = "S1TH"
		const val MIN_HP_NIGHTMARE = "MinHP(N)"
		const val MAX_HP_NIGHTMARE = "MaxHP(N)"
		const val AC_NIGHTMARE = "AC(N)"
		const val EXP_NIGHTMARE = "Exp(N)"
		const val A1_MIN_D_NIGHTMARE = "A1MinD(N)"
		const val A1_MAX_D_NIGHTMARE = "A1MaxD(N)"
		const val A1_TH_NIGHTMARE = "A1TH(N)"
		const val A2_MIN_D_NIGHTMARE = "A2MinD(N)"
		const val A2_MAX_D_NIGHTMARE = "A2MaxD(N)"
		const val A2_TH_NIGHTMARE = "A2TH(N)"
		const val S1_MIN_D_NIGHTMARE = "S1MinD(N)"
		const val S1_MAX_D_NIGHTMARE = "S1MaxD(N)"
		const val S1_TH_NIGHTMARE = "S1TH(N)"
		const val MIN_HP_HELL = "MinHP(H)"
		const val MAX_HP_HELL = "MaxHP(H)"
		const val AC_HELL = "AC(H)"
		const val EXP_HELL = "Exp(H)"
		const val A1_MIN_D_HELL = "A1MinD(H)"
		const val A1_MAX_D_HELL = "A1MaxD(H)"
		const val A1_TH_HELL = "A1TH(H)"
		const val A2_MIN_D_HELL = "A2MinD(H)"
		const val A2_MAX_D_HELL = "A2MaxD(H)"
		const val A2_TH_HELL = "A2TH(H)"
		const val S1_MIN_D_HELL = "S1MinD(H)"
		const val S1_MAX_D_HELL = "S1MaxD(H)"
		const val S1_TH_HELL = "S1TH(H)"
		const val EL1_MODE = "El1Mode"
		const val EL1_TYPE = "El1Type"
		const val EL1_PCT = "El1Pct"
		const val EL1_MIN_D = "El1MinD"
		const val EL1_MAX_D = "El1MaxD"
		const val EL1_DUR = "El1Dur"
		const val EL1_PCT_NIGHTMARE = "El1Pct(N)"
		const val EL1_MIN_D_NIGHTMARE = "El1MinD(N)"
		const val EL1_MAX_D_NIGHTMARE = "El1MaxD(N)"
		const val EL1_DUR_NIGHTMARE = "El1Dur(N)"
		const val EL1_PCT_HELL = "El1Pct(H)"
		const val EL1_MIN_D_HELL = "El1MinD(H)"
		const val EL1_MAX_D_HELL = "El1MaxD(H)"
		const val EL1_DUR_HELL = "El1Dur(H)"
		const val EL2_MODE = "El2Mode"
		const val EL2_TYPE = "El2Type"
		const val EL2_PCT = "El2Pct"
		const val EL2_MIN_D = "El2MinD"
		const val EL2_MAX_D = "El2MaxD"
		const val EL2_DUR = "El2Dur"
		const val EL2_PCT_NIGHTMARE = "El2Pct(N)"
		const val EL2_MIN_D_NIGHTMARE = "El2MinD(N)"
		const val EL2_MAX_D_NIGHTMARE = "El2MaxD(N)"
		const val EL2_DUR_NIGHTMARE = "El2Dur(N)"
		const val EL2_PCT_HELL = "El2Pct(H)"
		const val EL2_MIN_D_HELL = "El2MinD(H)"
		const val EL2_MAX_D_HELL = "El2MaxD(H)"
		const val EL2_DUR_HELL = "El2Dur(H)"
		const val EL3_MODE = "El3Mode"
		const val EL3_TYPE = "El3Type"
		const val EL3_PCT = "El3Pct"
		const val EL3_MIN_D = "El3MinD"
		const val EL3_MAX_D = "El3MaxD"
		const val EL3_DUR = "El3Dur"
		const val EL3_PCT_NIGHTMARE = "El3Pct(N)"
		const val EL3_MIN_D_NIGHTMARE = "El3MinD(N)"
		const val EL3_MAX_D_NIGHTMARE = "El3MaxD(N)"
		const val EL3_DUR_NIGHTMARE = "El3Dur(N)"
		const val EL3_PCT_HELL = "El3Pct(H)"
		const val EL3_MIN_D_HELL = "El3MinD(H)"
		const val EL3_MAX_D_HELL = "El3MaxD(H)"
		const val EL3_DUR_HELL = "El3Dur(H)"
		const val TREASURE_CLASS = "TreasureClass"
		const val TREASURE_CLASS_CHAMP = "TreasureClassChamp"
		const val TREASURE_CLASS_UNIQUE = "TreasureClassUnique"
		const val TREASURE_CLASS_QUEST = "TreasureClassQuest"
		const val TREASURE_CLASS_DESECRATED = "TreasureClassDesecrated"
		const val TREASURE_CLASS_DESECRATED_CHAMP = "TreasureClassDesecratedChamp"
		const val TREASURE_CLASS_DESECRATED_UNIQUE = "TreasureClassDesecratedUnique"
		const val TREASURE_CLASS_NIGHTMARE = "TreasureClass(N)"
		const val TREASURE_CLASS_CHAMP_NIGHTMARE = "TreasureClassChamp(N)"
		const val TREASURE_CLASS_UNIQUE_NIGHTMARE = "TreasureClassUnique(N)"
		const val TREASURE_CLASS_QUEST_NIGHTMARE = "TreasureClassQuest(N)"
		const val TREASURE_CLASS_DESECRATED_NIGHTMARE = "TreasureClassDesecrated(N)"
		const val TREASURE_CLASS_DESECRATED_CHAMP_NIGHTMARE = "TreasureClassDesecratedChamp(N)"
		const val TREASURE_CLASS_DESECRATED_UNIQUE_NIGHTMARE = "TreasureClassDesecratedUnique(N)"
		const val TREASURE_CLASS_HELL = "TreasureClass(H)"
		const val TREASURE_CLASS_CHAMP_HELL = "TreasureClassChamp(H)"
		const val TREASURE_CLASS_UNIQUE_HELL = "TreasureClassUnique(H)"
		const val TREASURE_CLASS_QUEST_HELL = "TreasureClassQuest(H)"
		const val TREASURE_CLASS_DESECRATED_HELL = "TreasureClassDesecrated(H)"
		const val TREASURE_CLASS_DESECRATED_CHAMP_HELL = "TreasureClassDesecratedChamp(H)"
		const val TREASURE_CLASS_DESECRATED_UNIQUE_HELL = "TreasureClassDesecratedUnique(H)"
		const val TC_QUEST_ID = "TCQuestId"
		const val TC_QUEST_CP = "TCQuestCP"
		const val SPL_END_DEATH = "SplEndDeath"
		const val SPL_GET_MODE_CHART = "SplGetModeChart"
		const val SPL_END_GENERIC = "SplEndGeneric"
		const val SPL_CLIENT_END = "SplClientEnd"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}