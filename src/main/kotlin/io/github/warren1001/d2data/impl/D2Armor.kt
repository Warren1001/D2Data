package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Armor(manager: D2Sheets, dir: File) : D2Sheet(manager, dir, "armor") {
	
	companion object {
		
		private val HEADERS = listOf(
			"name",
			"version",
			"compactsave",
			"rarity",
			"spawnable",
			"minac",
			"maxac",
			"speed",
			"reqstr",
			"reqdex",
			"block",
			"durability",
			"nodurability",
			"level",
			"ShowLevel",
			"levelreq",
			"cost",
			"gamble cost",
			"code",
			"namestr",
			"magic lvl",
			"auto prefix",
			"alternategfx",
			"normcode",
			"ubercode",
			"ultracode",
			"component",
			"invwidth",
			"invheight",
			"hasinv",
			"gemsockets",
			"gemapplytype",
			"flippyfile",
			"invfile",
			"uniqueinvfile",
			"setinvfile",
			"rArm",
			"lArm",
			"Torso",
			"Legs",
			"rSPad",
			"lSPad",
			"useable",
			"stackable",
			"minstack",
			"maxstack",
			"spawnstack",
			"Transmogrify",
			"TMogType",
			"TMogMin",
			"TMogMax",
			"type",
			"type2",
			"dropsound",
			"dropsfxframe",
			"usesound",
			"unique",
			"transparent",
			"transtbl",
			"*quivered",
			"lightradius",
			"belt",
			"quest",
			"questdiffcheck",
			"missiletype",
			"durwarning",
			"qntwarning",
			"mindam",
			"maxdam",
			"StrBonus",
			"DexBonus",
			"gemoffset",
			"bitfield1",
			"CharsiMin",
			"CharsiMax",
			"CharsiMagicMin",
			"CharsiMagicMax",
			"CharsiMagicLvl",
			"GheedMin",
			"GheedMax",
			"GheedMagicMin",
			"GheedMagicMax",
			"GheedMagicLvl",
			"AkaraMin",
			"AkaraMax",
			"AkaraMagicMin",
			"AkaraMagicMax",
			"AkaraMagicLvl",
			"FaraMin",
			"FaraMax",
			"FaraMagicMin",
			"FaraMagicMax",
			"FaraMagicLvl",
			"LysanderMin",
			"LysanderMax",
			"LysanderMagicMin",
			"LysanderMagicMax",
			"LysanderMagicLvl",
			"DrognanMin",
			"DrognanMax",
			"DrognanMagicMin",
			"DrognanMagicMax",
			"DrognanMagicLvl",
			"HratliMin",
			"HratliMax",
			"HratliMagicMin",
			"HratliMagicMax",
			"HratliMagicLvl",
			"AlkorMin",
			"AlkorMax",
			"AlkorMagicMin",
			"AlkorMagicMax",
			"AlkorMagicLvl",
			"OrmusMin",
			"OrmusMax",
			"OrmusMagicMin",
			"OrmusMagicMax",
			"OrmusMagicLvl",
			"ElzixMin",
			"ElzixMax",
			"ElzixMagicMin",
			"ElzixMagicMax",
			"ElzixMagicLvl",
			"AshearaMin",
			"AshearaMax",
			"AshearaMagicMin",
			"AshearaMagicMax",
			"AshearaMagicLvl",
			"CainMin",
			"CainMax",
			"CainMagicMin",
			"CainMagicMax",
			"CainMagicLvl",
			"HalbuMin",
			"HalbuMax",
			"HalbuMagicMin",
			"HalbuMagicMax",
			"HalbuMagicLvl",
			"JamellaMin",
			"JamellaMax",
			"JamellaMagicMin",
			"JamellaMagicMax",
			"JamellaMagicLvl",
			"LarzukMin",
			"LarzukMax",
			"LarzukMagicMin",
			"LarzukMagicMax",
			"LarzukMagicLvl",
			"MalahMin",
			"MalahMax",
			"MalahMagicMin",
			"MalahMagicMax",
			"MalahMagicLvl",
			"AnyaMin",
			"AnyaMax",
			"AnyaMagicMin",
			"AnyaMagicMax",
			"AnyaMagicLvl",
			"Transform",
			"InvTrans",
			"SkipName",
			"NightmareUpgrade",
			"HellUpgrade",
			"Nameable",
			"PermStoreItem",
			"diablocloneweight"
		)
		
		const val NAME = "name"
		const val VERSION = "version"
		const val COMPACT_SAVE = "compactsave"
		const val RARITY = "rarity"
		const val SPAWNABLE = "spawnable"
		const val MIN_DEFENSE = "minac"
		const val MAX_DEFENSE = "maxac"
		const val SPEED = "speed"
		const val REQ_STR = "reqstr"
		const val REQ_DEX = "reqdex"
		const val BLOCK = "block"
		const val DURABILITY = "durability"
		const val NO_DURABILITY = "nodurability"
		const val LEVEL = "level"
		const val SHOW_LEVEL = "ShowLevel"
		const val LEVEL_REQ = "levelreq"
		const val COST = "cost"
		const val GAMBLE_COST = "gamble cost"
		const val CODE = "code"
		const val FULL_NAME = "namestr"
		const val MAGIC_LVL = "magic lvl"
		const val AUTO_PREFIX = "auto prefix"
		const val ALTERNATE_GFX = "alternategfx"
		const val NORM_CODE = "normcode"
		const val UBER_CODE = "ubercode"
		const val ULTRA_CODE = "ultracode"
		const val COMPONENT = "component"
		const val INV_WIDTH = "invwidth"
		const val INV_HEIGHT = "invheight"
		const val HAS_INV = "hasinv"
		const val GEM_SOCKETS = "gemsockets"
		const val GEM_APPLY_TYPE = "gemapplytype"
		const val FLIPPY_FILE = "flippyfile"
		const val INV_FILE = "invfile"
		const val UNIQUE_INV_FILE = "uniqueinvfile"
		const val SET_INV_FILE = "setinvfile"
		const val R_ARM = "rArm"
		const val L_ARM = "lArm"
		const val TORSO = "Torso"
		const val LEGS = "Legs"
		const val R_S_PAD = "rSPad"
		const val L_S_PAD = "lSPad"
		const val USEABLE = "useable"
		const val STACKABLE = "stackable"
		const val MIN_STACK = "minstack"
		const val MAX_STACK = "maxstack"
		const val SPAWN_STACK = "spawnstack"
		const val TRANSMOGRIFY = "Transmogrify"
		const val T_MOG_TYPE = "TMogType"
		const val T_MOG_MIN = "TMogMin"
		const val T_MOG_MAX = "TMogMax"
		const val TYPE = "type"
		const val TYPE_2 = "type2"
		const val DROP_SOUND = "dropsound"
		const val DROP_SFX_FRAME = "dropsfxframe"
		const val USE_SOUND = "usesound"
		const val UNIQUE = "unique"
		const val TRANSPARENT = "transparent"
		const val TRANS_TBL = "transtbl"
		const val QUIVERED = "*quivered"
		const val LIGHT_RADIUS = "lightradius"
		const val BELT = "belt"
		const val QUEST = "quest"
		const val QUEST_DIFF_CHECK = "questdiffcheck"
		const val MISSILE_TYPE = "missiletype"
		const val DUR_WARNING = "durwarning"
		const val QNT_WARNING = "qntwarning"
		const val MIN_DAM = "mindam"
		const val MAX_DAM = "maxdam"
		const val STR_BONUS = "StrBonus"
		const val DEX_BONUS = "DexBonus"
		const val GEMOFFSET = "gemoffset"
		const val BIT_FIELD_1 = "bitfield1"
		const val CHARSI_MIN = "CharsiMin"
		const val CHARSI_MAX = "CharsiMax"
		const val CHARSI_MAGIC_MIN = "CharsiMagicMin"
		const val CHARSI_MAGIC_MAX = "CharsiMagicMax"
		const val CHARSI_MAGIC_LVL = "CharsiMagicLvl"
		const val GHEED_MIN = "GheedMin"
		const val GHEED_MAX = "GheedMax"
		const val GHEED_MAGIC_MIN = "GheedMagicMin"
		const val GHEED_MAGIC_MAX = "GheedMagicMax"
		const val GHEED_MAGIC_LVL = "GheedMagicLvl"
		const val AKARA_MIN = "AkaraMin"
		const val AKARA_MAX = "AkaraMax"
		const val AKARA_MAGIC_MIN = "AkaraMagicMin"
		const val AKARA_MAGIC_MAX = "AkaraMagicMax"
		const val AKARA_MAGIC_LVL = "AkaraMagicLvl"
		const val FARA_MIN = "FaraMin"
		const val FARA_MAX = "FaraMax"
		const val FARA_MAGIC_MIN = "FaraMagicMin"
		const val FARA_MAGIC_MAX = "FaraMagicMax"
		const val FARA_MAGIC_LVL = "FaraMagicLvl"
		const val LYSANDER_MIN = "LysanderMin"
		const val LYSANDER_MAX = "LysanderMax"
		const val LYSANDER_MAGIC_MIN = "LysanderMagicMin"
		const val LYSANDER_MAGIC_MAX = "LysanderMagicMax"
		const val LYSANDER_MAGIC_LVL = "LysanderMagicLvl"
		const val DROGNAN_MIN = "DrognanMin"
		const val DROGNAN_MAX = "DrognanMax"
		const val DROGNAN_MAGIC_MIN = "DrognanMagicMin"
		const val DROGNAN_MAGIC_MAX = "DrognanMagicMax"
		const val DROGNAN_MAGIC_LVL = "DrognanMagicLvl"
		const val HRATLI_MIN = "HratliMin"
		const val HRATLI_MAX = "HratliMax"
		const val HRATLI_MAGIC_MIN = "HratliMagicMin"
		const val HRATLI_MAGIC_MAX = "HratliMagicMax"
		const val HRATLI_MAGIC_LVL = "HratliMagicLvl"
		const val ALKOR_MIN = "AlkorMin"
		const val ALKOR_MAX = "AlkorMax"
		const val ALKOR_MAGIC_MIN = "AlkorMagicMin"
		const val ALKOR_MAGIC_MAX = "AlkorMagicMax"
		const val ALKOR_MAGIC_LVL = "AlkorMagicLvl"
		const val ORMUS_MIN = "OrmusMin"
		const val ORMUS_MAX = "OrmusMax"
		const val ORMUS_MAGIC_MIN = "OrmusMagicMin"
		const val ORMUS_MAGIC_MAX = "OrmusMagicMax"
		const val ORMUS_MAGIC_LVL = "OrmusMagicLvl"
		const val ELZIX_MIN = "ElzixMin"
		const val ELZIX_MAX = "ElzixMax"
		const val ELZIX_MAGIC_MIN = "ElzixMagicMin"
		const val ELZIX_MAGIC_MAX = "ElzixMagicMax"
		const val ELZIX_MAGIC_LVL = "ElzixMagicLvl"
		const val ASHEARA_MIN = "AshearaMin"
		const val ASHEARA_MAX = "AshearaMax"
		const val ASHEARA_MAGIC_MIN = "AshearaMagicMin"
		const val ASHEARA_MAGIC_MAX = "AshearaMagicMax"
		const val ASHEARA_MAGIC_LVL = "AshearaMagicLvl"
		const val CAIN_MIN = "CainMin"
		const val CAIN_MAX = "CainMax"
		const val CAIN_MAGIC_MIN = "CainMagicMin"
		const val CAIN_MAGIC_MAX = "CainMagicMax"
		const val CAIN_MAGIC_LVL = "CainMagicLvl"
		const val HALBU_MIN = "HalbuMin"
		const val HALBU_MAX = "HalbuMax"
		const val HALBU_MAGIC_MIN = "HalbuMagicMin"
		const val HALBU_MAGIC_MAX = "HalbuMagicMax"
		const val HALBU_MAGIC_LVL = "HalbuMagicLvl"
		const val JAMELLA_MIN = "JamellaMin"
		const val JAMELLA_MAX = "JamellaMax"
		const val JAMELLA_MAGIC_MIN = "JamellaMagicMin"
		const val JAMELLA_MAGIC_MAX = "JamellaMagicMax"
		const val JAMELLA_MAGIC_LVL = "JamellaMagicLvl"
		const val LARZUK_MIN = "LarzukMin"
		const val LARZUK_MAX = "LarzukMax"
		const val LARZUK_MAGIC_MIN = "LarzukMagicMin"
		const val LARZUK_MAGIC_MAX = "LarzukMagicMax"
		const val LARZUK_MAGIC_LVL = "LarzukMagicLvl"
		const val MALAH_MIN = "MalahMin"
		const val MALAH_MAX = "MalahMax"
		const val MALAH_MAGIC_MIN = "MalahMagicMin"
		const val MALAH_MAGIC_MAX = "MalahMagicMax"
		const val MALAH_MAGIC_LVL = "MalahMagicLvl"
		const val ANYA_MIN = "AnyaMin"
		const val ANYA_MAX = "AnyaMax"
		const val ANYA_MAGIC_MIN = "AnyaMagicMin"
		const val ANYA_MAGIC_MAX = "AnyaMagicMax"
		const val ANYA_MAGIC_LVL = "AnyaMagicLvl"
		const val TRANSFORM = "Transform"
		const val INV_TRANS = "InvTrans"
		const val SKIP_NAME = "SkipName"
		const val NIGHTMARE_UPGRADE = "NightmareUpgrade"
		const val HELL_UPGRADE = "HellUpgrade"
		const val NAMEABLE = "Nameable"
		const val PERM_STORE_ITEM = "PermStoreItem"
		const val DIABLO_CLONE_WEIGHT = "diablocloneweight"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}