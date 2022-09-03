package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Objects(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "objects") {
	
	companion object {
		
		private val HEADERS = listOf("Class", "Name", "*Description", "*ID", "Token", "Selectable0", "Selectable1", "Selectable2", "Selectable3", "Selectable4", "Selectable5", "Selectable6", "Selectable7", "SizeX", "SizeY", "FrameCnt0", "FrameCnt1", "FrameCnt2", "FrameCnt3", "FrameCnt4", "FrameCnt5", "FrameCnt6", "FrameCnt7", "FrameDelta0", "FrameDelta1", "FrameDelta2", "FrameDelta3", "FrameDelta4", "FrameDelta5", "FrameDelta6", "FrameDelta7", "CycleAnim0", "CycleAnim1", "CycleAnim2", "CycleAnim3", "CycleAnim4", "CycleAnim5", "CycleAnim6", "CycleAnim7", "Lit0", "Lit1", "Lit2", "Lit3", "Lit4", "Lit5", "Lit6", "Lit7", "BlocksLight0", "BlocksLight1", "BlocksLight2", "BlocksLight3", "BlocksLight4", "BlocksLight5", "BlocksLight6", "BlocksLight7", "HasCollision0", "HasCollision1", "HasCollision2", "HasCollision3", "HasCollision4", "HasCollision5", "HasCollision6", "HasCollision7", "IsAttackable0", "Start0", "Start1", "Start2", "Start3", "Start4", "Start5", "Start6", "Start7", "EnvEffect", "IsDoor", "BlocksVis", "Orientation", "OrderFlag0", "OrderFlag1", "OrderFlag2", "OrderFlag3", "OrderFlag4", "OrderFlag5", "OrderFlag6", "OrderFlag7", "PreOperate", "Mode0", "Mode1", "Mode2", "Mode3", "Mode4", "Mode5", "Mode6", "Mode7", "Yoffset", "Xoffset", "Draw", "Red", "Green", "Blue", "HD", "TR", "LG", "RA", "LA", "RH", "LH", "SH", "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "TotalPieces", "SubClass", "Xspace", "Yspace", "NameOffset", "MonsterOK", "ShrineFunction", "Restore", "Parm0", "Parm1", "Parm2", "Parm3", "Parm4", "Lockable", "Gore", "Sync", "Damage", "Overlay", "CollisionSubst", "Left", "Top", "Width", "Height", "OperateFn", "PopulateFn", "InitFn", "ClientFn", "RestoreVirgins", "BlockMissile", "DrawUnder", "OpenWarp", "AutoMap")
		
		const val CLASS = "Class"
		const val NAME = "Name"
		const val DESCRIPTION = "*Description"
		const val ID = "*ID"
		const val TOKEN = "Token"
		const val SELECTABLE_0 = "Selectable0"
		const val SELECTABLE_1 = "Selectable1"
		const val SELECTABLE_2 = "Selectable2"
		const val SELECTABLE_3 = "Selectable3"
		const val SELECTABLE_4 = "Selectable4"
		const val SELECTABLE_5 = "Selectable5"
		const val SELECTABLE_6 = "Selectable6"
		const val SELECTABLE_7 = "Selectable7"
		const val SIZE_X = "SizeX"
		const val SIZE_Y = "SizeY"
		const val FRAME_CNT_0 = "FrameCnt0"
		const val FRAME_CNT_1 = "FrameCnt1"
		const val FRAME_CNT_2 = "FrameCnt2"
		const val FRAME_CNT_3 = "FrameCnt3"
		const val FRAME_CNT_4 = "FrameCnt4"
		const val FRAME_CNT_5 = "FrameCnt5"
		const val FRAME_CNT_6 = "FrameCnt6"
		const val FRAME_CNT_7 = "FrameCnt7"
		const val FRAME_DELTA_0 = "FrameDelta0"
		const val FRAME_DELTA_1 = "FrameDelta1"
		const val FRAME_DELTA_2 = "FrameDelta2"
		const val FRAME_DELTA_3 = "FrameDelta3"
		const val FRAME_DELTA_4 = "FrameDelta4"
		const val FRAME_DELTA_5 = "FrameDelta5"
		const val FRAME_DELTA_6 = "FrameDelta6"
		const val FRAME_DELTA_7 = "FrameDelta7"
		const val CYCLE_ANIM_0 = "CycleAnim0"
		const val CYCLE_ANIM_1 = "CycleAnim1"
		const val CYCLE_ANIM_2 = "CycleAnim2"
		const val CYCLE_ANIM_3 = "CycleAnim3"
		const val CYCLE_ANIM_4 = "CycleAnim4"
		const val CYCLE_ANIM_5 = "CycleAnim5"
		const val CYCLE_ANIM_6 = "CycleAnim6"
		const val CYCLE_ANIM_7 = "CycleAnim7"
		const val LIT_0 = "Lit0"
		const val LIT_1 = "Lit1"
		const val LIT_2 = "Lit2"
		const val LIT_3 = "Lit3"
		const val LIT_4 = "Lit4"
		const val LIT_5 = "Lit5"
		const val LIT_6 = "Lit6"
		const val LIT_7 = "Lit7"
		const val BLOCKS_LIGHT_0 = "BlocksLight0"
		const val BLOCKS_LIGHT_1 = "BlocksLight1"
		const val BLOCKS_LIGHT_2 = "BlocksLight2"
		const val BLOCKS_LIGHT_3 = "BlocksLight3"
		const val BLOCKS_LIGHT_4 = "BlocksLight4"
		const val BLOCKS_LIGHT_5 = "BlocksLight5"
		const val BLOCKS_LIGHT_6 = "BlocksLight6"
		const val BLOCKS_LIGHT_7 = "BlocksLight7"
		const val HAS_COLLISION_0 = "HasCollision0"
		const val HAS_COLLISION_1 = "HasCollision1"
		const val HAS_COLLISION_2 = "HasCollision2"
		const val HAS_COLLISION_3 = "HasCollision3"
		const val HAS_COLLISION_4 = "HasCollision4"
		const val HAS_COLLISION_5 = "HasCollision5"
		const val HAS_COLLISION_6 = "HasCollision6"
		const val HAS_COLLISION_7 = "HasCollision7"
		const val IS_ATTACKABLE_0 = "IsAttackable0"
		const val START_0 = "Start0"
		const val START_1 = "Start1"
		const val START_2 = "Start2"
		const val START_3 = "Start3"
		const val START_4 = "Start4"
		const val START_5 = "Start5"
		const val START_6 = "Start6"
		const val START_7 = "Start7"
		const val ENV_EFFECT = "EnvEffect"
		const val IS_DOOR = "IsDoor"
		const val BLOCKS_VIS = "BlocksVis"
		const val ORIENTATION = "Orientation"
		const val ORDER_FLAG_0 = "OrderFlag0"
		const val ORDER_FLAG_1 = "OrderFlag1"
		const val ORDER_FLAG_2 = "OrderFlag2"
		const val ORDER_FLAG_3 = "OrderFlag3"
		const val ORDER_FLAG_4 = "OrderFlag4"
		const val ORDER_FLAG_5 = "OrderFlag5"
		const val ORDER_FLAG_6 = "OrderFlag6"
		const val ORDER_FLAG_7 = "OrderFlag7"
		const val PRE_OPERATE = "PreOperate"
		const val MODE_0 = "Mode0"
		const val MODE_1 = "Mode1"
		const val MODE_2 = "Mode2"
		const val MODE_3 = "Mode3"
		const val MODE_4 = "Mode4"
		const val MODE_5 = "Mode5"
		const val MODE_6 = "Mode6"
		const val MODE_7 = "Mode7"
		const val YOFFSET = "Yoffset"
		const val XOFFSET = "Xoffset"
		const val DRAW = "Draw"
		const val RED = "Red"
		const val GREEN = "Green"
		const val BLUE = "Blue"
		const val HD = "HD"
		const val TR = "TR"
		const val LG = "LG"
		const val RA = "RA"
		const val LA = "LA"
		const val RH = "RH"
		const val LH = "LH"
		const val SH = "SH"
		const val S1 = "S1"
		const val S2 = "S2"
		const val S3 = "S3"
		const val S4 = "S4"
		const val S5 = "S5"
		const val S6 = "S6"
		const val S7 = "S7"
		const val S8 = "S8"
		const val TOTAL_PIECES = "TotalPieces"
		const val SUB_CLASS = "SubClass"
		const val X_SPACE = "Xspace"
		const val Y_SPACE = "Yspace"
		const val NAME_OFFSET = "NameOffset"
		const val MONSTER_OK = "MonsterOK"
		const val SHRINE_FUNCTION = "ShrineFunction"
		const val RESTORE = "Restore"
		const val PARM_0 = "Parm0"
		const val PARM_1 = "Parm1"
		const val PARM_2 = "Parm2"
		const val PARM_3 = "Parm3"
		const val PARM_4 = "Parm4"
		const val LOCKABLE = "Lockable"
		const val GORE = "Gore"
		const val SYNC = "Sync"
		const val DAMAGE = "Damage"
		const val OVERLAY = "Overlay"
		const val COLLISION_SUBST = "CollisionSubst"
		const val LEFT = "Left"
		const val TOP = "Top"
		const val WIDTH = "Width"
		const val HEIGHT = "Height"
		const val OPERATE_FN = "OperateFn"
		const val POPULATE_FN = "PopulateFn"
		const val INIT_FN = "InitFn"
		const val CLIENT_FN = "ClientFn"
		const val RESTORE_VIRGINS = "RestoreVirgins"
		const val BLOCK_MISSILE = "BlockMissile"
		const val DRAW_UNDER = "DrawUnder"
		const val OPEN_WARP = "OpenWarp"
		const val AUTO_MAP = "AutoMap"
		
	}
	
	init { verify(HEADERS) }
	
}