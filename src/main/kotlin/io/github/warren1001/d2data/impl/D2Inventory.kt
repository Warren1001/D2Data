package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Inventory(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "inventory") {
	
	companion object {
		
		private val HEADERS = listOf("class", "invLeft", "invRight", "invTop", "invBottom", "gridX", "gridY", "gridLeft", "gridRight", "gridTop", "gridBottom", "gridBoxWidth", "gridBoxHeight", "rArmLeft", "rArmRight", "rArmTop", "rArmBottom", "rArmWidth", "rArmHeight", "torsoLeft", "torsoRight", "torsoTop", "torsoBottom", "torsoWidth", "torsoHeight", "lArmLeft", "lArmRight", "lArmTop", "lArmBottom", "lArmWidth", "lArmHeight", "headLeft", "headRight", "headTop", "headBottom", "headWidth", "headHeight", "neckLeft", "neckRight", "neckTop", "neckBottom", "neckWidth", "neckHeight", "rHandLeft", "rHandRight", "rHandTop", "rHandBottom", "rHandWidth", "rHandHeight", "lHandLeft", "lHandRight", "lHandTop", "lHandBottom", "lHandWidth", "lHandHeight", "beltLeft", "beltRight", "beltTop", "beltBottom", "beltWidth", "beltHeight", "feetLeft", "feetRight", "feetTop", "feetBottom", "feetWidth", "feetHeight", "glovesLeft", "glovesRight", "glovesTop", "glovesBottom", "glovesWidth", "glovesHeight")
		
		const val CLASS = "class"
		const val INV_LEFT = "invLeft"
		const val INV_RIGHT = "invRight"
		const val INV_TOP = "invTop"
		const val INV_BOTTOM = "invBottom"
		const val GRID_X = "gridX"
		const val GRID_Y = "gridY"
		const val GRID_LEFT = "gridLeft"
		const val GRID_RIGHT = "gridRight"
		const val GRID_TOP = "gridTop"
		const val GRID_BOTTOM = "gridBottom"
		const val GRID_BOX_WIDTH = "gridBoxWidth"
		const val GRID_BOX_HEIGHT = "gridBoxHeight"
		const val R_ARM_LEFT = "rArmLeft"
		const val R_ARM_RIGHT = "rArmRight"
		const val R_ARM_TOP = "rArmTop"
		const val R_ARM_BOTTOM = "rArmBottom"
		const val R_ARM_WIDTH = "rArmWidth"
		const val R_ARM_HEIGHT = "rArmHeight"
		const val TORSO_LEFT = "torsoLeft"
		const val TORSO_RIGHT = "torsoRight"
		const val TORSO_TOP = "torsoTop"
		const val TORSO_BOTTOM = "torsoBottom"
		const val TORSO_WIDTH = "torsoWidth"
		const val TORSO_HEIGHT = "torsoHeight"
		const val L_ARM_LEFT = "lArmLeft"
		const val L_ARM_RIGHT = "lArmRight"
		const val L_ARM_TOP = "lArmTop"
		const val L_ARM_BOTTOM = "lArmBottom"
		const val L_ARM_WIDTH = "lArmWidth"
		const val L_ARM_HEIGHT = "lArmHeight"
		const val HEAD_LEFT = "headLeft"
		const val HEAD_RIGHT = "headRight"
		const val HEAD_TOP = "headTop"
		const val HEAD_BOTTOM = "headBottom"
		const val HEAD_WIDTH = "headWidth"
		const val HEAD_HEIGHT = "headHeight"
		const val NECK_LEFT = "neckLeft"
		const val NECK_RIGHT = "neckRight"
		const val NECK_TOP = "neckTop"
		const val NECK_BOTTOM = "neckBottom"
		const val NECK_WIDTH = "neckWidth"
		const val NECK_HEIGHT = "neckHeight"
		const val R_HAND_LEFT = "rHandLeft"
		const val R_HAND_RIGHT = "rHandRight"
		const val R_HAND_TOP = "rHandTop"
		const val R_HAND_BOTTOM = "rHandBottom"
		const val R_HAND_WIDTH = "rHandWidth"
		const val R_HAND_HEIGHT = "rHandHeight"
		const val L_HAND_LEFT = "lHandLeft"
		const val L_HAND_RIGHT = "lHandRight"
		const val L_HAND_TOP = "lHandTop"
		const val L_HAND_BOTTOM = "lHandBottom"
		const val L_HAND_WIDTH = "lHandWidth"
		const val L_HAND_HEIGHT = "lHandHeight"
		const val BELT_LEFT = "beltLeft"
		const val BELT_RIGHT = "beltRight"
		const val BELT_TOP = "beltTop"
		const val BELT_BOTTOM = "beltBottom"
		const val BELT_WIDTH = "beltWidth"
		const val BELT_HEIGHT = "beltHeight"
		const val FEET_LEFT = "feetLeft"
		const val FEET_RIGHT = "feetRight"
		const val FEET_TOP = "feetTop"
		const val FEET_BOTTOM = "feetBottom"
		const val FEET_WIDTH = "feetWidth"
		const val FEET_HEIGHT = "feetHeight"
		const val GLOVES_LEFT = "glovesLeft"
		const val GLOVES_RIGHT = "glovesRight"
		const val GLOVES_TOP = "glovesTop"
		const val GLOVES_BOTTOM = "glovesBottom"
		const val GLOVES_WIDTH = "glovesWidth"
		const val GLOVES_HEIGHT = "glovesHeight"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}