package io.github.warren1001.d2data.enums

enum class D2MonSounds(val header: String) {
	
	ID("Id"),
	ATTACK_1("Attack1"),
	WEAPON_1("Weapon1"),
	ATT_1_DEL("Att1Del"),
	WEA_1_DEL("Wea1Del"),
	ATT_1_PRB("Att1Prb"),
	WEA_1_VOL("Wea1Vol"),
	ATTACK_2("Attack2"),
	WEAPON_2("Weapon2"),
	ATT_2_DEL("Att2Del"),
	WEA_2_DEL("Wea2Del"),
	ATT_2_PRB("Att2Prb"),
	WEA_2_VOL("Wea2Vol"),
	HIT_SOUND("HitSound"),
	DEATH_SOUND("DeathSound"),
	HIT_DELAY("HitDelay"),
	DEA_DELAY("DeaDelay"),
	SKILL_1("Skill1"),
	SKILL_2("Skill2"),
	SKILL_3("Skill3"),
	SKILL_4("Skill4"),
	FOOTSTEP("Footstep"),
	FOOTSTEP_LAYER("FootstepLayer"),
	FS_CNT("FsCnt"),
	FS_OFF("FsOff"),
	FS_PRB("FsPrb"),
	NEUTRAL("Neutral"),
	NEU_TIME("NeuTime"),
	INIT("Init"),
	TAUNT("Taunt"),
	FLEE("Flee"),
	CVT_MO_1("CvtMo1"),
	CVT_SK_1("CvtSk1"),
	CVT_TGT_1("CvtTgt1"),
	CVT_MO_2("CvtMo2"),
	CVT_SK_2("CvtSk2"),
	CVT_TGT_2("CvtTgt2"),
	CVT_MO_3("CvtMo3"),
	CVT_SK_3("CvtSk3"),
	CVT_TGT_3("CvtTgt3"),
	EOL("EOL");
	
	companion object {
		const val SHEET_NAME = "monsounds"
		val HEADERS = values().map { it.header }
	}
	
}