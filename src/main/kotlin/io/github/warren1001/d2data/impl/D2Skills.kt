package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Skills(manager: D2Sheets, dir: File) : D2Sheet(manager, dir, "skills") {
	
	companion object {
		
		private val HEADERS = listOf(
			"skill",
			"*Id",
			"charclass",
			"skilldesc",
			"srvstfunc",
			"srvdofunc",
			"srvstopfunc",
			"prgstack",
			"srvprgfunc1",
			"srvprgfunc2",
			"srvprgfunc3",
			"prgcalc1",
			"prgcalc2",
			"prgcalc3",
			"prgdam",
			"srvmissile",
			"decquant",
			"lob",
			"srvmissilea",
			"srvmissileb",
			"srvmissilec",
			"useServerMissilesOnRemoteClients",
			"srvoverlay",
			"aurafilter",
			"aurastate",
			"auratargetstate",
			"auralencalc",
			"aurarangecalc",
			"aurastat1",
			"aurastatcalc1",
			"aurastat2",
			"aurastatcalc2",
			"aurastat3",
			"aurastatcalc3",
			"aurastat4",
			"aurastatcalc4",
			"aurastat5",
			"aurastatcalc5",
			"aurastat6",
			"aurastatcalc6",
			"auraevent1",
			"auraeventfunc1",
			"auraevent2",
			"auraeventfunc2",
			"auraevent3",
			"auraeventfunc3",
			"passivestate",
			"passiveitype",
			"passivereqweaponcount",
			"passivestat1",
			"passivecalc1",
			"passivestat2",
			"passivecalc2",
			"passivestat3",
			"passivecalc3",
			"passivestat4",
			"passivecalc4",
			"passivestat5",
			"passivecalc5",
			"passivestat6",
			"passivecalc6",
			"summon",
			"pettype",
			"petmax",
			"summode",
			"sumskill1",
			"sumsk1calc",
			"sumskill2",
			"sumsk2calc",
			"sumskill3",
			"sumsk3calc",
			"sumskill4",
			"sumsk4calc",
			"sumskill5",
			"sumsk5calc",
			"sumumod",
			"sumoverlay",
			"stsuccessonly",
			"stsound",
			"stsoundclass",
			"stsounddelay",
			"weaponsnd",
			"dosound",
			"dosound a",
			"dosound b",
			"tgtoverlay",
			"tgtsound",
			"prgoverlay",
			"prgsound",
			"castoverlay",
			"cltoverlaya",
			"cltoverlayb",
			"cltstfunc",
			"cltdofunc",
			"cltstopfunc",
			"cltprgfunc1",
			"cltprgfunc2",
			"cltprgfunc3",
			"cltmissile",
			"cltmissilea",
			"cltmissileb",
			"cltmissilec",
			"cltmissiled",
			"cltcalc1",
			"*cltcalc1 desc",
			"cltcalc2",
			"*cltcalc2 desc",
			"cltcalc3",
			"*cltcalc3 desc",
			"warp",
			"immediate",
			"enhanceable",
			"attackrank",
			"noammo",
			"range",
			"weapsel",
			"itypea1",
			"itypea2",
			"itypea3",
			"etypea1",
			"etypea2",
			"itypeb1",
			"itypeb2",
			"itypeb3",
			"etypeb1",
			"etypeb2",
			"anim",
			"seqtrans",
			"monanim",
			"seqnum",
			"seqinput",
			"durability",
			"UseAttackRate",
			"LineOfSight",
			"TargetableOnly",
			"SearchEnemyXY",
			"SearchEnemyNear",
			"SearchOpenXY",
			"SelectProc",
			"TargetCorpse",
			"TargetPet",
			"TargetAlly",
			"TargetItem",
			"AttackNoMana",
			"TgtPlaceCheck",
			"KeepCursorStateOnKill",
			"ContinueCastUnselected",
			"ClearSelectedOnHold",
			"ItemEffect",
			"ItemCltEffect",
			"ItemTgtDo",
			"ItemTarget",
			"ItemCheckStart",
			"ItemCltCheckStart",
			"ItemCastSound",
			"ItemCastOverlay",
			"skpoints",
			"reqlevel",
			"maxlvl",
			"reqstr",
			"reqdex",
			"reqint",
			"reqvit",
			"reqskill1",
			"reqskill2",
			"reqskill3",
			"restrict",
			"State1",
			"State2",
			"State3",
			"localdelay",
			"globaldelay",
			"leftskill",
			"rightskill",
			"repeat",
			"alwayshit",
			"usemanaondo",
			"startmana",
			"minmana",
			"manashift",
			"mana",
			"lvlmana",
			"interrupt",
			"InTown",
			"aura",
			"periodic",
			"perdelay",
			"finishing",
			"prgchargestocast",
			"prgchargesconsumed",
			"passive",
			"progressive",
			"scroll",
			"calc1",
			"*calc1 desc",
			"calc2",
			"*calc2 desc",
			"calc3",
			"*calc3 desc",
			"calc4",
			"*calc4 desc",
			"calc5",
			"*calc5 desc",
			"calc6",
			"*calc6 desc",
			"Param1",
			"*Param1 Description",
			"Param2",
			"*Param2 Description",
			"Param3",
			"*Param3 Description",
			"Param4",
			"*Param4 Description",
			"Param5",
			"*Param5 Description",
			"Param6",
			"*Param6 Description",
			"Param7",
			"*Param7 Description",
			"Param8",
			"*Param8 Description",
			"Param9",
			"*Param9 Description",
			"Param10",
			"*Param10 Description2", // wtf blizzard
			"Param11",
			"*Param11 Description",
			"Param12",
			"*Param12 Description",
			"InGame",
			"ToHit",
			"LevToHit",
			"ToHitCalc",
			"ResultFlags",
			"HitFlags",
			"HitClass",
			"Kick",
			"HitShift",
			"SrcDam",
			"MinDam",
			"MinLevDam1",
			"MinLevDam2",
			"MinLevDam3",
			"MinLevDam4",
			"MinLevDam5",
			"MaxDam",
			"MaxLevDam1",
			"MaxLevDam2",
			"MaxLevDam3",
			"MaxLevDam4",
			"MaxLevDam5",
			"DmgSymPerCalc",
			"EType",
			"EMin",
			"EMinLev1",
			"EMinLev2",
			"EMinLev3",
			"EMinLev4",
			"EMinLev5",
			"EMax",
			"EMaxLev1",
			"EMaxLev2",
			"EMaxLev3",
			"EMaxLev4",
			"EMaxLev5",
			"EDmgSymPerCalc",
			"ELen",
			"ELevLen1",
			"ELevLen2",
			"ELevLen3",
			"ELenSymPerCalc",
			"aitype",
			"aibonus",
			"cost mult",
			"cost add",
			"*eol"
		)
		
		const val SKILL = "skill"
		const val ID = "*Id"
		const val CHAR_CLASS = "charclass"
		const val SKILL_DESC = "skilldesc"
		const val SRV_ST_FUNC = "srvstfunc"
		const val SRV_DO_FUNC = "srvdofunc"
		const val SRV_STOP_FUNC = "srvstopfunc"
		const val PRG_STACK = "prgstack"
		const val SRV_PRG_FUNC_1 = "srvprgfunc1"
		const val SRV_PRG_FUNC_2 = "srvprgfunc2"
		const val SRV_PRG_FUNC_3 = "srvprgfunc3"
		const val PRG_CALC_1 = "prgcalc1"
		const val PRG_CALC_2 = "prgcalc2"
		const val PRG_CALC_3 = "prgcalc3"
		const val PRG_DAM = "prgdam"
		const val SRV_MISSILE = "srvmissile"
		const val DECQUANT = "decquant"
		const val LOB = "lob"
		const val SRV_MISSILE_A = "srvmissilea"
		const val SRV_MISSILE_B = "srvmissileb"
		const val SRV_MISSILE_C = "srvmissilec"
		const val USE_SERVER_MISSILES_ON_REMOTE_CLIENTS = "useServerMissilesOnRemoteClients"
		const val SRV_OVERLAY = "srvoverlay"
		const val AURA_FILTER = "aurafilter"
		const val AURA_STATE = "aurastate"
		const val AURA_TARGET_STATE = "auratargetstate"
		const val AURA_LEN_CALC = "auralencalc"
		const val AURA_RANGE_CALC = "aurarangecalc"
		const val AURA_STAT_1 = "aurastat1"
		const val AURA_STAT_CALC_1 = "aurastatcalc1"
		const val AURA_STAT_2 = "aurastat2"
		const val AURA_STAT_CALC_2 = "aurastatcalc2"
		const val AURA_STAT_3 = "aurastat3"
		const val AURA_STAT_CALC_3 = "aurastatcalc3"
		const val AURA_STAT_4 = "aurastat4"
		const val AURA_STAT_CALC_4 = "aurastatcalc4"
		const val AURA_STAT_5 = "aurastat5"
		const val AURA_STAT_CALC_5 = "aurastatcalc5"
		const val AURA_STAT_6 = "aurastat6"
		const val AURA_STAT_CALC_6 = "aurastatcalc6"
		const val AURA_EVENT_1 = "auraevent1"
		const val AURA_EVENT_FUNC_1 = "auraeventfunc1"
		const val AURA_EVENT_2 = "auraevent2"
		const val AURA_EVENT_FUNC_2 = "auraeventfunc2"
		const val AURA_EVENT_3 = "auraevent3"
		const val AURA_EVENT_FUNC_3 = "auraeventfunc3"
		const val PASSIVE_STATE = "passivestate"
		const val PASSIVE_ITYPE = "passiveitype"
		const val PASSIVE_REQ_WEAPON_COUNT = "passivereqweaponcount"
		const val PASSIVE_STAT_1 = "passivestat1"
		const val PASSIVE_CALC_1 = "passivecalc1"
		const val PASSIVE_STAT_2 = "passivestat2"
		const val PASSIVE_CALC_2 = "passivecalc2"
		const val PASSIVE_STAT_3 = "passivestat3"
		const val PASSIVE_CALC_3 = "passivecalc3"
		const val PASSIVE_STAT_4 = "passivestat4"
		const val PASSIVE_CALC_4 = "passivecalc4"
		const val PASSIVE_STAT_5 = "passivestat5"
		const val PASSIVE_CALC_5 = "passivecalc5"
		const val PASSIVE_STAT_6 = "passivestat6"
		const val PASSIVE_CALC_6 = "passivecalc6"
		const val SUMMON = "summon"
		const val PET_TYPE = "pettype"
		const val PET_MAX = "petmax"
		const val SUM_MODE = "summode"
		const val SUM_SKILL_1 = "sumskill1"
		const val SUM_SK_1_CALC = "sumsk1calc"
		const val SUM_SKILL_2 = "sumskill2"
		const val SUM_SK_2_CALC = "sumsk2calc"
		const val SUM_SKILL_3 = "sumskill3"
		const val SUM_SK_3_CALC = "sumsk3calc"
		const val SUM_SKILL_4 = "sumskill4"
		const val SUM_SK_4_CALC = "sumsk4calc"
		const val SUM_SKILL_5 = "sumskill5"
		const val SUM_SK_5_CALC = "sumsk5calc"
		const val SUM_U_MOD = "sumumod"
		const val SUM_OVERLAY = "sumoverlay"
		const val ST_SUCCESS_ONLY = "stsuccessonly"
		const val ST_SOUND = "stsound"
		const val ST_SOUND_CLASS = "stsoundclass"
		const val ST_SOUND_DELAY = "stsounddelay"
		const val WEAPON_SND = "weaponsnd"
		const val DO_SOUND = "dosound"
		const val DO_SOUND_A = "dosound a"
		const val DO_SOUND_B = "dosound b"
		const val TGT_OVERLAY = "tgtoverlay"
		const val TGT_SOUND = "tgtsound"
		const val PRG_OVERLAY = "prgoverlay"
		const val PRG_SOUND = "prgsound"
		const val CAST_OVERLAY = "castoverlay"
		const val CLT_OVERLAY_A = "cltoverlaya"
		const val CLT_OVERLAY_B = "cltoverlayb"
		const val CLT_ST_FUNC = "cltstfunc"
		const val CLT_DO_FUNC = "cltdofunc"
		const val CLT_STO_PFUNC = "cltstopfunc"
		const val CLT_PRG_FUNC_1 = "cltprgfunc1"
		const val CLT_PRG_FUNC_2 = "cltprgfunc2"
		const val CLT_PRG_FUNC_3 = "cltprgfunc3"
		const val CLT_MISSILE = "cltmissile"
		const val CLT_MISSILE_A = "cltmissilea"
		const val CLT_MISSILE_B = "cltmissileb"
		const val CLT_MISSILE_C = "cltmissilec"
		const val CLT_MISSILE_D = "cltmissiled"
		const val CLT_CALC_1 = "cltcalc1"
		const val CLT_CALC_1_DESC = "*cltcalc1 desc"
		const val CLT_CALC_2 = "cltcalc2"
		const val CLT_CALC_2_DESC = "*cltcalc2 desc"
		const val CLT_CALC_3 = "cltcalc3"
		const val CLT_CALC_3_DESC = "*cltcalc3 desc"
		const val WARP = "warp"
		const val IMMEDIATE = "immediate"
		const val ENHANCEABLE = "enhanceable"
		const val ATTACK_RANK = "attackrank"
		const val NO_AMMO = "noammo"
		const val RANGE = "range"
		const val WEAP_SEL = "weapsel"
		const val ITYPE_A1 = "itypea1"
		const val ITYPE_A2 = "itypea2"
		const val ITYPE_A3 = "itypea3"
		const val ETYPE_A1 = "etypea1"
		const val ETYPE_A2 = "etypea2"
		const val ITYPE_B1 = "itypeb1"
		const val ITYPE_B2 = "itypeb2"
		const val ITYPE_B3 = "itypeb3"
		const val ETYPE_B1 = "etypeb1"
		const val ETYPE_B2 = "etypeb2"
		const val ANIM = "anim"
		const val SEQ_TRANS = "seqtrans"
		const val MON_ANIM = "monanim"
		const val SEQ_NUM = "seqnum"
		const val SEQ_INPUT = "seqinput"
		const val DURABILITY = "durability"
		const val USE_ATTACK_RATE = "UseAttackRate"
		const val LINE_OF_SIGHT = "LineOfSight"
		const val TARGETABLE_ONLY = "TargetableOnly"
		const val SEARCH_ENEMY_XY = "SearchEnemyXY"
		const val SEARCH_ENEMY_NEAR = "SearchEnemyNear"
		const val SEARCH_OPEN_XY = "SearchOpenXY"
		const val SELECT_PROC = "SelectProc"
		const val TARGET_CORPSE = "TargetCorpse"
		const val TARGET_PET = "TargetPet"
		const val TARGET_ALLY = "TargetAlly"
		const val TARGET_ITEM = "TargetItem"
		const val ATTACK_NO_MANA = "AttackNoMana"
		const val TGT_PLACE_CHECK = "TgtPlaceCheck"
		const val KEEP_CURSOR_STATE_ON_KILL = "KeepCursorStateOnKill"
		const val CONTINUE_CAST_UNSELECTED = "ContinueCastUnselected"
		const val CLEAR_SELECTED_ON_HOLD = "ClearSelectedOnHold"
		const val ITEM_EFFECT = "ItemEffect"
		const val ITEM_CLT_EFFECT = "ItemCltEffect"
		const val ITEM_TGT_DO = "ItemTgtDo"
		const val ITEM_TARGET = "ItemTarget"
		const val ITEM_CHECK_START = "ItemCheckStart"
		const val ITEM_CLT_CHECK_START = "ItemCltCheckStart"
		const val ITEM_CAST_SOUND = "ItemCastSound"
		const val ITEM_CAST_OVERLAY = "ItemCastOverlay"
		const val SK_POINTS = "skpoints"
		const val REQ_LEVEL = "reqlevel"
		const val MAX_LVL = "maxlvl"
		const val REQ_STR = "reqstr"
		const val REQ_DEX = "reqdex"
		const val REQ_INT = "reqint"
		const val REQ_VIT = "reqvit"
		const val REQ_SKILL_1 = "reqskill1"
		const val REQ_SKILL_2 = "reqskill2"
		const val REQ_SKILL_3 = "reqskill3"
		const val RESTRICT = "restrict"
		const val STATE_1 = "State1"
		const val STATE_2 = "State2"
		const val STATE_3 = "State3"
		const val LOCAL_DELAY = "localdelay"
		const val GLOBAL_DELAY = "globaldelay"
		const val LEFT_SKILL = "leftskill"
		const val RIGHT_SKILL = "rightskill"
		const val REPEAT = "repeat"
		const val ALWAYS_HIT = "alwayshit"
		const val USE_MANA_ON_DO = "usemanaondo"
		const val START_MANA = "startmana"
		const val MIN_MANA = "minmana"
		const val MANA_SHIFT = "manashift"
		const val MANA = "mana"
		const val LVL_MANA = "lvlmana"
		const val INTERRUPT = "interrupt"
		const val IN_TOWN = "InTown"
		const val AURA = "aura"
		const val PERIODIC = "periodic"
		const val PERDELAY = "perdelay"
		const val FINISHING = "finishing"
		const val PRG_CHARGES_TO_CAST = "prgchargestocast"
		const val PRG_CHARGES_CONSUMED = "prgchargesconsumed"
		const val PASSIVE = "passive"
		const val PROGRESSIVE = "progressive"
		const val SCROLL = "scroll"
		const val CALC_1 = "calc1"
		const val CALC_1_DESC = "*calc1 desc"
		const val CALC_2 = "calc2"
		const val CALC_2_DESC = "*calc2 desc"
		const val CALC_3 = "calc3"
		const val CALC_3_DESC = "*calc3 desc"
		const val CALC_4 = "calc4"
		const val CALC_4_DESC = "*calc4 desc"
		const val CALC_5 = "calc5"
		const val CALC_5_DESC = "*calc5 desc"
		const val CALC_6 = "calc6"
		const val CALC_6_DESC = "*calc6 desc"
		const val PARAM_1 = "Param1"
		const val PARAM_1_DESCRIPTION = "*Param1 Description"
		const val PARAM_2 = "Param2"
		const val PARAM_2_DESCRIPTION = "*Param2 Description"
		const val PARAM_3 = "Param3"
		const val PARAM_3_DESCRIPTION = "*Param3 Description"
		const val PARAM_4 = "Param4"
		const val PARAM_4_DESCRIPTION = "*Param4 Description"
		const val PARAM_5 = "Param5"
		const val PARAM_5_DESCRIPTION = "*Param5 Description"
		const val PARAM_6 = "Param6"
		const val PARAM_6_DESCRIPTION = "*Param6 Description"
		const val PARAM_7 = "Param7"
		const val PARAM_7_DESCRIPTION = "*Param7 Description"
		const val PARAM_8 = "Param8"
		const val PARAM_8_DESCRIPTION = "*Param8 Description"
		const val PARAM_9 = "Param9"
		const val PARAM_9_DESCRIPTION = "*Param9 Description"
		const val PARAM_10 = "Param10"
		const val PARAM_10_DESCRIPTION = "*Param10 Description2" // wtf blizzard
		const val PARAM_11 = "Param11"
		const val PARAM_11_DESCRIPTION = "*Param11 Description"
		const val PARAM_12 = "Param12"
		const val PARAM_12_DESCRIPTION = "*Param12 Description"
		const val IN_GAME = "InGame"
		const val TO_HIT = "ToHit"
		const val LEV_TO_HIT = "LevToHit"
		const val TO_HIT_CALC = "ToHitCalc"
		const val RESULT_FLAGS = "ResultFlags"
		const val HIT_FLAGS = "HitFlags"
		const val HIT_CLASS = "HitClass"
		const val KICK = "Kick"
		const val HIT_SHIFT = "HitShift"
		const val SRC_DAM = "SrcDam"
		const val MIN_DAM = "MinDam"
		const val MIN_LEV_DAM_1 = "MinLevDam1"
		const val MIN_LEV_DAM_2 = "MinLevDam2"
		const val MIN_LEV_DAM_3 = "MinLevDam3"
		const val MIN_LEV_DAM_4 = "MinLevDam4"
		const val MIN_LEV_DAM_5 = "MinLevDam5"
		const val MAX_DAM = "MaxDam"
		const val MAX_LEV_DAM_1 = "MaxLevDam1"
		const val MAX_LEV_DAM_2 = "MaxLevDam2"
		const val MAX_LEV_DAM_3 = "MaxLevDam3"
		const val MAX_LEV_DAM_4 = "MaxLevDam4"
		const val MAX_LEV_DAM_5 = "MaxLevDam5"
		const val DMG_SYM_PER_CALC = "DmgSymPerCalc"
		const val E_TYPE = "EType"
		const val E_MIN = "EMin"
		const val E_MIN_LEV_1 = "EMinLev1"
		const val E_MIN_LEV_2 = "EMinLev2"
		const val E_MIN_LEV_3 = "EMinLev3"
		const val E_MIN_LEV_4 = "EMinLev4"
		const val E_MIN_LEV_5 = "EMinLev5"
		const val E_MAX = "EMax"
		const val E_MAX_LEV_1 = "EMaxLev1"
		const val E_MAX_LEV_2 = "EMaxLev2"
		const val E_MAX_LEV_3 = "EMaxLev3"
		const val E_MAX_LEV_4 = "EMaxLev4"
		const val E_MAX_LEV_5 = "EMaxLev5"
		const val E_DMG_SYM_PER_CALC = "EDmgSymPerCalc"
		const val E_LEN = "ELen"
		const val E_LEV_LEN_1 = "ELevLen1"
		const val E_LEV_LEN_2 = "ELevLen2"
		const val E_LEV_LEN_3 = "ELevLen3"
		const val E_LEN_SYM_PER_CALC = "ELenSymPerCalc"
		const val AI_TYPE = "aitype"
		const val AI_BONUS = "aibonus"
		const val COST_MULT = "cost mult"
		const val COST_ADD = "cost add"
		const val EOL = "*eol"
		
	}
	
	init {
		verify(HEADERS)
	}
	
}