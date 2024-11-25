package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Sounds(header: String, vararg headerHistory: String): D2Header {
	
	SOUND("Sound"),
	INDEX("*Index", "Index"),
	REDIRECT("Redirect"),
	CHANNEL("Channel"),
	FILE_NAME("FileName"),
	IS_LOCAL("IsLocal"),
	IS_MUSIC("IsMusic"),
	IS_AMBIENT_SCENE("IsAmbientScene"),
	IS_AMBIENT_EVENT("IsAmbientEvent"),
	IS_UI("IsUI"),
	VOLUME_MIN("Volume Min"),
	VOLUME_MAX("Volume Max"),
	PITCH_MIN("Pitch Min"),
	PITCH_MAX("Pitch Max"),
	GROUP_SIZE("Group Size"),
	GROUP_WEIGHT("Group Weight"),
	LOOP("Loop"),
	FADE_IN("Fade In"),
	FADE_OUT("Fade Out"),
	DEFER_INST("Defer Inst"),
	STOP_INST("Stop Inst"),
	DURATION("Duration"),
	COMPOUND("Compound"),
	FALL_OFF("Falloff"),
	LFE_MIX("LFEMix"),
	SPREAD_3D("3dSpread"),
	PRIORITY("Priority"),
	STREAM("Stream"),
	IS_2D("Is2D"),
	TRACKING("Tracking"),
	SOLO("Solo"),
	MUSIC_VOL("Music Vol"),
	BLOCK_1("Block 1"),
	BLOCK_2("Block 2"),
	BLOCK_3("Block 3"),
	HD_OPT_OUT("HDOptOut"),
	DELAY("Delay"),
	HEADER_4737("4737");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/sounds.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = INDEX
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}