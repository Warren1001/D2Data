package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Belts(manager: D2Sheets, dir: File) : D2Sheet(manager, dir, "belts") {
	
	companion object {
		
		private val HEADERS = listOf(
			"name",
			"numboxes",
			"box1left",
			"box1right",
			"box1top",
			"box1bottom",
			"box2left",
			"box2right",
			"box2top",
			"box2bottom",
			"box3left",
			"box3right",
			"box3top",
			"box3bottom",
			"box4left",
			"box4right",
			"box4top",
			"box4bottom",
			"box5left",
			"box5right",
			"box5top",
			"box5bottom",
			"box6left",
			"box6right",
			"box6top",
			"box6bottom",
			"box7left",
			"box7right",
			"box7top",
			"box7bottom",
			"box8left",
			"box8right",
			"box8top",
			"box8bottom",
			"box9left",
			"box9right",
			"box9top",
			"box9bottom",
			"box10left",
			"box10right",
			"box10top",
			"box10bottom",
			"box11left",
			"box11right",
			"box11top",
			"box11bottom",
			"box12left",
			"box12right",
			"box12top",
			"box12bottom",
			"box13left",
			"box13right",
			"box13top",
			"box13bottom",
			"box14left",
			"box14right",
			"box14top",
			"box14bottom",
			"box15left",
			"box15right",
			"box15top",
			"box15bottom",
			"box16left",
			"box16right",
			"box16top",
			"box16bottom",
			"defaultItemTypeCol1",
			"defaultItemCodeCol1",
			"defaultItemTypeCol2",
			"defaultItemCodeCol2",
			"defaultItemTypeCol3",
			"defaultItemCodeCol3",
			"defaultItemTypeCol4",
			"defaultItemCodeCol4"
		)
		
		const val NAME = "name"
		const val NUM_BOXES = "numboxes"
		const val BOX_1_LEFT = "box1left"
		const val BOX_1_RIGHT = "box1right"
		const val BOX_1_TOP = "box1top"
		const val BOX_1_BOTTOM = "box1bottom"
		const val BOX_2_LEFT = "box2left"
		const val BOX_2_RIGHT = "box2right"
		const val BOX_2_TOP = "box2top"
		const val BOX_2_BOTTOM = "box2bottom"
		const val BOX_3_LEFT = "box3left"
		const val BOX_3_RIGHT = "box3right"
		const val BOX_3_TOP = "box3top"
		const val BOX_3_BOTTOM = "box3bottom"
		const val BOX_4_LEFT = "box4left"
		const val BOX_4_RIGHT = "box4right"
		const val BOX_4_TOP = "box4top"
		const val BOX_4_BOTTOM = "box4bottom"
		const val BOX_5_LEFT = "box5left"
		const val BOX_5_RIGHT = "box5right"
		const val BOX_5_TOP = "box5top"
		const val BOX_5_BOTTOM = "box5bottom"
		const val BOX_6_LEFT = "box6left"
		const val BOX_6_RIGHT = "box6right"
		const val BOX_6_TOP = "box6top"
		const val BOX_6_BOTTOM = "box6bottom"
		const val BOX_7_LEFT = "box7left"
		const val BOX_7_RIGHT = "box7right"
		const val BOX_7_TOP = "box7top"
		const val BOX_7_BOTTOM = "box7bottom"
		const val BOX_8_LEFT = "box8left"
		const val BOX_8_RIGHT = "box8right"
		const val BOX_8_TOP = "box8top"
		const val BOX_8_BOTTOM = "box8bottom"
		const val BOX_9_LEFT = "box9left"
		const val BOX_9_RIGHT = "box9right"
		const val BOX_9_TOP = "box9top"
		const val BOX_9_BOTTOM = "box9bottom"
		const val BOX_10_LEFT = "box10left"
		const val BOX_10_RIGHT = "box10right"
		const val BOX_10_TOP = "box10top"
		const val BOX_10_BOTTOM = "box10bottom"
		const val BOX_11_LEFT = "box11left"
		const val BOX_11_RIGHT = "box11right"
		const val BOX_11_TOP = "box11top"
		const val BOX_11_BOTTOM = "box11bottom"
		const val BOX_12_LEFT = "box12left"
		const val BOX_12_RIGHT = "box12right"
		const val BOX_12_TOP = "box12top"
		const val BOX_12_BOTTOM = "box12bottom"
		const val BOX_13_LEFT = "box13left"
		const val BOX_13_RIGHT = "box13right"
		const val BOX_13_TOP = "box13top"
		const val BOX_13_BOTTOM = "box13bottom"
		const val BOX_14_LEFT = "box14left"
		const val BOX_14_RIGHT = "box14right"
		const val BOX_14_TOP = "box14top"
		const val BOX_14_BOTTOM = "box14bottom"
		const val BOX_15_LEFT = "box15left"
		const val BOX_15_RIGHT = "box15right"
		const val BOX_15_TOP = "box15top"
		const val BOX_15_BOTTOM = "box15bottom"
		const val BOX_16_LEFT = "box16left"
		const val BOX_16_RIGHT = "box16right"
		const val BOX_16_TOP = "box16top"
		const val BOX_16_BOTTOM = "box16bottom"
		const val DEFAULT_ITEM_TYPE_COL_1 = "defaultItemTypeCol1"
		const val DEFAULT_ITEM_CODE_COL_1 = "defaultItemCodeCol1"
		const val DEFAULT_ITEM_TYPE_COL_2 = "defaultItemTypeCol2"
		const val DEFAULT_ITEM_CODE_COL_2 = "defaultItemCodeCol2"
		const val DEFAULT_ITEM_TYPE_COL_3 = "defaultItemTypeCol3"
		const val DEFAULT_ITEM_CODE_COL_3 = "defaultItemCodeCol3"
		const val DEFAULT_ITEM_TYPE_COL_4 = "defaultItemTypeCol4"
		const val DEFAULT_ITEM_CODE_COL_4 = "defaultItemCodeCol4"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}