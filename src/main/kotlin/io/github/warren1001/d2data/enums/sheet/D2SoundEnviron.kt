package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2SoundEnviron(override val header: String): D2Header {
	
	HANDLE("Handle"),
	INDEX("Index"),
	SONG("Song"),
	DAY_AMBIENCE("Day Ambience"),
	HD_DAY_AMBIENCE("HD Day Ambience"),
	NIGHT_AMBIENCE("Night Ambience"),
	HD_NIGHT_AMBIENCE("HD Night Ambience"),
	DAY_EVENT("Day Event"),
	HD_DAY_EVENT("HD Day Event"),
	NIGHT_EVENT("Night Event"),
	HD_NIGHT_EVENT("HD Night Event"),
	EVENT_DELAY("Event Delay"),
	HD_EVENT_DELAY("HD Event Delay"),
	INDOORS("Indoors"),
	MATERIAL_1("Material 1"),
	HD_MATERIAL_1("HD Material 1"),
	MATERIAL_2("Material 2"),
	HD_MATERIAL_2("HD Material 2"),
	SFX_EAX_ENVIRON("SFX EAX Environ"),
	SFX_EAX_ROOM_VOL("SFX EAX Room Vol"),
	SFX_EAX_ROOM_HF("SFX EAX Room HF"),
	SFX_EAX_DECAY_TIME("SFX EAX Decay Time"),
	SFX_EAX_DECAY_HF("SFX EAX Decay HF"),
	SFX_EAX_REFLECT("SFX EAX Reflect"),
	SFX_EAX_REFLECT_DELAY("SFX EAX Reflect Delay"),
	SFX_EAX_REVERB("SFX EAX Reverb"),
	SFX_EAX_REV_DELAY("SFX EAX Rev Delay"),
	VOX_EAX_ENVIRON("VOX EAX Environ"),
	VOX_EAX_ROOM_VOL("VOX EAX Room Vol"),
	VOX_EAX_ROOM_HF("VOX EAX Room HF"),
	VOX_EAX_DECAY_TIME("VOX EAX Decay Time"),
	VOX_EAX_DECAY_HF("VOX EAX Decay HF"),
	VOX_EAX_REFLECT("VOX EAX Reflect"),
	VOX_EAX_REFLECT_DELAY("VOX EAX Reflect Delay"),
	VOX_EAX_REVERB("VOX EAX Reverb"),
	VOX_EAX_REV_DELAY("VOX EAX Rev Delay"),
	INHERIT_ENVIRONMENT("InheritEnvrionment"); // blizzard typo'd the header
	
	companion object {
		val FILE_PATH = "global/excel/soundenviron.txt".properSeparator()
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = HANDLE
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}