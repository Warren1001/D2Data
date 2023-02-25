package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Overlay(override val header: String): D2Header {
	
	OVERLAY("overlay"),
	ID("*ID"),
	FILE_NAME("Filename"),
	VERSION("version"),
	FRAMES("*Frames"),
	CHARACTER("Character"),
	PRE_DRAW("PreDraw"),
	ONE_OF_N("1ofN"),
	X_OFFSET("Xoffset"),
	Y_OFFSET("Yoffset"),
	HEIGHT_1("Height1"),
	HEIGHT_2("Height2"),
	HEIGHT_3("Height3"),
	HEIGHT_4("Height4"),
	ANIM_RATE("AnimRate"),
	LOOP_WAIT_TIME("LoopWaitTime"),
	TRANS("Trans"),
	INIT_RADIUS("InitRadius"),
	RADIUS("Radius"),
	RED("Red"),
	GREEN("Green"),
	BLUE("Blue"),
	NUM_DIRECTIONS("NumDirections"),
	LOCAL_BLOOD("LocalBlood");
	
	companion object {
		val FILE_PATH = "global/excel/overlay.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = OVERLAY
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}