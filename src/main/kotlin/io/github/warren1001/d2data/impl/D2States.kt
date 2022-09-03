package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2States(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "states") {
	
	companion object {
		
		private val HEADERS = listOf("state", "*ID", "group", "remhit", "nosend", "transform", "aura", "curable", "curse", "active", "restrict", "disguise", "attblue", "damblue", "armblue", "rfblue", "rlblue", "rcblue", "stambarblue", "rpblue", "attred", "damred", "armred", "rfred", "rlred", "rcred", "rpred", "exp", "plrstaydeath", "monstaydeath", "bossstaydeath", "hide", "hidedead", "shatter", "udead", "life", "green", "pgsv", "nooverlays", "noclear", "bossinv", "meleeonly", "notondead", "overlay1", "overlay2", "overlay3", "overlay4", "pgsvoverlay", "castoverlay", "removerlay", "stat", "setfunc", "remfunc", "missile", "skill", "itemtype", "itemtrans", "colorpri", "colorshift", "light-r", "light-g", "light-b", "onsound", "offsound", "gfxtype", "gfxclass", "cltevent", "clteventfunc", "cltactivefunc", "srvactivefunc", "canstack", "*eol")
		
		const val STATE = "state"
		const val ID = "*ID"
		const val GROUP = "group"
		const val REM_HIT = "remhit"
		const val NO_SEND = "nosend"
		const val TRANSFORM = "transform"
		const val AURA = "aura"
		const val CURABLE = "curable"
		const val CURSE = "curse"
		const val ACTIVE = "active"
		const val RESTRICT = "restrict"
		const val DISGUISE = "disguise"
		const val ATT_BLUE = "attblue"
		const val DAM_BLUE = "damblue"
		const val ARM_BLUE = "armblue"
		const val RF_BLUE = "rfblue"
		const val RL_BLUE = "rlblue"
		const val RC_BLUE = "rcblue"
		const val STAM_BAR_BLUE = "stambarblue"
		const val RP_BLUE = "rpblue"
		const val ATT_RED = "attred"
		const val DAM_RED = "damred"
		const val ARM_RED = "armred"
		const val RF_RED = "rfred"
		const val RL_RED = "rlred"
		const val RC_RED = "rcred"
		const val RP_RED = "rpred"
		const val EXP = "exp"
		const val PLR_STAY_DEATH = "plrstaydeath"
		const val MON_STAY_DEATH = "monstaydeath"
		const val BOSS_STAY_DEATH = "bossstaydeath"
		const val HIDE = "hide"
		const val HIDE_DEAD = "hidedead"
		const val SHATTER = "shatter"
		const val UDEAD = "udead"
		const val LIFE = "life"
		const val GREEN = "green"
		const val PGSV = "pgsv"
		const val NO_OVERLAYS = "nooverlays"
		const val NO_CLEAR = "noclear"
		const val BOSS_INV = "bossinv"
		const val MELEE_ONLY = "meleeonly"
		const val NOT_ON_DEAD = "notondead"
		const val OVERLAY_1 = "overlay1"
		const val OVERLAY_2 = "overlay2"
		const val OVERLAY_3 = "overlay3"
		const val OVERLAY_4 = "overlay4"
		const val PGSV_OVERLAY = "pgsvoverlay"
		const val CAST_OVERLAY = "castoverlay"
		const val REM_OVERLAY = "removerlay"
		const val STAT = "stat"
		const val SET_FUNC = "setfunc"
		const val REM_FUNC = "remfunc"
		const val MISSILE = "missile"
		const val SKILL = "skill"
		const val ITEM_TYPE = "itemtype"
		const val ITEM_TRANS = "itemtrans"
		const val COLOR_PRI = "colorpri"
		const val COLOR_SHIFT = "colorshift"
		const val LIGHT_R = "light-r"
		const val LIGHT_G = "light-g"
		const val LIGHT_B = "light-b"
		const val ON_SOUND = "onsound"
		const val OFF_SOUND = "offsound"
		const val GFX_TYPE = "gfxtype"
		const val GFX_CLASS = "gfxclass"
		const val CLT_EVENT = "cltevent"
		const val CLT_EVENT_FUNC = "clteventfunc"
		const val CLT_ACTIVE_FUNC = "cltactivefunc"
		const val SRV_ACTIVE_FUNC = "srvactivefunc"
		const val CAN_STACK = "canstack"
		const val EOL = "*eol"
		
	}
	
	init { verify(HEADERS) }
	
}