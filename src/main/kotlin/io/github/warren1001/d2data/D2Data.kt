package io.github.warren1001.d2data

import io.github.warren1001.d2data.enums.*
import java.io.File

val DIRECTORY = File("current")
val MANAGER = D2Sheets(DIRECTORY)

fun main() {
	
	MANAGER.loadAll()
	
	if (!MANAGER.verify()) {
		println("------------------------------------")
		println("Data provided at ${DIRECTORY.absolutePath} is not of the D2R version 2.6, errors may occur if attempting to parse this data")
		println("------------------------------------")
	}
	
	compareDifferences()
	//makeMod()
	//normalizeAffixRarity()
	
}

fun compareDifferences() {
	val newManager = D2Sheets(File("new"))
	newManager.loadAll()
	MANAGER.compareToNew(newManager)
}

private val doNotMax = listOf(
	"dmg-fire", "dmg-cold", "dmg-light", "dmg-pois", "dmg-mag", "dmg-throw", "dmg-norm", "dmg-elem", "reanimate", "rep-dur", "rep-quant", "stack", "state",
	"aura", "att-skill", "hit-skill", "gethit-skill", "charged", "kill-skill", "death-skill", "levelup-skill", "skill-rand",
	"magicarrow", "explosivearrow"
)

fun makeMod() {
	val monLvl = MANAGER.getSheet(D2MonLvl.SHEET_NAME)!!
	monLvl.forEach {
		monLvl[it, D2MonLvl.XP] = "100"
		monLvl[it, D2MonLvl.XP_NIGHTMARE] = "100"
		monLvl[it, D2MonLvl.XP_HELL] = "100"
		monLvl[it, D2MonLvl.L_XP] = "100"
		monLvl[it, D2MonLvl.L_XP_NIGHTMARE] = "100"
		monLvl[it, D2MonLvl.L_XP_HELL] = "100"
	}
	monLvl.save()
	val weapons = MANAGER.getSheet(D2Weapons.SHEET_NAME)!!
	val armor = MANAGER.getSheet(D2Armor.SHEET_NAME)!!
	val misc = MANAGER.getSheet(D2Misc.SHEET_NAME)!!
	weapons.forEach {
		weapons[it, D2Weapons.SHOW_LEVEL] = "1"
		weapons[it, D2Weapons.GAMBLE_COST] = "1"
	}
	armor.forEach {
		armor[it, D2Armor.SHOW_LEVEL] = "1"
		armor[it, D2Armor.GAMBLE_COST] = "1"
	}
	misc.forEach {
		misc[it, D2Misc.SHOW_LEVEL] = "1"
		misc[it, D2Misc.GAMBLE_COST] = "1"
	}
	weapons.save()
	armor.save()
	misc.save()
	val autoMagic = MANAGER.getSheet(D2AutoMagic.SHEET_NAME)!!
	autoMagic.forEach {
		if (autoMagic[it, D2AutoMagic.FREQUENCY] != "0") autoMagic[it, D2AutoMagic.FREQUENCY] = "1"
		if (autoMagic[it, D2AutoMagic.MOD_1_CODE] !in doNotMax) autoMagic[it, D2AutoMagic.MOD_1_MIN] = autoMagic[it, D2AutoMagic.MOD_1_MAX]
		if (autoMagic[it, D2AutoMagic.MOD_2_CODE] !in doNotMax) autoMagic[it, D2AutoMagic.MOD_2_MIN] = autoMagic[it, D2AutoMagic.MOD_2_MAX]
		if (autoMagic[it, D2AutoMagic.MOD_3_CODE] !in doNotMax) autoMagic[it, D2AutoMagic.MOD_3_MIN] = autoMagic[it, D2AutoMagic.MOD_3_MAX]
	}
	autoMagic.save()
	val magicPrefix = MANAGER.getSheet(D2MagicPrefix.SHEET_NAME)!!
	magicPrefix.forEach {
		if (magicPrefix[it, D2MagicPrefix.FREQUENCY] != "0") magicPrefix[it, D2MagicPrefix.FREQUENCY] = "1"
		if (magicPrefix[it, D2MagicPrefix.MOD_1_CODE] !in doNotMax) magicPrefix[it, D2MagicPrefix.MOD_1_MIN] = magicPrefix[it, D2MagicPrefix.MOD_1_MAX]
		if (magicPrefix[it, D2MagicPrefix.MOD_2_CODE] !in doNotMax) magicPrefix[it, D2MagicPrefix.MOD_2_MIN] = magicPrefix[it, D2MagicPrefix.MOD_2_MAX]
		if (magicPrefix[it, D2MagicPrefix.MOD_3_CODE] !in doNotMax) magicPrefix[it, D2MagicPrefix.MOD_3_MIN] = magicPrefix[it, D2MagicPrefix.MOD_3_MAX]
	}
	magicPrefix.save()
	val magicSuffix = MANAGER.getSheet(D2MagicSuffix.SHEET_NAME)!!
	magicSuffix.forEach {
		if (magicSuffix[it, D2MagicSuffix.FREQUENCY] != "0") magicSuffix[it, D2MagicSuffix.FREQUENCY] = "1"
		if (magicSuffix[it, D2MagicSuffix.MOD_1_CODE] !in doNotMax) magicSuffix[it, D2MagicSuffix.MOD_1_MIN] = magicSuffix[it, D2MagicSuffix.MOD_1_MAX]
		if (magicSuffix[it, D2MagicSuffix.MOD_2_CODE] !in doNotMax) magicSuffix[it, D2MagicSuffix.MOD_2_MIN] = magicSuffix[it, D2MagicSuffix.MOD_2_MAX]
		if (magicSuffix[it, D2MagicSuffix.MOD_3_CODE] !in doNotMax) magicSuffix[it, D2MagicSuffix.MOD_3_MIN] = magicSuffix[it, D2MagicSuffix.MOD_3_MAX]
	}
	magicSuffix.save()
	val setItems = MANAGER.getSheet(D2SetItems.SHEET_NAME)!!
	setItems.forEach {
		if (setItems[it, D2SetItems.PROP_1] !in doNotMax) setItems[it, D2SetItems.MIN_1] = setItems[it, D2SetItems.MAX_1]
		if (setItems[it, D2SetItems.PROP_2] !in doNotMax) setItems[it, D2SetItems.MIN_2] = setItems[it, D2SetItems.MAX_2]
		if (setItems[it, D2SetItems.PROP_3] !in doNotMax) setItems[it, D2SetItems.MIN_3] = setItems[it, D2SetItems.MAX_3]
		if (setItems[it, D2SetItems.PROP_4] !in doNotMax) setItems[it, D2SetItems.MIN_4] = setItems[it, D2SetItems.MAX_4]
		if (setItems[it, D2SetItems.PROP_5] !in doNotMax) setItems[it, D2SetItems.MIN_5] = setItems[it, D2SetItems.MAX_5]
		if (setItems[it, D2SetItems.PROP_6] !in doNotMax) setItems[it, D2SetItems.MIN_6] = setItems[it, D2SetItems.MAX_6]
		if (setItems[it, D2SetItems.PROP_7] !in doNotMax) setItems[it, D2SetItems.MIN_7] = setItems[it, D2SetItems.MAX_7]
		if (setItems[it, D2SetItems.PROP_8] !in doNotMax) setItems[it, D2SetItems.MIN_8] = setItems[it, D2SetItems.MAX_8]
		if (setItems[it, D2SetItems.PROP_9] !in doNotMax) setItems[it, D2SetItems.MIN_9] = setItems[it, D2SetItems.MAX_9]
		if (setItems[it, D2SetItems.A_PROP_1_A] !in doNotMax) setItems[it, D2SetItems.A_MIN_1_A] = setItems[it, D2SetItems.A_MAX_1_A]
		if (setItems[it, D2SetItems.A_PROP_1_B] !in doNotMax) setItems[it, D2SetItems.A_MIN_1_B] = setItems[it, D2SetItems.A_MAX_1_B]
		if (setItems[it, D2SetItems.A_PROP_2_A] !in doNotMax) setItems[it, D2SetItems.A_MIN_2_A] = setItems[it, D2SetItems.A_MAX_2_A]
		if (setItems[it, D2SetItems.A_PROP_2_B] !in doNotMax) setItems[it, D2SetItems.A_MIN_2_B] = setItems[it, D2SetItems.A_MAX_2_B]
		if (setItems[it, D2SetItems.A_PROP_3_A] !in doNotMax) setItems[it, D2SetItems.A_MIN_3_A] = setItems[it, D2SetItems.A_MAX_3_A]
		if (setItems[it, D2SetItems.A_PROP_3_B] !in doNotMax) setItems[it, D2SetItems.A_MIN_3_B] = setItems[it, D2SetItems.A_MAX_3_B]
		if (setItems[it, D2SetItems.A_PROP_4_A] !in doNotMax) setItems[it, D2SetItems.A_MIN_4_A] = setItems[it, D2SetItems.A_MAX_4_A]
		if (setItems[it, D2SetItems.A_PROP_4_B] !in doNotMax) setItems[it, D2SetItems.A_MIN_4_B] = setItems[it, D2SetItems.A_MAX_4_B]
		if (setItems[it, D2SetItems.A_PROP_5_A] !in doNotMax) setItems[it, D2SetItems.A_MIN_5_A] = setItems[it, D2SetItems.A_MAX_5_A]
		if (setItems[it, D2SetItems.A_PROP_5_B] !in doNotMax) setItems[it, D2SetItems.A_MIN_5_B] = setItems[it, D2SetItems.A_MAX_5_B]
	}
	setItems.save()
	val runes = MANAGER.getSheet(D2Runes.SHEET_NAME)!!
	runes.forEach {
		if (runes[it, D2Runes.T1_CODE_1] !in doNotMax) runes[it, D2Runes.T1_MIN_1] = runes[it, D2Runes.T1_MAX_1]
		if (runes[it, D2Runes.T1_CODE_2] !in doNotMax) runes[it, D2Runes.T1_MIN_2] = runes[it, D2Runes.T1_MAX_2]
		if (runes[it, D2Runes.T1_CODE_3] !in doNotMax) runes[it, D2Runes.T1_MIN_3] = runes[it, D2Runes.T1_MAX_3]
		if (runes[it, D2Runes.T1_CODE_4] !in doNotMax) runes[it, D2Runes.T1_MIN_4] = runes[it, D2Runes.T1_MAX_4]
		if (runes[it, D2Runes.T1_CODE_5] !in doNotMax) runes[it, D2Runes.T1_MIN_5] = runes[it, D2Runes.T1_MAX_5]
		if (runes[it, D2Runes.T1_CODE_6] !in doNotMax) runes[it, D2Runes.T1_MIN_6] = runes[it, D2Runes.T1_MAX_6]
		if (runes[it, D2Runes.T1_CODE_7] !in doNotMax) runes[it, D2Runes.T1_MIN_7] = runes[it, D2Runes.T1_MAX_7]
	}
	runes.save()
	val uniqueItems = MANAGER.getSheet(D2UniqueItems.SHEET_NAME)!!
	uniqueItems.forEach {
		uniqueItems[it, D2UniqueItems.NO_LIMIT] = "1"
		if (uniqueItems[it, D2UniqueItems.PROP_1] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_1] = uniqueItems[it, D2UniqueItems.MAX_1]
		if (uniqueItems[it, D2UniqueItems.PROP_2] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_2] = uniqueItems[it, D2UniqueItems.MAX_2]
		if (uniqueItems[it, D2UniqueItems.PROP_3] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_3] = uniqueItems[it, D2UniqueItems.MAX_3]
		if (uniqueItems[it, D2UniqueItems.PROP_4] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_4] = uniqueItems[it, D2UniqueItems.MAX_4]
		if (uniqueItems[it, D2UniqueItems.PROP_5] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_5] = uniqueItems[it, D2UniqueItems.MAX_5]
		if (uniqueItems[it, D2UniqueItems.PROP_6] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_6] = uniqueItems[it, D2UniqueItems.MAX_6]
		if (uniqueItems[it, D2UniqueItems.PROP_7] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_7] = uniqueItems[it, D2UniqueItems.MAX_7]
		if (uniqueItems[it, D2UniqueItems.PROP_8] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_8] = uniqueItems[it, D2UniqueItems.MAX_8]
		if (uniqueItems[it, D2UniqueItems.PROP_9] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_9] = uniqueItems[it, D2UniqueItems.MAX_9]
		if (uniqueItems[it, D2UniqueItems.PROP_10] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_10] = uniqueItems[it, D2UniqueItems.MAX_10]
		if (uniqueItems[it, D2UniqueItems.PROP_11] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_11] = uniqueItems[it, D2UniqueItems.MAX_11]
		if (uniqueItems[it, D2UniqueItems.PROP_12] !in doNotMax) uniqueItems[it, D2UniqueItems.MIN_12] = uniqueItems[it, D2UniqueItems.MAX_12]
	}
	uniqueItems.save()
}

fun <T> List<T>.similarity(other: List<T>): Float {
	var matches = 0
	for (i in 0 until minOf(this.size, other.size)) {
		if (this[i] == other[i]) {
			matches++
		}
	}
	return matches.toFloat() / minOf(this.size, other.size)
}

/*fun String.wordSimilarity(other: String): Float {
	return if (this.count { it == ' ' } > 4 && other.count { it == ' ' } > 4) {
		val currList = this.split(' ')
		val otherList = other.split(' ').toMutableList()
		val otherWords = otherList.size
		var matches = 0
		currList.forEach {
			if (it in otherList) {
				otherList.remove(it)
				matches++
			}
		}
		(matches * 2).toFloat() / (currList.size + otherWords)
	} else 0F
}*/
