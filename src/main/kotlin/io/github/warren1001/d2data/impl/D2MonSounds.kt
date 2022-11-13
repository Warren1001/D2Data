package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2MonSounds(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "monsounds") {
	
	companion object {
		
		private val HEADERS = listOf("Id", "Attack1", "Weapon1", "Att1Del", "Wea1Del", "Att1Prb", "Wea1Vol", "Attack2", "Weapon2", "Att2Del", "Wea2Del", "Att2Prb", "Wea2Vol", "HitSound", "DeathSound", "HitDelay", "DeaDelay", "Skill1", "Skill2", "Skill3", "Skill4", "Footstep", "FootstepLayer", "FsCnt", "FsOff", "FsPrb", "Neutral", "NeuTime", "Init", "Taunt", "Flee", "CvtMo1", "CvtSk1", "CvtTgt1", "CvtMo2", "CvtSk2", "CvtTgt2", "CvtMo3", "CvtSk3", "CvtTgt3", "EOL")
		
		const val ID = "Id"
		const val ATTACK_1 = "Attack1"
		const val WEAPON_1 = "Weapon1"
		const val ATT_1_DEL = "Att1Del"
		const val WEA_1_DEL = "Wea1Del"
		const val ATT_1_PRB = "Att1Prb"
		const val WEA_1_VOL = "Wea1Vol"
		const val ATTACK_2 = "Attack2"
		const val WEAPON_2 = "Weapon2"
		const val ATT_2_DEL = "Att2Del"
		const val WEA_2_DEL = "Wea2Del"
		const val ATT_2_PRB = "Att2Prb"
		const val WEA_2_VOL = "Wea2Vol"
		const val HIT_SOUND = "HitSound"
		const val DEATH_SOUND = "DeathSound"
		const val HIT_DELAY = "HitDelay"
		const val DEA_DELAY = "DeaDelay"
		const val SKILL_1 = "Skill1"
		const val SKILL_2 = "Skill2"
		const val SKILL_3 = "Skill3"
		const val SKILL_4 = "Skill4"
		const val FOOTSTEP = "Footstep"
		const val FOOTSTEP_LAYER = "FootstepLayer"
		const val FS_CNT = "FsCnt"
		const val FS_OFF = "FsOff"
		const val FS_PRB = "FsPrb"
		const val NEUTRAL = "Neutral"
		const val NEU_TIME = "NeuTime"
		const val INIT = "Init"
		const val TAUNT = "Taunt"
		const val FLEE = "Flee"
		const val CVT_MO_1 = "CvtMo1"
		const val CVT_SK_1 = "CvtSk1"
		const val CVT_TGT_1 = "CvtTgt1"
		const val CVT_MO_2 = "CvtMo2"
		const val CVT_SK_2 = "CvtSk2"
		const val CVT_TGT_2 = "CvtTgt2"
		const val CVT_MO_3 = "CvtMo3"
		const val CVT_SK_3 = "CvtSk3"
		const val CVT_TGT_3 = "CvtTgt3"
		const val EOL = "EOL"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}