package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2ItemTypes(header: String, vararg headerHistory: String): D2Header {
	
	ITEM_TYPE("ItemType"),
	CODE("Code"),
	EQUIV_1("Equiv1"),
	EQUIV_2("Equiv2"),
	REPAIR("Repair"),
	BODY("Body"),
	BODY_LOC_1("BodyLoc1"),
	BODY_LOC_2("BodyLoc2"),
	SHOOTS("Shoots"),
	QUIVER("Quiver"),
	THROWABLE("Throwable"),
	RELOAD("Reload"),
	RE_EQUIP("ReEquip"),
	AUTO_STACK("AutoStack"),
	MAGIC("Magic"),
	RARE("Rare"),
	NORMAL("Normal"),
	BELTABLE("Beltable"),
	MAX_SOCKETS_1("MaxSockets1"),
	MAX_SOCKETS_LEVEL_THRESHOLD_1("MaxSocketsLevelThreshold1"),
	MAX_SOCKETS_2("MaxSockets2"),
	MAX_SOCKETS_LEVEL_THRESHOLD_2("MaxSocketsLevelThreshold2"),
	MAX_SOCKETS_3("MaxSockets3"),
	TREASURE_CLASS("TreasureClass"),
	RARITY("Rarity"),
	STAFF_MODS("StaffMods"),
	CLASS("Class"),
	VAR_INV_GFX("VarInvGfx"),
	INV_GFX_1("InvGfx1"),
	INV_GFX_2("InvGfx2"),
	INV_GFX_3("InvGfx3"),
	INV_GFX_4("InvGfx4"),
	INV_GFX_5("InvGfx5"),
	INV_GFX_6("InvGfx6"),
	STORE_PAGE("StorePage"),
	EOL("*eol");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/itemtypes.txt".properSeparator()
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