package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Armor(header: String, vararg headerHistory: String): D2Header {
	
	NAME("name"),
	VERSION("version"),
	COMPACT_SAVE("compactsave"),
	RARITY("rarity"),
	SPAWNABLE("spawnable"),
	MIN_DEFENSE("minac"),
	MAX_DEFENSE("maxac"),
	SPEED("speed"),
	REQ_STR("reqstr"),
	REQ_DEX("reqdex"),
	BLOCK("block"),
	DURABILITY("durability"),
	NO_DURABILITY("nodurability"),
	LEVEL("level"),
	SHOW_LEVEL("ShowLevel"),
	LEVEL_REQ("levelreq"),
	COST("cost"),
	GAMBLE_COST("gamble cost"),
	CODE("code"),
	NAME_STR("namestr"),
	MAGIC_LVL("magic lvl"),
	AUTO_PREFIX("auto prefix"),
	ALTERNATE_GFX("alternategfx"),
	NORM_CODE("normcode"),
	UBER_CODE("ubercode"),
	ULTRA_CODE("ultracode"),
	COMPONENT("component"),
	INV_WIDTH("invwidth"),
	INV_HEIGHT("invheight"),
	HAS_INV("hasinv"),
	GEM_SOCKETS("gemsockets"),
	GEM_APPLY_TYPE("gemapplytype"),
	FLIPPY_FILE("flippyfile"),
	INV_FILE("invfile"),
	UNIQUE_INV_FILE("uniqueinvfile"),
	SET_INV_FILE("setinvfile"),
	R_ARM("rArm"),
	L_ARM("lArm"),
	TORSO("Torso"),
	LEGS("Legs"),
	R_S_PAD("rSPad"),
	L_S_PAD("lSPad"),
	USEABLE("useable"),
	STACKABLE("stackable"),
	MIN_STACK("minstack"),
	MAX_STACK("maxstack"),
	SPAWN_STACK("spawnstack"),
	TRANSMOGRIFY("Transmogrify"),
	T_MOG_TYPE("TMogType"),
	T_MOG_MIN("TMogMin"),
	T_MOG_MAX("TMogMax"),
	TYPE("type"),
	TYPE_2("type2"),
	DROP_SOUND("dropsound"),
	DROP_SFX_FRAME("dropsfxframe"),
	USE_SOUND("usesound"),
	UNIQUE("unique"),
	TRANSPARENT("transparent"),
	TRANS_TBL("transtbl"),
	QUIVERED("*quivered"),
	LIGHT_RADIUS("lightradius"),
	BELT("belt"),
	QUEST("quest"),
	QUEST_DIFF_CHECK("questdiffcheck"),
	MISSILE_TYPE("missiletype"),
	DUR_WARNING("durwarning"),
	QNT_WARNING("qntwarning"),
	MIN_DAM("mindam"),
	MAX_DAM("maxdam"),
	STR_BONUS("StrBonus"),
	DEX_BONUS("DexBonus"),
	GEMOFFSET("gemoffset"),
	BIT_FIELD_1("bitfield1"),
	CHARSI_MIN("CharsiMin"),
	CHARSI_MAX("CharsiMax"),
	CHARSI_MAGIC_MIN("CharsiMagicMin"),
	CHARSI_MAGIC_MAX("CharsiMagicMax"),
	CHARSI_MAGIC_LVL("CharsiMagicLvl"),
	GHEED_MIN("GheedMin"),
	GHEED_MAX("GheedMax"),
	GHEED_MAGIC_MIN("GheedMagicMin"),
	GHEED_MAGIC_MAX("GheedMagicMax"),
	GHEED_MAGIC_LVL("GheedMagicLvl"),
	AKARA_MIN("AkaraMin"),
	AKARA_MAX("AkaraMax"),
	AKARA_MAGIC_MIN("AkaraMagicMin"),
	AKARA_MAGIC_MAX("AkaraMagicMax"),
	AKARA_MAGIC_LVL("AkaraMagicLvl"),
	FARA_MIN("FaraMin"),
	FARA_MAX("FaraMax"),
	FARA_MAGIC_MIN("FaraMagicMin"),
	FARA_MAGIC_MAX("FaraMagicMax"),
	FARA_MAGIC_LVL("FaraMagicLvl"),
	LYSANDER_MIN("LysanderMin"),
	LYSANDER_MAX("LysanderMax"),
	LYSANDER_MAGIC_MIN("LysanderMagicMin"),
	LYSANDER_MAGIC_MAX("LysanderMagicMax"),
	LYSANDER_MAGIC_LVL("LysanderMagicLvl"),
	DROGNAN_MIN("DrognanMin"),
	DROGNAN_MAX("DrognanMax"),
	DROGNAN_MAGIC_MIN("DrognanMagicMin"),
	DROGNAN_MAGIC_MAX("DrognanMagicMax"),
	DROGNAN_MAGIC_LVL("DrognanMagicLvl"),
	HRATLI_MIN("HratliMin"),
	HRATLI_MAX("HratliMax"),
	HRATLI_MAGIC_MIN("HratliMagicMin"),
	HRATLI_MAGIC_MAX("HratliMagicMax"),
	HRATLI_MAGIC_LVL("HratliMagicLvl"),
	ALKOR_MIN("AlkorMin"),
	ALKOR_MAX("AlkorMax"),
	ALKOR_MAGIC_MIN("AlkorMagicMin"),
	ALKOR_MAGIC_MAX("AlkorMagicMax"),
	ALKOR_MAGIC_LVL("AlkorMagicLvl"),
	ORMUS_MIN("OrmusMin"),
	ORMUS_MAX("OrmusMax"),
	ORMUS_MAGIC_MIN("OrmusMagicMin"),
	ORMUS_MAGIC_MAX("OrmusMagicMax"),
	ORMUS_MAGIC_LVL("OrmusMagicLvl"),
	ELZIX_MIN("ElzixMin"),
	ELZIX_MAX("ElzixMax"),
	ELZIX_MAGIC_MIN("ElzixMagicMin"),
	ELZIX_MAGIC_MAX("ElzixMagicMax"),
	ELZIX_MAGIC_LVL("ElzixMagicLvl"),
	ASHEARA_MIN("AshearaMin"),
	ASHEARA_MAX("AshearaMax"),
	ASHEARA_MAGIC_MIN("AshearaMagicMin"),
	ASHEARA_MAGIC_MAX("AshearaMagicMax"),
	ASHEARA_MAGIC_LVL("AshearaMagicLvl"),
	CAIN_MIN("CainMin"),
	CAIN_MAX("CainMax"),
	CAIN_MAGIC_MIN("CainMagicMin"),
	CAIN_MAGIC_MAX("CainMagicMax"),
	CAIN_MAGIC_LVL("CainMagicLvl"),
	HALBU_MIN("HalbuMin"),
	HALBU_MAX("HalbuMax"),
	HALBU_MAGIC_MIN("HalbuMagicMin"),
	HALBU_MAGIC_MAX("HalbuMagicMax"),
	HALBU_MAGIC_LVL("HalbuMagicLvl"),
	JAMELLA_MIN("JamellaMin"),
	JAMELLA_MAX("JamellaMax"),
	JAMELLA_MAGIC_MIN("JamellaMagicMin"),
	JAMELLA_MAGIC_MAX("JamellaMagicMax"),
	JAMELLA_MAGIC_LVL("JamellaMagicLvl"),
	LARZUK_MIN("LarzukMin"),
	LARZUK_MAX("LarzukMax"),
	LARZUK_MAGIC_MIN("LarzukMagicMin"),
	LARZUK_MAGIC_MAX("LarzukMagicMax"),
	LARZUK_MAGIC_LVL("LarzukMagicLvl"),
	MALAH_MIN("MalahMin"),
	MALAH_MAX("MalahMax"),
	MALAH_MAGIC_MIN("MalahMagicMin"),
	MALAH_MAGIC_MAX("MalahMagicMax"),
	MALAH_MAGIC_LVL("MalahMagicLvl"),
	ANYA_MIN("AnyaMin"),
	ANYA_MAX("AnyaMax"),
	ANYA_MAGIC_MIN("AnyaMagicMin"),
	ANYA_MAGIC_MAX("AnyaMagicMax"),
	ANYA_MAGIC_LVL("AnyaMagicLvl"),
	TRANSFORM("Transform"),
	INV_TRANS("InvTrans"),
	SKIP_NAME("SkipName"),
	NIGHTMARE_UPGRADE("NightmareUpgrade"),
	HELL_UPGRADE("HellUpgrade"),
	NAMEABLE("Nameable"),
	PERM_STORE_ITEM("PermStoreItem"),
	DIABLO_CLONE_WEIGHT("diablocloneweight");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/armor.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = CODE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}