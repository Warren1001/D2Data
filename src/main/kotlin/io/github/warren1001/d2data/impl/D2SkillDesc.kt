package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2SkillDesc(manager: D2Sheets, dir: File) : D2Sheet(manager, dir, "skilldesc") {
	
	companion object {
		
		private val HEADERS = listOf(
			"skilldesc",
			"SkillPage",
			"SkillRow",
			"SkillColumn",
			"ListRow",
			"IconCel",
			"HireableIconCel",
			"str name",
			"str short",
			"str long",
			"str alt",
			"descdam",
			"ddam calc1",
			"ddam calc2",
			"p1dmelem",
			"p1dmmin",
			"p1dmmax",
			"p2dmelem",
			"p2dmmin",
			"p2dmmax",
			"p3dmelem",
			"p3dmmin",
			"p3dmmax",
			"descatt",
			"descmissile1",
			"descmissile2",
			"descmissile3",
			"descline1",
			"desctexta1",
			"desctextb1",
			"desccalca1",
			"desccalcb1",
			"descline2",
			"desctexta2",
			"desctextb2",
			"desccalca2",
			"desccalcb2",
			"descline3",
			"desctexta3",
			"desctextb3",
			"desccalca3",
			"desccalcb3",
			"descline4",
			"desctexta4",
			"desctextb4",
			"desccalca4",
			"desccalcb4",
			"descline5",
			"desctexta5",
			"desctextb5",
			"desccalca5",
			"desccalcb5",
			"descline6",
			"desctexta6",
			"desctextb6",
			"desccalca6",
			"desccalcb6",
			"dsc2line1",
			"dsc2texta1",
			"dsc2textb1",
			"dsc2calca1",
			"dsc2calcb1",
			"dsc2line2",
			"dsc2texta2",
			"dsc2textb2",
			"dsc2calca2",
			"dsc2calcb2",
			"dsc2line3",
			"dsc2texta3",
			"dsc2textb3",
			"dsc2calca3",
			"dsc2calcb3",
			"dsc2line4",
			"dsc2texta4",
			"dsc2textb4",
			"dsc2calca4",
			"dsc2calcb4",
			"dsc2line5",
			"dsc2texta5",
			"dsc2textb5",
			"dsc2calca5",
			"dsc2calcb5",
			"dsc3line1",
			"dsc3texta1",
			"dsc3textb1",
			"dsc3calca1",
			"dsc3calcb1",
			"dsc3line2",
			"dsc3texta2",
			"dsc3textb2",
			"dsc3calca2",
			"dsc3calcb2",
			"dsc3line3",
			"dsc3texta3",
			"dsc3textb3",
			"dsc3calca3",
			"dsc3calcb3",
			"dsc3line4",
			"dsc3texta4",
			"dsc3textb4",
			"dsc3calca4",
			"dsc3calcb4",
			"dsc3line5",
			"dsc3texta5",
			"dsc3textb5",
			"dsc3calca5",
			"dsc3calcb5",
			"dsc3line6",
			"dsc3texta6",
			"dsc3textb6",
			"dsc3calca6",
			"dsc3calcb6",
			"dsc3line7",
			"dsc3texta7",
			"dsc3textb7",
			"dsc3calca7",
			"dsc3calcb7",
			"*eol"
		)
		
		const val SKILL_DESC = "skilldesc"
		const val SKILL_PAGE = "SkillPage"
		const val SKILL_ROW = "SkillRow"
		const val SKILL_COLUMN = "SkillColumn"
		const val LIST_ROW = "ListRow"
		const val ICON_CEL = "IconCel"
		const val HIREABLE_ICON_CEL = "HireableIconCel"
		const val STR_NAME = "str name"
		const val STR_SHORT = "str short"
		const val STR_LONG = "str long"
		const val STR_ALT = "str alt"
		const val DESC_DAM = "descdam"
		const val DDAM_CALC_1 = "ddam calc1"
		const val DDAM_CALC_2 = "ddam calc2"
		const val P1_DM_ELEM = "p1dmelem"
		const val P1_DM_MIN = "p1dmmin"
		const val P1_DM_MAX = "p1dmmax"
		const val P2_DM_ELEM = "p2dmelem"
		const val P2_DM_MIN = "p2dmmin"
		const val P2_DM_MAX = "p2dmmax"
		const val P3_DM_ELEM = "p3dmelem"
		const val P3_DM_MIN = "p3dmmin"
		const val P3_DM_MAX = "p3dmmax"
		const val DESCATT = "descatt"
		const val DESC_MISSILE_1 = "descmissile1"
		const val DESC_MISSILE_2 = "descmissile2"
		const val DESC_MISSILE_3 = "descmissile3"
		const val DESC_LINE_1 = "descline1"
		const val DESC_TEXT_A1 = "desctexta1"
		const val DESC_TEXT_B1 = "desctextb1"
		const val DESC_CALC_A1 = "desccalca1"
		const val DESC_CALC_B1 = "desccalcb1"
		const val DESC_LINE_2 = "descline2"
		const val DESC_TEXT_A2 = "desctexta2"
		const val DESC_TEXT_B2 = "desctextb2"
		const val DESC_CALC_A2 = "desccalca2"
		const val DESC_CALC_B2 = "desccalcb2"
		const val DESC_LINE_3 = "descline3"
		const val DESC_TEXT_A3 = "desctexta3"
		const val DESC_TEXT_B3 = "desctextb3"
		const val DESC_CALC_A3 = "desccalca3"
		const val DESC_CALC_B3 = "desccalcb3"
		const val DESC_LINE_4 = "descline4"
		const val DESC_TEXT_A4 = "desctexta4"
		const val DESC_TEXT_B4 = "desctextb4"
		const val DESC_CALC_A4 = "desccalca4"
		const val DESC_CALC_B4 = "desccalcb4"
		const val DESC_LINE_5 = "descline5"
		const val DESC_TEXT_A5 = "desctexta5"
		const val DESC_TEXT_B5 = "desctextb5"
		const val DESC_CALC_A5 = "desccalca5"
		const val DESC_CALC_B5 = "desccalcb5"
		const val DESC_LINE_6 = "descline6"
		const val DESC_TEXT_A6 = "desctexta6"
		const val DESC_TEXT_B6 = "desctextb6"
		const val DESC_CALC_A6 = "desccalca6"
		const val DESC_CALC_B6 = "desccalcb6"
		const val DSC_2_LINE_1 = "dsc2line1"
		const val DSC_2_TEXT_A1 = "dsc2texta1"
		const val DSC_2_TEXT_B1 = "dsc2textb1"
		const val DSC_2_CALC_A1 = "dsc2calca1"
		const val DSC_2_CALC_B1 = "dsc2calcb1"
		const val DSC_2_LINE_2 = "dsc2line2"
		const val DSC_2_TEXT_A2 = "dsc2texta2"
		const val DSC_2_TEXT_B2 = "dsc2textb2"
		const val DSC_2_CALC_A2 = "dsc2calca2"
		const val DSC_2_CALC_B2 = "dsc2calcb2"
		const val DSC_2_LINE_3 = "dsc2line3"
		const val DSC_2_TEXT_A3 = "dsc2texta3"
		const val DSC_2_TEXT_B3 = "dsc2textb3"
		const val DSC_2_CALC_A3 = "dsc2calca3"
		const val DSC_2_CALC_B3 = "dsc2calcb3"
		const val DSC_2_LINE_4 = "dsc2line4"
		const val DSC_2_TEXT_A4 = "dsc2texta4"
		const val DSC_2_TEXT_B4 = "dsc2textb4"
		const val DSC_2_CALC_A4 = "dsc2calca4"
		const val DSC_2_CALC_B4 = "dsc2calcb4"
		const val DSC_2_LINE_5 = "dsc2line5"
		const val DSC_2_TEXT_A5 = "dsc2texta5"
		const val DSC_2_TEXT_B5 = "dsc2textb5"
		const val DSC_2_CALC_A5 = "dsc2calca5"
		const val DSC_2_CALC_B5 = "dsc2calcb5"
		const val DSC_3_LINE_1 = "dsc3line1"
		const val DSC_3_TEXT_A1 = "dsc3texta1"
		const val DSC_3_TEXT_B1 = "dsc3textb1"
		const val DSC_3_CALC_A1 = "dsc3calca1"
		const val DSC_3_CALC_B1 = "dsc3calcb1"
		const val DSC_3_LINE_2 = "dsc3line2"
		const val DSC_3_TEXT_A2 = "dsc3texta2"
		const val DSC_3_TEXT_B2 = "dsc3textb2"
		const val DSC_3_CALC_A2 = "dsc3calca2"
		const val DSC_3_CALC_B2 = "dsc3calcb2"
		const val DSC_3_LINE_3 = "dsc3line3"
		const val DSC_3_TEXT_A3 = "dsc3texta3"
		const val DSC_3_TEXT_B3 = "dsc3textb3"
		const val DSC_3_CALC_A3 = "dsc3calca3"
		const val DSC_3_CALC_B3 = "dsc3calcb3"
		const val DSC_3_LINE_4 = "dsc3line4"
		const val DSC_3_TEXT_A4 = "dsc3texta4"
		const val DSC_3_TEXT_B4 = "dsc3textb4"
		const val DSC_3_CALC_A4 = "dsc3calca4"
		const val DSC_3_CALC_B4 = "dsc3calcb4"
		const val DSC_3_LINE_5 = "dsc3line5"
		const val DSC_3_TEXT_A5 = "dsc3texta5"
		const val DSC_3_TEXT_B5 = "dsc3textb5"
		const val DSC_3_CALC_A5 = "dsc3calca5"
		const val DSC_3_CALC_B5 = "dsc3calcb5"
		const val DSC_3_LINE_6 = "dsc3line6"
		const val DSC_3_TEXT_A6 = "dsc3texta6"
		const val DSC_3_TEXT_B6 = "dsc3textb6"
		const val DSC_3_CALC_A6 = "dsc3calca6"
		const val DSC_3_CALC_B6 = "dsc3calcb6"
		const val DSC_3_LINE_7 = "dsc3line7"
		const val DSC_3_TEXT_A7 = "dsc3texta7"
		const val DSC_3_TEXT_B7 = "dsc3textb7"
		const val DSC_3_CALC_A7 = "dsc3calca7"
		const val DSC_3_CALC_B7 = "dsc3calcb7"
		const val EOL = "*eol"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}