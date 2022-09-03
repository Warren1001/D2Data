package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2Gems(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "gems") {
	
	companion object {
		
		private val HEADERS = listOf("name", "letter", "transform", "code", "weaponMod1Code", "weaponMod1Param", "weaponMod1Min", "weaponMod1Max", "weaponMod2Code", "weaponMod2Param", "weaponMod2Min", "weaponMod2Max", "weaponMod3Code", "weaponMod3Param", "weaponMod3Min", "weaponMod3Max", "helmMod1Code", "helmMod1Param", "helmMod1Min", "helmMod1Max", "helmMod2Code", "helmMod2Param", "helmMod2Min", "helmMod2Max", "helmMod3Code", "helmMod3Param", "helmMod3Min", "helmMod3Max", "shieldMod1Code", "shieldMod1Param", "shieldMod1Min", "shieldMod1Max", "shieldMod2Code", "shieldMod2Param", "shieldMod2Min", "shieldMod2Max", "shieldMod3Code", "shieldMod3Param", "shieldMod3Min", "shieldMod3Max")
		
		const val NAME = "name"
		const val LETTER = "letter"
		const val TRANSFORM = "transform"
		const val CODE = "code"
		const val WEAPON_MOD_1_CODE = "weaponMod1Code"
		const val WEAPON_MOD_1_PARAM = "weaponMod1Param"
		const val WEAPON_MOD_1_MIN = "weaponMod1Min"
		const val WEAPON_MOD_1_MAX = "weaponMod1Max"
		const val WEAPON_MOD_2_CODE = "weaponMod2Code"
		const val WEAPON_MOD_2_PARAM = "weaponMod2Param"
		const val WEAPON_MOD_2_MIN = "weaponMod2Min"
		const val WEAPON_MOD_2_MAX = "weaponMod2Max"
		const val WEAPON_MOD_3_CODE = "weaponMod3Code"
		const val WEAPON_MOD_3_PARAM = "weaponMod3Param"
		const val WEAPON_MOD_3_MIN = "weaponMod3Min"
		const val WEAPON_MOD_3_MAX = "weaponMod3Max"
		const val HELM_MOD_1_CODE = "helmMod1Code"
		const val HELM_MOD_1_PARAM = "helmMod1Param"
		const val HELM_MOD_1_MIN = "helmMod1Min"
		const val HELM_MOD_1_MAX = "helmMod1Max"
		const val HELM_MOD_2_CODE = "helmMod2Code"
		const val HELM_MOD_2_PARAM = "helmMod2Param"
		const val HELM_MOD_2_MIN = "helmMod2Min"
		const val HELM_MOD_2_MAX = "helmMod2Max"
		const val HELM_MOD_3_CODE = "helmMod3Code"
		const val HELM_MOD_3_PARAM = "helmMod3Param"
		const val HELM_MOD_3_MIN = "helmMod3Min"
		const val HELM_MOD_3_MAX = "helmMod3Max"
		const val SHIELD_MOD_1_CODE = "shieldMod1Code"
		const val SHIELD_MOD_1_PARAM = "shieldMod1Param"
		const val SHIELD_MOD_1_MIN = "shieldMod1Min"
		const val SHIELD_MOD_1_MAX = "shieldMod1Max"
		const val SHIELD_MOD_2_CODE = "shieldMod2Code"
		const val SHIELD_MOD_2_PARAM = "shieldMod2Param"
		const val SHIELD_MOD_2_MIN = "shieldMod2Min"
		const val SHIELD_MOD_2_MAX = "shieldMod2Max"
		const val SHIELD_MOD_3_CODE = "shieldMod3Code"
		const val SHIELD_MOD_3_PARAM = "shieldMod3Param"
		const val SHIELD_MOD_3_MIN = "shieldMod3Min"
		const val SHIELD_MOD_3_MAX = "shieldMod3Max"
		
	}
	
	init { verify(HEADERS) }
	
}