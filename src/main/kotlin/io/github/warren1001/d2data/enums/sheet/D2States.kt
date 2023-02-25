package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2States(override val header: String): D2Header {
	
	STATE("state"),
	ID("*ID"),
	GROUP("group"),
	REM_HIT("remhit"),
	NO_SEND("nosend"),
	TRANSFORM("transform"),
	AURA("aura"),
	CURABLE("curable"),
	CURSE("curse"),
	ACTIVE("active"),
	RESTRICT("restrict"),
	DISGUISE("disguise"),
	ATT_BLUE("attblue"),
	DAM_BLUE("damblue"),
	ARM_BLUE("armblue"),
	RF_BLUE("rfblue"),
	RL_BLUE("rlblue"),
	RC_BLUE("rcblue"),
	STAM_BAR_BLUE("stambarblue"),
	RP_BLUE("rpblue"),
	ATT_RED("attred"),
	DAM_RED("damred"),
	ARM_RED("armred"),
	RF_RED("rfred"),
	RL_RED("rlred"),
	RC_RED("rcred"),
	RP_RED("rpred"),
	EXP("exp"),
	PLR_STAY_DEATH("plrstaydeath"),
	MON_STAY_DEATH("monstaydeath"),
	BOSS_STAY_DEATH("bossstaydeath"),
	HIDE("hide"),
	HIDE_DEAD("hidedead"),
	SHATTER("shatter"),
	UDEAD("udead"),
	LIFE("life"),
	GREEN("green"),
	PGSV("pgsv"),
	NO_OVERLAYS("nooverlays"),
	NO_CLEAR("noclear"),
	BOSS_INV("bossinv"),
	MELEE_ONLY("meleeonly"),
	NOT_ON_DEAD("notondead"),
	OVERLAY_1("overlay1"),
	OVERLAY_2("overlay2"),
	OVERLAY_3("overlay3"),
	OVERLAY_4("overlay4"),
	PGSV_OVERLAY("pgsvoverlay"),
	CAST_OVERLAY("castoverlay"),
	REM_OVERLAY("removerlay"),
	STAT("stat"),
	SET_FUNC("setfunc"),
	REM_FUNC("remfunc"),
	MISSILE("missile"),
	SKILL("skill"),
	ITEM_TYPE("itemtype"),
	ITEM_TRANS("itemtrans"),
	COLOR_PRI("colorpri"),
	COLOR_SHIFT("colorshift"),
	LIGHT_R("light-r"),
	LIGHT_G("light-g"),
	LIGHT_B("light-b"),
	ON_SOUND("onsound"),
	OFF_SOUND("offsound"),
	GFX_TYPE("gfxtype"),
	GFX_CLASS("gfxclass"),
	CLT_EVENT("cltevent"),
	CLT_EVENT_FUNC("clteventfunc"),
	CLT_ACTIVE_FUNC("cltactivefunc"),
	SRV_ACTIVE_FUNC("srvactivefunc"),
	CAN_STACK("canstack"),
	SUNDER_FULL("sunderfull"),
	SUNDER_RES_REDUCE("sunder-res-reduce"),
	EOL("*eol");
	
	companion object {
		val FILE_PATH = "global/excel/states.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = STATE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}