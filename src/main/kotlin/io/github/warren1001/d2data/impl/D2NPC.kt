package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2NPC(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "npc") {
	
	companion object {
		
		private val HEADERS = listOf("npc", "buy mult", "sell mult", "rep mult", "questflag A", "questbuymult A", "questsellmult A", "questrepmult A", "questflag B", "questbuymult B", "questsellmult B", "questrepmult B", "questflag C", "questbuymult C", "questsellmult C", "questrepmult C", "max buy", "max buy (N)", "max buy (H)")
		
		const val NPC = "npc"
		const val BUY_MULT = "buy mult"
		const val SELL_MULT = "sell mult"
		const val REP_MULT = "rep mult"
		const val QUEST_FLAG_A = "questflag A"
		const val QUEST_BUY_MULT_A = "questbuymult A"
		const val QUEST_SELL_MULT_A = "questsellmult A"
		const val QUEST_REP_MULT_A = "questrepmult A"
		const val QUEST_FLAG_B = "questflag B"
		const val QUEST_BUY_MULT_B = "questbuymult B"
		const val QUEST_SELL_MULT_B = "questsellmult B"
		const val QUEST_REP_MULT_B = "questrepmult B"
		const val QUEST_FLAG_C = "questflag C"
		const val QUEST_BUY_MULT_C = "questbuymult C"
		const val QUEST_SELL_MULT_C = "questsellmult C"
		const val QUEST_REP_MULT_C = "questrepmult C"
		const val MAX_BUY = "max buy"
		const val MAX_BUY_NIGHTMARE = "max buy (N)"
		const val MAX_BUY_HELL = "max buy (H)"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}