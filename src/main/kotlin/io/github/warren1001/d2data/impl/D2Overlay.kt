package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Overlay(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "overlay") {
	
	companion object {
		
		private val HEADERS = listOf("overlay", "*ID", "Filename", "version", "*Frames", "Character", "PreDraw", "1ofN", "Xoffset", "Yoffset", "Height1", "Height2", "Height3", "Height4", "AnimRate", "LoopWaitTime", "Trans", "InitRadius", "Radius", "Red", "Green", "Blue", "NumDirections", "LocalBlood")
		
		const val OVERLAY = "overlay"
		const val ID = "*ID"
		const val FILE_NAME = "Filename"
		const val VERSION = "version"
		const val FRAMES = "*Frames"
		const val CHARACTER = "Character"
		const val PRE_DRAW = "PreDraw"
		const val ONE_OF_N = "1ofN"
		const val X_OFFSET = "Xoffset"
		const val Y_OFFSET = "Yoffset"
		const val HEIGHT_1 = "Height1"
		const val HEIGHT_2 = "Height2"
		const val HEIGHT_3 = "Height3"
		const val HEIGHT_4 = "Height4"
		const val ANIM_RATE = "AnimRate"
		const val LOOP_WAIT_TIME = "LoopWaitTime"
		const val TRANS = "Trans"
		const val INIT_RADIUS = "InitRadius"
		const val RADIUS = "Radius"
		const val RED = "Red"
		const val GREEN = "Green"
		const val BLUE = "Blue"
		const val NUM_DIRECTIONS = "NumDirections"
		const val LOCAL_BLOOD = "LocalBlood"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}