package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2ItemTypes(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "itemtypes") {
	
	companion object {
		
		private val HEADERS = listOf("ItemType", "Code", "Equiv1", "Equiv2", "Repair", "Body", "BodyLoc1", "BodyLoc2", "Shoots", "Quiver", "Throwable", "Reload", "ReEquip", "AutoStack", "Magic", "Rare", "Normal", "Beltable", "MaxSockets1", "MaxSocketsLevelThreshold1", "MaxSockets2", "MaxSocketsLevelThreshold2", "MaxSockets3", "TreasureClass", "Rarity", "StaffMods", "Class", "VarInvGfx", "InvGfx1", "InvGfx2", "InvGfx3", "InvGfx4", "InvGfx5", "InvGfx6", "StorePage", "*eol")
		
		const val ITEM_TYPE = "ItemType"
		const val CODE = "Code"
		const val EQUIV_1 = "Equiv1"
		const val EQUIV_2 = "Equiv2"
		const val REPAIR = "Repair"
		const val BODY = "Body"
		const val BODY_LOC_1 = "BodyLoc1"
		const val BODY_LOC_2 = "BodyLoc2"
		const val SHOOTS = "Shoots"
		const val QUIVER = "Quiver"
		const val THROWABLE = "Throwable"
		const val RELOAD = "Reload"
		const val RE_EQUIP = "ReEquip"
		const val AUTO_STACK = "AutoStack"
		const val MAGIC = "Magic"
		const val RARE = "Rare"
		const val NORMAL = "Normal"
		const val BELTABLE = "Beltable"
		const val MAX_SOCKETS_1 = "MaxSockets1"
		const val MAX_SOCKETS_LEVEL_THRESHOLD_1 = "MaxSocketsLevelThreshold1"
		const val MAX_SOCKETS_2 = "MaxSockets2"
		const val MAX_SOCKETS_LEVEL_THRESHOLD_2 = "MaxSocketsLevelThreshold2"
		const val MAX_SOCKETS_3 = "MaxSockets3"
		const val TREASURE_CLASS = "TreasureClass"
		const val RARITY = "Rarity"
		const val STAFF_MODS = "StaffMods"
		const val CLASS = "Class"
		const val VAR_INV_GFX = "VarInvGfx"
		const val INV_GFX_1 = "InvGfx1"
		const val INV_GFX_2 = "InvGfx2"
		const val INV_GFX_3 = "InvGfx3"
		const val INV_GFX_4 = "InvGfx4"
		const val INV_GFX_5 = "InvGfx5"
		const val INV_GFX_6 = "InvGfx6"
		const val STORE_PAGE = "StorePage"
		const val EOL = "*eol"
		
	}
	
	init { verify(HEADERS) }
	
}