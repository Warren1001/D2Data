package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2NPC(header: String, vararg headerHistory: String): D2Header {
	
	NPC("npc"),
	BUY_MULT("buy mult"),
	SELL_MULT("sell mult"),
	REP_MULT("rep mult"),
	QUEST_FLAG_A("questflag A"),
	QUEST_BUY_MULT_A("questbuymult A"),
	QUEST_SELL_MULT_A("questsellmult A"),
	QUEST_REP_MULT_A("questrepmult A"),
	QUEST_FLAG_B("questflag B"),
	QUEST_BUY_MULT_B("questbuymult B"),
	QUEST_SELL_MULT_B("questsellmult B"),
	QUEST_REP_MULT_B("questrepmult B"),
	QUEST_FLAG_C("questflag C"),
	QUEST_BUY_MULT_C("questbuymult C"),
	QUEST_SELL_MULT_C("questsellmult C"),
	QUEST_REP_MULT_C("questrepmult C"),
	MAX_BUY("max buy"),
	MAX_BUY_NIGHTMARE("max buy (N)"),
	MAX_BUY_HELL("max buy (H)");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/npc.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = NPC
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}