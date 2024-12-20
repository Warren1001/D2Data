package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Belts(header: String, vararg headerHistory: String): D2Header {
	
	NAME("name"),
	NUM_BOXES("numboxes"),
	BOX_1_LEFT("box1left"),
	BOX_1_RIGHT("box1right"),
	BOX_1_TOP("box1top"),
	BOX_1_BOTTOM("box1bottom"),
	BOX_2_LEFT("box2left"),
	BOX_2_RIGHT("box2right"),
	BOX_2_TOP("box2top"),
	BOX_2_BOTTOM("box2bottom"),
	BOX_3_LEFT("box3left"),
	BOX_3_RIGHT("box3right"),
	BOX_3_TOP("box3top"),
	BOX_3_BOTTOM("box3bottom"),
	BOX_4_LEFT("box4left"),
	BOX_4_RIGHT("box4right"),
	BOX_4_TOP("box4top"),
	BOX_4_BOTTOM("box4bottom"),
	BOX_5_LEFT("box5left"),
	BOX_5_RIGHT("box5right"),
	BOX_5_TOP("box5top"),
	BOX_5_BOTTOM("box5bottom"),
	BOX_6_LEFT("box6left"),
	BOX_6_RIGHT("box6right"),
	BOX_6_TOP("box6top"),
	BOX_6_BOTTOM("box6bottom"),
	BOX_7_LEFT("box7left"),
	BOX_7_RIGHT("box7right"),
	BOX_7_TOP("box7top"),
	BOX_7_BOTTOM("box7bottom"),
	BOX_8_LEFT("box8left"),
	BOX_8_RIGHT("box8right"),
	BOX_8_TOP("box8top"),
	BOX_8_BOTTOM("box8bottom"),
	BOX_9_LEFT("box9left"),
	BOX_9_RIGHT("box9right"),
	BOX_9_TOP("box9top"),
	BOX_9_BOTTOM("box9bottom"),
	BOX_10_LEFT("box10left"),
	BOX_10_RIGHT("box10right"),
	BOX_10_TOP("box10top"),
	BOX_10_BOTTOM("box10bottom"),
	BOX_11_LEFT("box11left"),
	BOX_11_RIGHT("box11right"),
	BOX_11_TOP("box11top"),
	BOX_11_BOTTOM("box11bottom"),
	BOX_12_LEFT("box12left"),
	BOX_12_RIGHT("box12right"),
	BOX_12_TOP("box12top"),
	BOX_12_BOTTOM("box12bottom"),
	BOX_13_LEFT("box13left"),
	BOX_13_RIGHT("box13right"),
	BOX_13_TOP("box13top"),
	BOX_13_BOTTOM("box13bottom"),
	BOX_14_LEFT("box14left"),
	BOX_14_RIGHT("box14right"),
	BOX_14_TOP("box14top"),
	BOX_14_BOTTOM("box14bottom"),
	BOX_15_LEFT("box15left"),
	BOX_15_RIGHT("box15right"),
	BOX_15_TOP("box15top"),
	BOX_15_BOTTOM("box15bottom"),
	BOX_16_LEFT("box16left"),
	BOX_16_RIGHT("box16right"),
	BOX_16_TOP("box16top"),
	BOX_16_BOTTOM("box16bottom"),
	DEFAULT_ITEM_TYPE_COL_1("defaultItemTypeCol1"),
	DEFAULT_ITEM_CODE_COL_1("defaultItemCodeCol1"),
	DEFAULT_ITEM_TYPE_COL_2("defaultItemTypeCol2"),
	DEFAULT_ITEM_CODE_COL_2("defaultItemCodeCol2"),
	DEFAULT_ITEM_TYPE_COL_3("defaultItemTypeCol3"),
	DEFAULT_ITEM_CODE_COL_3("defaultItemCodeCol3"),
	DEFAULT_ITEM_TYPE_COL_4("defaultItemTypeCol4"),
	DEFAULT_ITEM_CODE_COL_4("defaultItemCodeCol4");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/belts.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = NAME
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}