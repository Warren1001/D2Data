package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2MonStats2(header: String, vararg headerHistory: String): D2Header {
	
	ID("Id"),
	HC_IDX("*hcIdx"),
	HEIGHT("Height"),
	OVERLAY_HEIGHT("OverlayHeight"),
	PIX_HEIGHT("pixHeight"),
	SIZE_X("SizeX"),
	SIZE_Y("SizeY"),
	SPAWN_COL("spawnCol"),
	MELEE_RNG("MeleeRng"),
	BASE_W("BaseW"),
	HIT_CLASS("HitClass"),
	HDV("HDv"),
	TRV("TRv"),
	LGV("LGv"),
	RAV("Rav"),
	LAV("Lav"),
	RHV("RHv"),
	LHV("LHv"),
	SHV("SHv"),
	S1_V("S1v"),
	S2_V("S2v"),
	S3_V("S3v"),
	S4_V("S4v"),
	S5_V("S5v"),
	S6_V("S6v"),
	S7_V("S7v"),
	S8_V("S8v"),
	HD("HD"),
	TR("TR"),
	LG("LG"),
	RA("RA"),
	LA("LA"),
	RH("RH"),
	LH("LH"),
	SH("SH"),
	S1("S1"),
	S2("S2"),
	S3("S3"),
	S4("S4"),
	S5("S5"),
	S6("S6"),
	S7("S7"),
	S8("S8"),
	TOTAL_PIECES("TotalPieces"),
	M_DT("mDT"),
	M_NU("mNU"),
	M_WL("mWL"),
	M_GH("mGH"),
	M_A1("mA1"),
	M_A2("mA2"),
	M_BL("mBL"),
	M_SC("mSC"),
	M_S1("mS1"),
	M_S2("mS2"),
	M_S3("mS3"),
	M_S4("mS4"),
	M_DD("mDD"),
	M_KB("mKB"),
	M_SQ("mSQ"),
	M_RN("mRN"),
	D_DT("dDT"),
	D_NU("dNU"),
	D_WL("dWL"),
	D_GH("dGH"),
	D_A1("dA1"),
	D_A2("dA2"),
	D_BL("dBL"),
	D_SC("dSC"),
	D_S1("dS1"),
	D_S2("dS2"),
	D_S3("dS3"),
	D_S4("dS4"),
	D_DD("dDD"),
	D_KB("dKB"),
	D_SQ("dSQ"),
	D_RN("dRN"),
	A1_MV("A1mv"),
	A2_MV("A2mv"),
	S_CMV("SCmv"),
	S1_MV("S1mv"),
	S2_MV("S2mv"),
	S3_MV("S3mv"),
	S4_MV("S4mv"),
	NO_GFX_HIT_TEST("noGfxHitTest"),
	HT_TOP("htTop"),
	HT_LEFT("htLeft"),
	HT_WIDTH("htWidth"),
	HT_HEIGHT("htHeight"),
	RESTORE("restore"),
	AUTOMAP_CEL("automapCel"),
	NO_MAP("noMap"),
	NO_OVLY("noOvly"),
	IS_SEL("isSel"),
	AL_SEL("alSel"),
	NO_SEL("noSel"),
	SHIFT_SEL("shiftSel"),
	CORPSE_SEL("corpseSel"),
	IS_ATT("isAtt"),
	REVIVE("revive"),
	LIMIT_CORPSES("limitCorpses"),
	CRITTER("critter"),
	SMALL("small"),
	LARGE("large"),
	SOFT("soft"),
	INERT("inert"),
	OBJ_COL("objCol"),
	DEAD_COL("deadCol"),
	UNFLAT_DEAD("unflatDead"),
	SHADOW("Shadow"),
	NO_UNIQUE_SHIFT("noUniqueShift"),
	COMPOSITE_DEATH("compositeDeath"),
	LOCAL_BLOOD("localBlood"),
	BLEED("Bleed"),
	LIGHT("Light"),
	LIGHT_R("light-r"),
	LIGHT_G("light-g"),
	LIGHT_B("light-b"),
	UTRANS("Utrans"),
	UTRANS_NIGHTMARE("Utrans(N)"),
	UTRANS_HELL("Utrans(H)"),
	INFERNO_LEN("InfernoLen"),
	INFERNO_ANIM("InfernoAnim"),
	INFERNO_ROLLBACK("InfernoRollback"),
	RESURRECT_MODE("ResurrectMode"),
	RESURRECT_SKILL("ResurrectSkill"),
	SPAWN_UNIQUE_MOD("SpawnUniqueMod"),
	EOL("*eol");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/monstats2.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = ID
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}