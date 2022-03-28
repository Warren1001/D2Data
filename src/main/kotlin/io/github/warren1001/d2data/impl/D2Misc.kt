package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2SheetManager
import java.io.File

class D2Misc(manager: D2SheetManager, dir: File): D2Sheet(manager, dir, "misc") {
	
	companion object {
		
		const val NAME = "name"
		const val COMPACT_SAVE = "compactsave"
		const val VERSION = "version"
		const val LEVEL = "level"
		const val SHOW_LEVEL = "ShowLevel"
		const val LEVEL_REQ = "levelreq"
		const val REQ_STR = "reqstr"
		const val REQ_DEX = "reqdex"
		const val RARITY = "rarity"
		const val SPAWNABLE = "spawnable"
		const val SPEED = "speed"
		const val NO_DURABILITY = "nodurability"
		const val COST = "cost"
		const val GAMBLE_COST = "gamble cost"
		const val CODE = "code"
		const val ALTERNATE_GFX = "alternategfx"
		const val NAME_STR = "namestr"
		const val COMPONENT = "component"
		const val INV_WIDTH = "invwidth"
		const val INV_HEIGHT = "invheight"
		const val HAS_INV = "hasinv"
		const val GEM_SOCKETS = "gemsockets"
		const val GEM_APPLY_TYPE = "gemapplytype"
		const val FLIPPY_FILE = "flippyfile"
		const val INV_FILE = "invfile"
		const val UNIQUE_INV_FILE = "uniqueinvfile"
		const val TRANSMOGRIFY = "Transmogrify"
		const val T_MOG_TYPE = "TMogType"
		const val T_MOG_MIN = "TMogMin"
		const val T_MOG_MAX = "TMogMax"
		const val USEABLE = "useable"
		const val TYPE = "type"
		const val TYPE_2 = "type2"
		const val DROP_SOUND = "dropsound"
		const val DROP_SFX_FRAME = "dropsfxframe"
		const val USE_SOUND = "usesound"
		const val UNIQUE = "unique"
		const val TRANSPARENT = "transparent"
		const val TRANS_TBL = "transtbl"
		const val LIGHT_RADIUS = "lightradius"
		const val BELT = "belt"
		const val AUTO_BELT = "autobelt"
		const val STACKABLE = "stackable"
		const val MIN_STACK = "minstack"
		const val MAX_STACK = "maxstack"
		const val SPAWN_STACK = "spawnstack"
		const val QUEST = "quest"
		const val QUEST_DIFF_CHECK = "questdiffcheck"
		const val MISSILE_TYPE = "missiletype"
		const val SPELL_ICON = "spellicon"
		const val P_SPELL = "pSpell"
		const val STATE = "state"
		const val CSTATE_1 = "cstate1"
		const val CSTATE_2 = "cstate2"
		const val LEN = "len"
		const val STAT_1 = "stat1"
		const val CALC_1 = "calc1"
		const val STAT_2 = "stat2"
		const val CALC_2 = "calc2"
		const val STAT_3 = "stat3"
		const val CALC_3 = "calc3"
		const val SPELL_DESC = "spelldesc"
		const val SPELL_DESC_STR = "spelldescstr"
		const val SPELL_DESC_STR_2 = "spelldescstr2"
		const val SPELL_DESC_CALC = "spelldesccalc"
		const val SPELL_DESC_COLOR = "spelldesccolor"
		const val DUR_WARNING = "durwarning"
		const val QNT_WARNING = "qntwarning"
		const val GEM_OFFSET = "gemoffset"
		const val BETTER_GEM = "BetterGem"
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
		const val MALAH_MIN = "MalahMin"
		const val MALAH_MAX = "MalahMax"
		const val MALAH_MAGIC_MIN = "MalahMagicMin"
		const val MALAH_MAGIC_MAX = "MalahMagicMax"
		const val MALAH_MAGIC_LVL = "MalahMagicLvl"
		const val LARZUK_MIN = "LarzukMin"
		const val LARZUK_MAX = "LarzukMax"
		const val LARZUK_MAGIC_MIN = "LarzukMagicMin"
		const val LARZUK_MAGIC_MAX = "LarzukMagicMax"
		const val LARZUK_MAGIC_LVL = "LarzukMagicLvl"
		const val ANYA_MIN = "AnyaMin"
		const val ANYA_MAX = "AnyaMax"
		const val ANYA_MAGIC_MIN = "AnyaMagicMin"
		const val ANYA_MAGIC_MAX = "AnyaMagicMax"
		const val ANYA_MAGIC_LVL = "AnyaMagicLvl"
		const val JAMELLA_MIN = "JamellaMin"
		const val JAMELLA_MAX = "JamellaMax"
		const val JAMELLA_MAGIC_MIN = "JamellaMagicMin"
		const val JAMELLA_MAGIC_MAX = "JamellaMagicMax"
		const val JAMELLA_MAGIC_LVL = "JamellaMagicLvl"
		const val TRANSFORM = "Transform"
		const val INV_TRANS = "InvTrans"
		const val SKIP_NAME = "SkipName"
		const val NIGHTMARE_UPGRADE = "NightmareUpgrade"
		const val HELL_UPGRADE = "HellUpgrade"
		const val MIN_DAM = "mindam"
		const val MAX_DAM = "maxdam"
		const val PERM_STORE_ITEM = "PermStoreItem"
		const val MULTIBUY = "multibuy"
		const val NAMEABLE = "Nameable"
		const val WORLD_EVENT = "worldevent"
		
	}
	
}