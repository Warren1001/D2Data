package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2Gems(header: String, vararg headerHistory: String): D2Header {
	
	NAME("name"),
	LETTER("letter"),
	TRANSFORM("transform"),
	CODE("code"),
	WEAPON_MOD_1_CODE("weaponMod1Code"),
	WEAPON_MOD_1_PARAM("weaponMod1Param"),
	WEAPON_MOD_1_MIN("weaponMod1Min"),
	WEAPON_MOD_1_MAX("weaponMod1Max"),
	WEAPON_MOD_2_CODE("weaponMod2Code"),
	WEAPON_MOD_2_PARAM("weaponMod2Param"),
	WEAPON_MOD_2_MIN("weaponMod2Min"),
	WEAPON_MOD_2_MAX("weaponMod2Max"),
	WEAPON_MOD_3_CODE("weaponMod3Code"),
	WEAPON_MOD_3_PARAM("weaponMod3Param"),
	WEAPON_MOD_3_MIN("weaponMod3Min"),
	WEAPON_MOD_3_MAX("weaponMod3Max"),
	HELM_MOD_1_CODE("helmMod1Code"),
	HELM_MOD_1_PARAM("helmMod1Param"),
	HELM_MOD_1_MIN("helmMod1Min"),
	HELM_MOD_1_MAX("helmMod1Max"),
	HELM_MOD_2_CODE("helmMod2Code"),
	HELM_MOD_2_PARAM("helmMod2Param"),
	HELM_MOD_2_MIN("helmMod2Min"),
	HELM_MOD_2_MAX("helmMod2Max"),
	HELM_MOD_3_CODE("helmMod3Code"),
	HELM_MOD_3_PARAM("helmMod3Param"),
	HELM_MOD_3_MIN("helmMod3Min"),
	HELM_MOD_3_MAX("helmMod3Max"),
	SHIELD_MOD_1_CODE("shieldMod1Code"),
	SHIELD_MOD_1_PARAM("shieldMod1Param"),
	SHIELD_MOD_1_MIN("shieldMod1Min"),
	SHIELD_MOD_1_MAX("shieldMod1Max"),
	SHIELD_MOD_2_CODE("shieldMod2Code"),
	SHIELD_MOD_2_PARAM("shieldMod2Param"),
	SHIELD_MOD_2_MIN("shieldMod2Min"),
	SHIELD_MOD_2_MAX("shieldMod2Max"),
	SHIELD_MOD_3_CODE("shieldMod3Code"),
	SHIELD_MOD_3_PARAM("shieldMod3Param"),
	SHIELD_MOD_3_MIN("shieldMod3Min"),
	SHIELD_MOD_3_MAX("shieldMod3Max");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/gems.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = NAME
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}