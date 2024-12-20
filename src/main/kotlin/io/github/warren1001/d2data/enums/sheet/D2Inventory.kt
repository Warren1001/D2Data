package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Inventory(header: String, vararg headerHistory: String): D2Header {
	
	CLASS("class"),
	INV_LEFT("invLeft"),
	INV_RIGHT("invRight"),
	INV_TOP("invTop"),
	INV_BOTTOM("invBottom"),
	GRID_X("gridX"),
	GRID_Y("gridY"),
	GRID_LEFT("gridLeft"),
	GRID_RIGHT("gridRight"),
	GRID_TOP("gridTop"),
	GRID_BOTTOM("gridBottom"),
	GRID_BOX_WIDTH("gridBoxWidth"),
	GRID_BOX_HEIGHT("gridBoxHeight"),
	R_ARM_LEFT("rArmLeft"),
	R_ARM_RIGHT("rArmRight"),
	R_ARM_TOP("rArmTop"),
	R_ARM_BOTTOM("rArmBottom"),
	R_ARM_WIDTH("rArmWidth"),
	R_ARM_HEIGHT("rArmHeight"),
	TORSO_LEFT("torsoLeft"),
	TORSO_RIGHT("torsoRight"),
	TORSO_TOP("torsoTop"),
	TORSO_BOTTOM("torsoBottom"),
	TORSO_WIDTH("torsoWidth"),
	TORSO_HEIGHT("torsoHeight"),
	L_ARM_LEFT("lArmLeft"),
	L_ARM_RIGHT("lArmRight"),
	L_ARM_TOP("lArmTop"),
	L_ARM_BOTTOM("lArmBottom"),
	L_ARM_WIDTH("lArmWidth"),
	L_ARM_HEIGHT("lArmHeight"),
	HEAD_LEFT("headLeft"),
	HEAD_RIGHT("headRight"),
	HEAD_TOP("headTop"),
	HEAD_BOTTOM("headBottom"),
	HEAD_WIDTH("headWidth"),
	HEAD_HEIGHT("headHeight"),
	NECK_LEFT("neckLeft"),
	NECK_RIGHT("neckRight"),
	NECK_TOP("neckTop"),
	NECK_BOTTOM("neckBottom"),
	NECK_WIDTH("neckWidth"),
	NECK_HEIGHT("neckHeight"),
	R_HAND_LEFT("rHandLeft"),
	R_HAND_RIGHT("rHandRight"),
	R_HAND_TOP("rHandTop"),
	R_HAND_BOTTOM("rHandBottom"),
	R_HAND_WIDTH("rHandWidth"),
	R_HAND_HEIGHT("rHandHeight"),
	L_HAND_LEFT("lHandLeft"),
	L_HAND_RIGHT("lHandRight"),
	L_HAND_TOP("lHandTop"),
	L_HAND_BOTTOM("lHandBottom"),
	L_HAND_WIDTH("lHandWidth"),
	L_HAND_HEIGHT("lHandHeight"),
	BELT_LEFT("beltLeft"),
	BELT_RIGHT("beltRight"),
	BELT_TOP("beltTop"),
	BELT_BOTTOM("beltBottom"),
	BELT_WIDTH("beltWidth"),
	BELT_HEIGHT("beltHeight"),
	FEET_LEFT("feetLeft"),
	FEET_RIGHT("feetRight"),
	FEET_TOP("feetTop"),
	FEET_BOTTOM("feetBottom"),
	FEET_WIDTH("feetWidth"),
	FEET_HEIGHT("feetHeight"),
	GLOVES_LEFT("glovesLeft"),
	GLOVES_RIGHT("glovesRight"),
	GLOVES_TOP("glovesTop"),
	GLOVES_BOTTOM("glovesBottom"),
	GLOVES_WIDTH("glovesWidth"),
	GLOVES_HEIGHT("glovesHeight");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/inventory.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = CLASS
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}