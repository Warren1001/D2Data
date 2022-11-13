package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Sets(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "sets") {
	
	companion object {
		
		private val HEADERS = listOf("index", "name", "version", "PCode2a", "PParam2a", "PMin2a", "PMax2a", "PCode2b", "PParam2b", "PMin2b", "PMax2b", "PCode3a", "PParam3a", "PMin3a", "PMax3a", "PCode3b", "PParam3b", "PMin3b", "PMax3b", "PCode4a", "PParam4a", "PMin4a", "PMax4a", "PCode4b", "PParam4b", "PMin4b", "PMax4b", "PCode5a", "PParam5a", "PMin5a", "PMax5a", "PCode5b", "PParam5b", "PMin5b", "PMax5b", "FCode1", "FParam1", "FMin1", "FMax1", "FCode2", "FParam2", "FMin2", "FMax2", "FCode3", "FParam3", "FMin3", "FMax3", "FCode4", "FParam4", "FMin4", "FMax4", "FCode5", "FParam5", "FMin5", "FMax5", "FCode6", "FParam6", "FMin6", "FMax6", "FCode7", "FParam7", "FMin7", "FMax7", "FCode8", "FParam8", "FMin8", "FMax8", "*eol")
		
		const val INDEX = "index"
		const val NAME = "name"
		const val VERSION = "version"
		const val P_CODE_2_A = "PCode2a"
		const val P_PARAM_2_A = "PParam2a"
		const val P_MIN_2_A = "PMin2a"
		const val P_MAX_2_A = "PMax2a"
		const val P_CODE_2_B = "PCode2b"
		const val P_PARAM_2_B = "PParam2b"
		const val P_MIN_2_B = "PMin2b"
		const val P_MAX_2_B = "PMax2b"
		const val P_CODE_3_A = "PCode3a"
		const val P_PARAM_3_A = "PParam3a"
		const val P_MIN_3_A = "PMin3a"
		const val P_MAX_3_A = "PMax3a"
		const val P_CODE_3_B = "PCode3b"
		const val P_PARAM_3_B = "PParam3b"
		const val P_MIN_3_B = "PMin3b"
		const val P_MAX_3_B = "PMax3b"
		const val P_CODE_4_A = "PCode4a"
		const val P_PARAM_4_A = "PParam4a"
		const val P_MIN_4_A = "PMin4a"
		const val P_MAX_4_A = "PMax4a"
		const val P_CODE_4_B = "PCode4b"
		const val P_PARAM_4_B = "PParam4b"
		const val P_MIN_4_B = "PMin4b"
		const val P_MAX_4_B = "PMax4b"
		const val P_CODE_5_A = "PCode5a"
		const val P_PARAM_5_A = "PParam5a"
		const val P_MIN_5_A = "PMin5a"
		const val P_MAX_5_A = "PMax5a"
		const val P_CODE_5_B = "PCode5b"
		const val P_PARAM_5_B = "PParam5b"
		const val P_MIN_5_B = "PMin5b"
		const val P_MAX_5_B = "PMax5b"
		const val F_CODE_1 = "FCode1"
		const val F_PARAM_1 = "FParam1"
		const val F_MIN_1 = "FMin1"
		const val F_MAX_1 = "FMax1"
		const val F_CODE_2 = "FCode2"
		const val F_PARAM_2 = "FParam2"
		const val F_MIN_2 = "FMin2"
		const val F_MAX_2 = "FMax2"
		const val F_CODE_3 = "FCode3"
		const val F_PARAM_3 = "FParam3"
		const val F_MIN_3 = "FMin3"
		const val F_MAX_3 = "FMax3"
		const val F_CODE_4 = "FCode4"
		const val F_PARAM_4 = "FParam4"
		const val F_MIN_4 = "FMin4"
		const val F_MAX_4 = "FMax4"
		const val F_CODE_5 = "FCode5"
		const val F_PARAM_5 = "FParam5"
		const val F_MIN_5 = "FMin5"
		const val F_MAX_5 = "FMax5"
		const val F_CODE_6 = "FCode6"
		const val F_PARAM_6 = "FParam6"
		const val F_MIN_6 = "FMin6"
		const val F_MAX_6 = "FMax6"
		const val F_CODE_7 = "FCode7"
		const val F_PARAM_7 = "FParam7"
		const val F_MIN_7 = "FMin7"
		const val F_MAX_7 = "FMax7"
		const val F_CODE_8 = "FCode8"
		const val F_PARAM_8 = "FParam8"
		const val F_MIN_8 = "FMin8"
		const val F_MAX_8 = "FMax8"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}