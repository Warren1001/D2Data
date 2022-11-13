package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2SoundEnviron(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "soundenviron") {
	
	companion object {
		
		private val HEADERS = listOf("Handle", "Index", "Song", "Day Ambience", "HD Day Ambience", "Night Ambience", "HD Night Ambience", "Day Event", "HD Day Event", "Night Event", "HD Night " +
				"Event", "Event Delay", "HD Event Delay", "Indoors", "Material 1", "HD Material 1", "Material 2", "HD Material 2", "SFX EAX Environ", "SFX EAX Room Vol", "SFX EAX Room HF", "SFX EAX" +
				" Decay Time", "SFX EAX Decay HF", "SFX EAX Reflect", "SFX EAX Reflect Delay", "SFX EAX Reverb", "SFX EAX Rev Delay", "VOX EAX Environ", "VOX EAX Room Vol", "VOX EAX Room HF", "VOX " +
				"EAX Decay Time", "VOX EAX Decay HF", "VOX EAX Reflect", "VOX EAX Reflect Delay", "VOX EAX Reverb", "VOX EAX Rev Delay", "InheritEnvrionment")
		
		const val HANDLE = "Handle"
		const val INDEX = "Index"
		const val SONG = "Song"
		const val DAY_AMBIENCE = "Day Ambience"
		const val HD_DAY_AMBIENCE = "HD Day Ambience"
		const val NIGHT_AMBIENCE = "Night Ambience"
		const val HD_NIGHT_AMBIENCE = "HD Night Ambience"
		const val DAY_EVENT = "Day Event"
		const val HD_DAY_EVENT = "HD Day Event"
		const val NIGHT_EVENT = "Night Event"
		const val HD_NIGHT_EVENT = "HD Night Event"
		const val EVENT_DELAY = "Event Delay"
		const val HD_EVENT_DELAY = "HD Event Delay"
		const val INDOORS = "Indoors"
		const val MATERIAL_1 = "Material 1"
		const val HD_MATERIAL_1 = "HD Material 1"
		const val MATERIAL_2 = "Material 2"
		const val HD_MATERIAL_2 = "HD Material 2"
		const val SFX_EAX_ENVIRON = "SFX EAX Environ"
		const val SFX_EAX_ROOM_VOL = "SFX EAX Room Vol"
		const val SFX_EAX_ROOM_HF = "SFX EAX Room HF"
		const val SFX_EAX_DECAY_TIME = "SFX EAX Decay Time"
		const val SFX_EAX_DECAY_HF = "SFX EAX Decay HF"
		const val SFX_EAX_REFLECT = "SFX EAX Reflect"
		const val SFX_EAX_REFLECT_DELAY = "SFX EAX Reflect Delay"
		const val SFX_EAX_REVERB = "SFX EAX Reverb"
		const val SFX_EAX_REV_DELAY = "SFX EAX Rev Delay"
		const val VOX_EAX_ENVIRON = "VOX EAX Environ"
		const val VOX_EAX_ROOM_VOL = "VOX EAX Room Vol"
		const val VOX_EAX_ROOM_HF = "VOX EAX Room HF"
		const val VOX_EAX_DECAY_TIME = "VOX EAX Decay Time"
		const val VOX_EAX_DECAY_HF = "VOX EAX Decay HF"
		const val VOX_EAX_REFLECT = "VOX EAX Reflect"
		const val VOX_EAX_REFLECT_DELAY = "VOX EAX Reflect Delay"
		const val VOX_EAX_REVERB = "VOX EAX Reverb"
		const val VOX_EAX_REV_DELAY = "VOX EAX Rev Delay"
		const val INHERIT_ENVIRONMENT = "InheritEnvrionment" // blizzard typo'd the header
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}