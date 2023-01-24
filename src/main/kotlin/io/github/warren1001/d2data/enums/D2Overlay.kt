package io.github.warren1001.d2data.enums

enum class D2Overlay(val header: String) {
	
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
		const val SHEET_NAME = "overlay"
		val HEADERS = values().map { it.header }
	}
	
}