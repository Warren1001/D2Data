package io.github.warren1001.d2data

import io.github.warren1001.d2data.enums.*
import io.github.warren1001.d2data.utils.SetDifference
import java.io.File


class D2Sheets(private val dir: File) {
	
	private val sheets: MutableMap<String, D2Sheet> = mutableMapOf()
	private val sheetHeaders: MutableMap<String, List<String>> = mutableMapOf()
	
	fun getSheet(name: String) = sheets[name.lowercase().substringBefore('.')]
	
	fun loadSheet(name: String) = sheets.computeIfAbsent(name.lowercase().substringBefore('.')) { D2Sheet(this, File(dir, "${name.substringBefore('.')}.txt"), sheetHeaders[it] ?: emptyList()) }
	
	fun loadAll() = dir.list { _, name -> name.endsWith(".txt") }?.forEach { loadSheet(it) }
	
	fun compareToNew(newSheets: D2Sheets) {
		val difference = SetDifference(sheets.keys, newSheets.sheets.keys)
		difference.secondOnly.forEach { println("New sheet: $it") }
		difference.firstOnly.forEach { println("Missing sheet: $it") }
		difference.shared.forEach { sheets[it]!!.compare(newSheets.sheets[it]!!) }
	}
	
	fun verify() = sheets.all { it.value.verify() }
	
	init {
		sheetHeaders[D2ActInfo.SHEET_NAME] = D2ActInfo.HEADERS
		sheetHeaders[D2Armor.SHEET_NAME] = D2Armor.HEADERS
		sheetHeaders[D2ArmType.SHEET_NAME] = D2ArmType.HEADERS
		sheetHeaders[D2AutoMagic.SHEET_NAME] = D2AutoMagic.HEADERS
		sheetHeaders[D2AutoMap.SHEET_NAME] = D2AutoMap.HEADERS
		sheetHeaders[D2Belts.SHEET_NAME] = D2Belts.HEADERS
		sheetHeaders[D2BodyLocs.SHEET_NAME] = D2BodyLocs.HEADERS
		sheetHeaders[D2Books.SHEET_NAME] = D2Books.HEADERS
		sheetHeaders[D2CharStats.SHEET_NAME] = D2CharStats.HEADERS
		sheetHeaders[D2Colors.SHEET_NAME] = D2Colors.HEADERS
		sheetHeaders[D2CompCode.SHEET_NAME] = D2CompCode.HEADERS
		sheetHeaders[D2Composit.SHEET_NAME] = D2Composit.HEADERS
		sheetHeaders[D2CubeMain.SHEET_NAME] = D2CubeMain.HEADERS
		sheetHeaders[D2CubeMod.SHEET_NAME] = D2CubeMod.HEADERS
		sheetHeaders[D2DifficultyLevels.SHEET_NAME] = D2DifficultyLevels.HEADERS
		sheetHeaders[D2ElemTypes.SHEET_NAME] = D2ElemTypes.HEADERS
		sheetHeaders[D2Events.SHEET_NAME] = D2Events.HEADERS
		sheetHeaders[D2Experience.SHEET_NAME] = D2Experience.HEADERS
		sheetHeaders[D2Gamble.SHEET_NAME] = D2Gamble.HEADERS
		sheetHeaders[D2Gems.SHEET_NAME] = D2Gems.HEADERS
		sheetHeaders[D2Hireling.SHEET_NAME] = D2Hireling.HEADERS
		sheetHeaders[D2HirelingDesc.SHEET_NAME] = D2HirelingDesc.HEADERS
		sheetHeaders[D2HitClass.SHEET_NAME] = D2HitClass.HEADERS
		sheetHeaders[D2Inventory.SHEET_NAME] = D2Inventory.HEADERS
		sheetHeaders[D2ItemRatio.SHEET_NAME] = D2ItemRatio.HEADERS
		sheetHeaders[D2ItemStatCost.SHEET_NAME] = D2ItemStatCost.HEADERS
		sheetHeaders[D2ItemTypes.SHEET_NAME] = D2ItemTypes.HEADERS
		sheetHeaders[D2LevelGroups.SHEET_NAME] = D2LevelGroups.HEADERS
		sheetHeaders[D2Levels.SHEET_NAME] = D2Levels.HEADERS
		sheetHeaders[D2LowQualityItems.SHEET_NAME] = D2LowQualityItems.HEADERS
		sheetHeaders[D2LvlMaze.SHEET_NAME] = D2LvlMaze.HEADERS
		sheetHeaders[D2LvlPrest.SHEET_NAME] = D2LvlPrest.HEADERS
		sheetHeaders[D2LvlSub.SHEET_NAME] = D2LvlSub.HEADERS
		sheetHeaders[D2LvlTypes.SHEET_NAME] = D2LvlTypes.HEADERS
		sheetHeaders[D2LvlWarp.SHEET_NAME] = D2LvlWarp.HEADERS
		sheetHeaders[D2MagicPrefix.SHEET_NAME] = D2MagicPrefix.HEADERS
		sheetHeaders[D2MagicSuffix.SHEET_NAME] = D2MagicSuffix.HEADERS
		sheetHeaders[D2Misc.SHEET_NAME] = D2Misc.HEADERS
		sheetHeaders[D2MissCalc.SHEET_NAME] = D2MissCalc.HEADERS
		sheetHeaders[D2Missiles.SHEET_NAME] = D2Missiles.HEADERS
		sheetHeaders[D2MonAI.SHEET_NAME] = D2MonAI.HEADERS
		sheetHeaders[D2MonEquip.SHEET_NAME] = D2MonEquip.HEADERS
		sheetHeaders[D2MonLvl.SHEET_NAME] = D2MonLvl.HEADERS
		sheetHeaders[D2MonMode.SHEET_NAME] = D2MonMode.HEADERS
		sheetHeaders[D2MonPlace.SHEET_NAME] = D2MonPlace.HEADERS
		sheetHeaders[D2MonPreset.SHEET_NAME] = D2MonPreset.HEADERS
		sheetHeaders[D2MonProp.SHEET_NAME] = D2MonProp.HEADERS
		sheetHeaders[D2MonSeq.SHEET_NAME] = D2MonSeq.HEADERS
		sheetHeaders[D2MonSounds.SHEET_NAME] = D2MonSounds.HEADERS
		sheetHeaders[D2MonStats.SHEET_NAME] = D2MonStats.HEADERS
		sheetHeaders[D2MonStats2.SHEET_NAME] = D2MonStats2.HEADERS
		sheetHeaders[D2MonType.SHEET_NAME] = D2MonType.HEADERS
		sheetHeaders[D2MonUMod.SHEET_NAME] = D2MonUMod.HEADERS
		sheetHeaders[D2NPC.SHEET_NAME] = D2NPC.HEADERS
		sheetHeaders[D2Objects.SHEET_NAME] = D2Objects.HEADERS
		sheetHeaders[D2ObjGroup.SHEET_NAME] = D2ObjGroup.HEADERS
		sheetHeaders[D2ObjMode.SHEET_NAME] = D2ObjMode.HEADERS
		sheetHeaders[D2ObjPreset.SHEET_NAME] = D2ObjPreset.HEADERS
		sheetHeaders[D2ObjType.SHEET_NAME] = D2ObjType.HEADERS
		sheetHeaders[D2Overlay.SHEET_NAME] = D2Overlay.HEADERS
		sheetHeaders[D2PetType.SHEET_NAME] = D2PetType.HEADERS
		sheetHeaders[D2PlayerClass.SHEET_NAME] = D2PlayerClass.HEADERS
		sheetHeaders[D2PlrMode.SHEET_NAME] = D2PlrMode.HEADERS
		sheetHeaders[D2PlrType.SHEET_NAME] = D2PlrType.HEADERS
		sheetHeaders[D2Properties.SHEET_NAME] = D2Properties.HEADERS
		sheetHeaders[D2QualityItems.SHEET_NAME] = D2QualityItems.HEADERS
		sheetHeaders[D2RarePrefix.SHEET_NAME] = D2RarePrefix.HEADERS
		sheetHeaders[D2RareSuffix.SHEET_NAME] = D2RareSuffix.HEADERS
		sheetHeaders[D2Runes.SHEET_NAME] = D2Runes.HEADERS
		sheetHeaders[D2SetItems.SHEET_NAME] = D2SetItems.HEADERS
		sheetHeaders[D2Sets.SHEET_NAME] = D2Sets.HEADERS
		sheetHeaders[D2Shrines.SHEET_NAME] = D2Shrines.HEADERS
		sheetHeaders[D2SkillCalc.SHEET_NAME] = D2SkillCalc.HEADERS
		sheetHeaders[D2SkillDesc.SHEET_NAME] = D2SkillDesc.HEADERS
		sheetHeaders[D2Skills.SHEET_NAME] = D2Skills.HEADERS
		sheetHeaders[D2SoundEnviron.SHEET_NAME] = D2SoundEnviron.HEADERS
		sheetHeaders[D2Sounds.SHEET_NAME] = D2Sounds.HEADERS
		sheetHeaders[D2States.SHEET_NAME] = D2States.HEADERS
		sheetHeaders[D2StorePage.SHEET_NAME] = D2StorePage.HEADERS
		sheetHeaders[D2SuperUniques.SHEET_NAME] = D2SuperUniques.HEADERS
		sheetHeaders[D2TreasureClassEx.SHEET_NAME] = D2TreasureClassEx.HEADERS
		sheetHeaders[D2UniqueAppellation.SHEET_NAME] = D2UniqueAppellation.HEADERS
		sheetHeaders[D2UniqueItems.SHEET_NAME] = D2UniqueItems.HEADERS
		sheetHeaders[D2UniquePrefix.SHEET_NAME] = D2UniquePrefix.HEADERS
		sheetHeaders[D2UniqueSuffix.SHEET_NAME] = D2UniqueSuffix.HEADERS
		sheetHeaders[D2WanderingMon.SHEET_NAME] = D2WanderingMon.HEADERS
		sheetHeaders[D2Weapons.SHEET_NAME] = D2Weapons.HEADERS
	}
	
}