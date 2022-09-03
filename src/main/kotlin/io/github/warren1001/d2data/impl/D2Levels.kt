package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Levels(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "levels") {
	
	companion object {
		
		private val HEADERS = listOf("Name", "*StringName", "Id", "Pal", "Act", "QuestFlag", "QuestFlagEx", "Layer", "SizeX", "SizeY", "SizeX(N)", "SizeY(N)", "SizeX(H)", "SizeY(H)", "OffsetX", "OffsetY", "Depend", "Teleport", "Rain", "Mud", "NoPer", "LOSDraw", "FloorFilter", "BlankScreen", "DrawEdges", "*IsInside", "DrlgType", "LevelType", "SubType", "SubTheme", "SubWaypoint", "SubShrine", "Vis0", "Vis1", "Vis2", "Vis3", "Vis4", "Vis5", "Vis6", "Vis7", "Warp0", "Warp1", "Warp2", "Warp3", "Warp4", "Warp5", "Warp6", "Warp7", "Intensity", "Red", "Green", "Blue", "Portal", "Position", "SaveMonsters", "Quest", "WarpDist", "MonLvl", "MonLvl(N)", "MonLvl(H)", "MonLvlEx", "MonLvlEx(N)", "MonLvlEx(H)", "MonDen", "MonDen(N)", "MonDen(H)", "MonUMin", "MonUMax", "MonUMin(N)", "MonUMax(N)", "MonUMin(H)", "MonUMax(H)", "MonWndr", "MonSpcWalk", "NumMon", "mon1", "mon2", "mon3", "mon4", "mon5", "mon6", "mon7", "mon8", "mon9", "mon10", "mon11", "mon12", "mon13", "mon14", "mon15", "mon16", "mon17", "mon18", "mon19", "mon20", "mon21", "mon22", "mon23", "mon24", "mon25", "rangedspawn", "nmon1", "nmon2", "nmon3", "nmon4", "nmon5", "nmon6", "nmon7", "nmon8", "nmon9", "nmon10", "nmon11", "nmon12", "nmon13", "nmon14", "nmon15", "nmon16", "nmon17", "nmon18", "nmon19", "nmon20", "nmon21", "nmon22", "nmon23", "nmon24", "nmon25", "umon1", "umon2", "umon3", "umon4", "umon5", "umon6", "umon7", "umon8", "umon9", "umon10", "umon11", "umon12", "umon13", "umon14", "umon15", "umon16", "umon17", "umon18", "umon19", "umon20", "umon21", "umon22", "umon23", "umon24", "umon25", "cmon1", "cmon2", "cmon3", "cmon4", "cpct1", "cpct2", "cpct3", "cpct4", "camt1", "camt2", "camt3", "camt4", "Themes", "SoundEnv", "Waypoint", "LevelName", "LevelWarp", "LevelEntry", "ObjGrp0", "ObjGrp1", "ObjGrp2", "ObjGrp3", "ObjGrp4", "ObjGrp5", "ObjGrp6", "ObjGrp7", "ObjPrb0", "ObjPrb1", "ObjPrb2", "ObjPrb3", "ObjPrb4", "ObjPrb5", "ObjPrb6", "ObjPrb7")
		
		const val NAME = "Name"
		const val STRING_NAME = "*StringName"
		const val ID = "Id"
		const val PAL = "Pal"
		const val ACT = "Act"
		const val QUEST_FLAG = "QuestFlag"
		const val QUEST_FLAG_EX = "QuestFlagEx"
		const val LAYER = "Layer"
		const val SIZE_X = "SizeX"
		const val SIZE_Y = "SizeY"
		const val SIZE_X_NIGHTMARE = "SizeX(N)"
		const val SIZE_Y_NIGHTMARE = "SizeY(N)"
		const val SIZE_X_HELL = "SizeX(H)"
		const val SIZE_Y_HELL = "SizeY(H)"
		const val OFFSET_X = "OffsetX"
		const val OFFSET_Y = "OffsetY"
		const val DEPEND = "Depend"
		const val TELEPORT = "Teleport"
		const val RAIN = "Rain"
		const val MUD = "Mud"
		const val NO_PER = "NoPer"
		const val LOS_DRAW = "LOSDraw"
		const val FLOOR_FILTER = "FloorFilter"
		const val BLANK_SCREEN = "BlankScreen"
		const val DRAW_EDGES = "DrawEdges"
		const val IS_INSIDE = "*IsInside"
		const val DRLG_TYPE = "DrlgType"
		const val LEVEL_TYPE = "LevelType"
		const val SUB_TYPE = "SubType"
		const val SUB_THEME = "SubTheme"
		const val SUB_WAYPOINT = "SubWaypoint"
		const val SUB_SHRINE = "SubShrine"
		const val VIS_0 = "Vis0"
		const val VIS_1 = "Vis1"
		const val VIS_2 = "Vis2"
		const val VIS_3 = "Vis3"
		const val VIS_4 = "Vis4"
		const val VIS_5 = "Vis5"
		const val VIS_6 = "Vis6"
		const val VIS_7 = "Vis7"
		const val WARP_0 = "Warp0"
		const val WARP_1 = "Warp1"
		const val WARP_2 = "Warp2"
		const val WARP_3 = "Warp3"
		const val WARP_4 = "Warp4"
		const val WARP_5 = "Warp5"
		const val WARP_6 = "Warp6"
		const val WARP_7 = "Warp7"
		const val INTENSITY = "Intensity"
		const val RED = "Red"
		const val GREEN = "Green"
		const val BLUE = "Blue"
		const val PORTAL = "Portal"
		const val POSITION = "Position"
		const val SAVE_MONSTERS = "SaveMonsters"
		const val QUEST = "Quest"
		const val WARP_DIST = "WarpDist"
		const val MON_LVL = "MonLvl"
		const val MON_LVL_NIGHTMARE = "MonLvl(N)"
		const val MON_LVL_HELL = "MonLvl(H)"
		const val MON_LVL_EX = "MonLvlEx"
		const val MON_LVL_EX_NIGHTMARE = "MonLvlEx(N)"
		const val MON_LVL_EX_HELL = "MonLvlEx(H)"
		const val MON_DEN = "MonDen"
		const val MON_DEN_NIGHTMARE = "MonDen(N)"
		const val MON_DEN_HELL = "MonDen(H)"
		const val MON_U_MIN = "MonUMin"
		const val MON_U_MAX = "MonUMax"
		const val MON_U_MIN_NIGHTMARE = "MonUMin(N)"
		const val MON_U_MAX_NIGHTMARE = "MonUMax(N)"
		const val MON_U_MIN_HELL = "MonUMin(H)"
		const val MON_U_MAX_HELL = "MonUMax(H)"
		const val MON_WNDR = "MonWndr"
		const val MON_SPC_WALK = "MonSpcWalk"
		const val NUM_MON = "NumMon"
		const val MON_1 = "mon1"
		const val MON_2 = "mon2"
		const val MON_3 = "mon3"
		const val MON_4 = "mon4"
		const val MON_5 = "mon5"
		const val MON_6 = "mon6"
		const val MON_7 = "mon7"
		const val MON_8 = "mon8"
		const val MON_9 = "mon9"
		const val MON_10 = "mon10"
		const val MON_11 = "mon11"
		const val MON_12 = "mon12"
		const val MON_13 = "mon13"
		const val MON_14 = "mon14"
		const val MON_15 = "mon15"
		const val MON_16 = "mon16"
		const val MON_17 = "mon17"
		const val MON_18 = "mon18"
		const val MON_19 = "mon19"
		const val MON_20 = "mon20"
		const val MON_21 = "mon21"
		const val MON_22 = "mon22"
		const val MON_23 = "mon23"
		const val MON_24 = "mon24"
		const val MON_25 = "mon25"
		const val RANGEDSPAWN = "rangedspawn"
		const val NMON_1 = "nmon1"
		const val NMON_2 = "nmon2"
		const val NMON_3 = "nmon3"
		const val NMON_4 = "nmon4"
		const val NMON_5 = "nmon5"
		const val NMON_6 = "nmon6"
		const val NMON_7 = "nmon7"
		const val NMON_8 = "nmon8"
		const val NMON_9 = "nmon9"
		const val NMON_10 = "nmon10"
		const val NMON_11 = "nmon11"
		const val NMON_12 = "nmon12"
		const val NMON_13 = "nmon13"
		const val NMON_14 = "nmon14"
		const val NMON_15 = "nmon15"
		const val NMON_16 = "nmon16"
		const val NMON_17 = "nmon17"
		const val NMON_18 = "nmon18"
		const val NMON_19 = "nmon19"
		const val NMON_20 = "nmon20"
		const val NMON_21 = "nmon21"
		const val NMON_22 = "nmon22"
		const val NMON_23 = "nmon23"
		const val NMON_24 = "nmon24"
		const val NMON_25 = "nmon25"
		const val UMON_1 = "umon1"
		const val UMON_2 = "umon2"
		const val UMON_3 = "umon3"
		const val UMON_4 = "umon4"
		const val UMON_5 = "umon5"
		const val UMON_6 = "umon6"
		const val UMON_7 = "umon7"
		const val UMON_8 = "umon8"
		const val UMON_9 = "umon9"
		const val UMON_10 = "umon10"
		const val UMON_11 = "umon11"
		const val UMON_12 = "umon12"
		const val UMON_13 = "umon13"
		const val UMON_14 = "umon14"
		const val UMON_15 = "umon15"
		const val UMON_16 = "umon16"
		const val UMON_17 = "umon17"
		const val UMON_18 = "umon18"
		const val UMON_19 = "umon19"
		const val UMON_20 = "umon20"
		const val UMON_21 = "umon21"
		const val UMON_22 = "umon22"
		const val UMON_23 = "umon23"
		const val UMON_24 = "umon24"
		const val UMON_25 = "umon25"
		const val CMON_1 = "cmon1"
		const val CMON_2 = "cmon2"
		const val CMON_3 = "cmon3"
		const val CMON_4 = "cmon4"
		const val CPCT_1 = "cpct1"
		const val CPCT_2 = "cpct2"
		const val CPCT_3 = "cpct3"
		const val CPCT_4 = "cpct4"
		const val CAMT_1 = "camt1"
		const val CAMT_2 = "camt2"
		const val CAMT_3 = "camt3"
		const val CAMT_4 = "camt4"
		const val THEMES = "Themes"
		const val SOUND_ENV = "SoundEnv"
		const val WAYPOINT = "Waypoint"
		const val LEVEL_NAME = "LevelName"
		const val LEVEL_WARP = "LevelWarp"
		const val LEVEL_ENTRY = "LevelEntry"
		const val OBJ_GRP_0 = "ObjGrp0"
		const val OBJ_GRP_1 = "ObjGrp1"
		const val OBJ_GRP_2 = "ObjGrp2"
		const val OBJ_GRP_3 = "ObjGrp3"
		const val OBJ_GRP_4 = "ObjGrp4"
		const val OBJ_GRP_5 = "ObjGrp5"
		const val OBJ_GRP_6 = "ObjGrp6"
		const val OBJ_GRP_7 = "ObjGrp7"
		const val OBJ_PRB_0 = "ObjPrb0"
		const val OBJ_PRB_1 = "ObjPrb1"
		const val OBJ_PRB_2 = "ObjPrb2"
		const val OBJ_PRB_3 = "ObjPrb3"
		const val OBJ_PRB_4 = "ObjPrb4"
		const val OBJ_PRB_5 = "ObjPrb5"
		const val OBJ_PRB_6 = "ObjPrb6"
		const val OBJ_PRB_7 = "ObjPrb7"
		
	}
	
	init { verify(HEADERS) }
	
}