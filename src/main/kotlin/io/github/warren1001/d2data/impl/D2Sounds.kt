package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Sounds(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "sounds") {
	
	companion object {
		
		private val HEADERS = listOf("Sound", "*Index", "Redirect", "Channel", "FileName", "IsLocal", "IsMusic", "IsAmbientScene", "IsAmbientEvent", "IsUI", "Volume Min", "Volume Max", "Pitch Min", "Pitch Max", "Group Size", "Group Weight", "Loop", "Fade In", "Fade Out", "Defer Inst", "Stop Inst", "Duration", "Compound", "Falloff", "LFEMix", "3dSpread", "Priority", "Stream", "Is2D", "Tracking", "Solo", "Music Vol", "Block 1", "Block 2", "Block 3", "HDOptOut", "Delay", "4737")
		
		const val SOUND = "Sound"
		const val INDEX = "*Index"
		const val REDIRECT = "Redirect"
		const val CHANNEL = "Channel"
		const val FILE_NAME = "FileName"
		const val IS_LOCAL = "IsLocal"
		const val IS_MUSIC = "IsMusic"
		const val IS_AMBIENT_SCENE = "IsAmbientScene"
		const val IS_AMBIENT_EVENT = "IsAmbientEvent"
		const val IS_UI = "IsUI"
		const val VOLUME_MIN = "Volume Min"
		const val VOLUME_MAX = "Volume Max"
		const val PITCH_MIN = "Pitch Min"
		const val PITCH_MAX = "Pitch Max"
		const val GROUP_SIZE = "Group Size"
		const val GROUP_WEIGHT = "Group Weight"
		const val LOOP = "Loop"
		const val FADE_IN = "Fade In"
		const val FADE_OUT = "Fade Out"
		const val DEFER_INST = "Defer Inst"
		const val STOP_INST = "Stop Inst"
		const val DURATION = "Duration"
		const val COMPOUND = "Compound"
		const val FALL_OFF = "Falloff"
		const val LFE_MIX = "LFEMix"
		const val SPREAD_3D = "3dSpread"
		const val PRIORITY = "Priority"
		const val STREAM = "Stream"
		const val IS_2D = "Is2D"
		const val TRACKING = "Tracking"
		const val SOLO = "Solo"
		const val MUSIC_VOL = "Music Vol"
		const val BLOCK_1 = "Block 1"
		const val BLOCK_2 = "Block 2"
		const val BLOCK_3 = "Block 3"
		const val HD_OPT_OUT = "HDOptOut"
		const val DELAY = "Delay"
		const val HEADER_4737 = "4737"
		
	}
	
	init { verify(HEADERS) }
	
}