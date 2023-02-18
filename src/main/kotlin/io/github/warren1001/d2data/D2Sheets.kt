package io.github.warren1001.d2data

import io.github.warren1001.d2data.enums.*
import io.github.warren1001.d2data.utils.ListConverter
import io.github.warren1001.d2data.utils.SetDifference
import java.io.File


class D2Sheets(val dir: File, val listConverter: ListConverter = object : ListConverter {
	override fun <E> convert(list: List<E>): MutableList<E> = list.toMutableList()
}) {
	
	private val sheets: MutableMap<String, D2Sheet> = mutableMapOf()
	private val sheetInfos: MutableMap<String, D2SheetInfo> = mutableMapOf()
	
	fun getSheet(name: String) = sheets[name.lowercase().substringBefore('.')]
	
	fun loadSheet(name: String) = sheets.computeIfAbsent(name.lowercase().substringBefore('.')) { D2Sheet(this, File(dir, "${name.substringBefore('.')}.txt"), sheetInfos[it]!!, listConverter) }
	
	fun loadAll() = dir.list { _, name -> name.endsWith(".txt") }?.forEach { loadSheet(it) }
	
	fun compareToNew(newSheets: D2Sheets) {
		val difference = SetDifference(sheets.keys, newSheets.sheets.keys)
		difference.secondOnly.forEach { println("New sheet: $it") }
		difference.firstOnly.forEach { println("Missing sheet: $it") }
		difference.shared.forEach { sheets[it]!!.compare(newSheets.sheets[it]!!) }
	}
	
	fun verify() = sheets.all { it.value.verify() }
	
	init {
		sheetInfos[D2ActInfo.SHEET_NAME] = D2ActInfo.INFO
		sheetInfos[D2Armor.SHEET_NAME] = D2Armor.INFO
		sheetInfos[D2ArmType.SHEET_NAME] = D2ArmType.INFO
		sheetInfos[D2AutoMagic.SHEET_NAME] = D2AutoMagic.INFO
		sheetInfos[D2AutoMap.SHEET_NAME] = D2AutoMap.INFO
		sheetInfos[D2Belts.SHEET_NAME] = D2Belts.INFO
		sheetInfos[D2BodyLocs.SHEET_NAME] = D2BodyLocs.INFO
		sheetInfos[D2Books.SHEET_NAME] = D2Books.INFO
		sheetInfos[D2CharStats.SHEET_NAME] = D2CharStats.INFO
		sheetInfos[D2Colors.SHEET_NAME] = D2Colors.INFO
		sheetInfos[D2CompCode.SHEET_NAME] = D2CompCode.INFO
		sheetInfos[D2Composit.SHEET_NAME] = D2Composit.INFO
		sheetInfos[D2CubeMain.SHEET_NAME] = D2CubeMain.INFO
		sheetInfos[D2CubeMod.SHEET_NAME] = D2CubeMod.INFO
		sheetInfos[D2DifficultyLevels.SHEET_NAME] = D2DifficultyLevels.INFO
		sheetInfos[D2ElemTypes.SHEET_NAME] = D2ElemTypes.INFO
		sheetInfos[D2Events.SHEET_NAME] = D2Events.INFO
		sheetInfos[D2Experience.SHEET_NAME] = D2Experience.INFO
		sheetInfos[D2Gamble.SHEET_NAME] = D2Gamble.INFO
		sheetInfos[D2Gems.SHEET_NAME] = D2Gems.INFO
		sheetInfos[D2Hireling.SHEET_NAME] = D2Hireling.INFO
		sheetInfos[D2HirelingDesc.SHEET_NAME] = D2HirelingDesc.INFO
		sheetInfos[D2HitClass.SHEET_NAME] = D2HitClass.INFO
		sheetInfos[D2Inventory.SHEET_NAME] = D2Inventory.INFO
		sheetInfos[D2ItemRatio.SHEET_NAME] = D2ItemRatio.INFO
		sheetInfos[D2ItemStatCost.SHEET_NAME] = D2ItemStatCost.INFO
		sheetInfos[D2ItemTypes.SHEET_NAME] = D2ItemTypes.INFO
		sheetInfos[D2LevelGroups.SHEET_NAME] = D2LevelGroups.INFO
		sheetInfos[D2Levels.SHEET_NAME] = D2Levels.INFO
		sheetInfos[D2LowQualityItems.SHEET_NAME] = D2LowQualityItems.INFO
		sheetInfos[D2LvlMaze.SHEET_NAME] = D2LvlMaze.INFO
		sheetInfos[D2LvlPrest.SHEET_NAME] = D2LvlPrest.INFO
		sheetInfos[D2LvlSub.SHEET_NAME] = D2LvlSub.INFO
		sheetInfos[D2LvlTypes.SHEET_NAME] = D2LvlTypes.INFO
		sheetInfos[D2LvlWarp.SHEET_NAME] = D2LvlWarp.INFO
		sheetInfos[D2MagicPrefix.SHEET_NAME] = D2MagicPrefix.INFO
		sheetInfos[D2MagicSuffix.SHEET_NAME] = D2MagicSuffix.INFO
		sheetInfos[D2Misc.SHEET_NAME] = D2Misc.INFO
		sheetInfos[D2MissCalc.SHEET_NAME] = D2MissCalc.INFO
		sheetInfos[D2Missiles.SHEET_NAME] = D2Missiles.INFO
		sheetInfos[D2MonAI.SHEET_NAME] = D2MonAI.INFO
		sheetInfos[D2MonEquip.SHEET_NAME] = D2MonEquip.INFO
		sheetInfos[D2MonLvl.SHEET_NAME] = D2MonLvl.INFO
		sheetInfos[D2MonMode.SHEET_NAME] = D2MonMode.INFO
		sheetInfos[D2MonPlace.SHEET_NAME] = D2MonPlace.INFO
		sheetInfos[D2MonPreset.SHEET_NAME] = D2MonPreset.INFO
		sheetInfos[D2MonProp.SHEET_NAME] = D2MonProp.INFO
		sheetInfos[D2MonSeq.SHEET_NAME] = D2MonSeq.INFO
		sheetInfos[D2MonSounds.SHEET_NAME] = D2MonSounds.INFO
		sheetInfos[D2MonStats.SHEET_NAME] = D2MonStats.INFO
		sheetInfos[D2MonStats2.SHEET_NAME] = D2MonStats2.INFO
		sheetInfos[D2MonType.SHEET_NAME] = D2MonType.INFO
		sheetInfos[D2MonUMod.SHEET_NAME] = D2MonUMod.INFO
		sheetInfos[D2NPC.SHEET_NAME] = D2NPC.INFO
		sheetInfos[D2Objects.SHEET_NAME] = D2Objects.INFO
		sheetInfos[D2ObjGroup.SHEET_NAME] = D2ObjGroup.INFO
		sheetInfos[D2ObjMode.SHEET_NAME] = D2ObjMode.INFO
		sheetInfos[D2ObjPreset.SHEET_NAME] = D2ObjPreset.INFO
		sheetInfos[D2ObjType.SHEET_NAME] = D2ObjType.INFO
		sheetInfos[D2Overlay.SHEET_NAME] = D2Overlay.INFO
		sheetInfos[D2PetType.SHEET_NAME] = D2PetType.INFO
		sheetInfos[D2PlayerClass.SHEET_NAME] = D2PlayerClass.INFO
		sheetInfos[D2PlrMode.SHEET_NAME] = D2PlrMode.INFO
		sheetInfos[D2PlrType.SHEET_NAME] = D2PlrType.INFO
		sheetInfos[D2Properties.SHEET_NAME] = D2Properties.INFO
		sheetInfos[D2QualityItems.SHEET_NAME] = D2QualityItems.INFO
		sheetInfos[D2RarePrefix.SHEET_NAME] = D2RarePrefix.INFO
		sheetInfos[D2RareSuffix.SHEET_NAME] = D2RareSuffix.INFO
		sheetInfos[D2Runes.SHEET_NAME] = D2Runes.INFO
		sheetInfos[D2SetItems.SHEET_NAME] = D2SetItems.INFO
		sheetInfos[D2Sets.SHEET_NAME] = D2Sets.INFO
		sheetInfos[D2Shrines.SHEET_NAME] = D2Shrines.INFO
		sheetInfos[D2SkillCalc.SHEET_NAME] = D2SkillCalc.INFO
		sheetInfos[D2SkillDesc.SHEET_NAME] = D2SkillDesc.INFO
		sheetInfos[D2Skills.SHEET_NAME] = D2Skills.INFO
		sheetInfos[D2SoundEnviron.SHEET_NAME] = D2SoundEnviron.INFO
		sheetInfos[D2Sounds.SHEET_NAME] = D2Sounds.INFO
		sheetInfos[D2States.SHEET_NAME] = D2States.INFO
		sheetInfos[D2StorePage.SHEET_NAME] = D2StorePage.INFO
		sheetInfos[D2SuperUniques.SHEET_NAME] = D2SuperUniques.INFO
		sheetInfos[D2TreasureClassEx.SHEET_NAME] = D2TreasureClassEx.INFO
		sheetInfos[D2UniqueAppellation.SHEET_NAME] = D2UniqueAppellation.INFO
		sheetInfos[D2UniqueItems.SHEET_NAME] = D2UniqueItems.INFO
		sheetInfos[D2UniquePrefix.SHEET_NAME] = D2UniquePrefix.INFO
		sheetInfos[D2UniqueSuffix.SHEET_NAME] = D2UniqueSuffix.INFO
		sheetInfos[D2WanderingMon.SHEET_NAME] = D2WanderingMon.INFO
		sheetInfos[D2Weapons.SHEET_NAME] = D2Weapons.INFO
	}
	
}