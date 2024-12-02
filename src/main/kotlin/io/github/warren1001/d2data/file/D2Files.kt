package io.github.warren1001.d2data.file

import io.github.warren1001.d2data.enums.sheet.*
import io.github.warren1001.d2data.forEachFileDeep
import io.github.warren1001.d2data.sheet.ListConverter
import io.github.warren1001.d2data.util.SetDifference
import java.io.File

class D2Files(val dir: File, val listConverter: ListConverter = object : ListConverter {
	override fun <E> convert(list: List<E>): MutableList<E> = list.toMutableList()
}) {
	
	private val sheets: MutableMap<String, D2Sheet> = mutableMapOf()
	private val sheetInfos: MutableMap<String, D2SheetInfo> = mutableMapOf()
	
	private val jsons: MutableMap<String, D2Json> = mutableMapOf()
	private val langs: MutableMap<String, D2Lang> = mutableMapOf()
	
	fun getSheet(relativePath: String) = sheets[relativePath.lowercase()]
	
	fun loadSheet(relativePath: String): D2Sheet {
		val file = File(dir, relativePath)
		val pathLowercase = relativePath.lowercase()
		require(file.exists()) { "File $file does not exist" }
		require(file.isFile) { "File $file is not a file" }
		require(file.extension == "txt") { "File $file is not a TXT file" }
		require(sheetInfos.contains(pathLowercase)) { "Missing sheet info for file $file" }
		return sheets.computeIfAbsent(pathLowercase) { D2Sheet(this, file, sheetInfos[it]!!, listConverter) }
	}
	
	private fun loadSheet(file: File): D2Sheet? {
		require(file.exists()) { "File $file does not exist" }
		require(file.isFile) { "File $file is not a file" }
		require(file.extension == "txt") { "File $file is not a TXT file" }
		val key = file.relativeTo(dir).path.lowercase()
		return if (sheetInfos.contains(key)) {
			sheets.computeIfAbsent(key) { D2Sheet(this, file, sheetInfos[it]!!, listConverter) }
		} else {
			null
		}
	}
	
	fun loadAllSheets() {
		dir.forEachFileDeep { if (it.extension == "txt") loadSheet(it) }
		
	}
	
	fun getJson(relativePath: String) = jsons[relativePath.lowercase()]
	
	fun loadJson(relativePath: String): D2Json {
		val file = File(dir, relativePath)
		require(file.exists()) { "File $file does not exist" }
		require(file.isFile) { "File $file is not a file" }
		require(file.extension == "json") { "File $file is not a JSON file" }
		return jsons.computeIfAbsent(relativePath.lowercase()) { D2Json(file) }
	}
	
	private fun loadJson(file: File): D2Json {
		require(file.exists()) { "File $file does not exist" }
		require(file.isFile) { "File $file is not a file" }
		require(file.extension == "json") { "File $file is not a JSON file" }
		return jsons.computeIfAbsent(file.relativeTo(dir).path.lowercase()) { D2Json(file) }
	}
	
	fun getLang(relativePath: String) = langs[relativePath.lowercase()]
	
	fun loadLang(relativePath: String): D2Lang {
		val file = File(dir, relativePath)
		require(file.exists()) { "File $file does not exist" }
		require(file.isFile) { "File $file is not a file" }
		require(file.extension == "json") { "File $file is not a JSON file" }
		return langs.computeIfAbsent(relativePath.lowercase()) { D2Lang(file) }
	}
	
	private fun loadLang(file: File): D2Lang {
		require(file.exists()) { "File $file does not exist" }
		require(file.isFile) { "File $file is not a file" }
		require(file.extension == "json") { "File $file is not a JSON file" }
		return langs.computeIfAbsent(file.relativeTo(dir).path.lowercase()) { D2Lang(file) }
	}
	
	fun loadAllAsLang(relativePath: String): D2LangMaster {
		val file = File(dir, relativePath)
		require(file.exists()) { "File $file does not exist" }
		require(file.isDirectory) { "File $file is not a directory" }
		return D2LangMaster(file.listFiles { subFile, fileName -> fileName.endsWith(".json") }!!.map { subFile -> loadLang(subFile) })
	}
	
	fun saveAllSheets() = sheets.values.forEach { it.save() }
	
	fun saveAllJsons() = jsons.values.forEach { it.save() }
	
	fun saveAll() {
		saveAllSheets()
		saveAllJsons()
	}
	
	fun compareToNew(newSheets: D2Files) {
		val difference = SetDifference(sheets.keys, newSheets.sheets.keys)
		//println(sheets.keys.joinToString(", "))
		//println(newSheets.sheets.keys.joinToString(", "))
		difference.secondOnly.forEach { println("New sheet: $it") }
		difference.firstOnly.forEach { println("Missing sheet: $it") }
		difference.shared.forEach { sheets[it]!!.compare(newSheets.sheets[it]!!) }
	}
	
	fun verify(): Boolean {
		var valid = true
		for (sheet in sheets) {
			val name = sheet.key
			val columnDiff = sheet.value.getColumnDifference()
			if (!columnDiff.hasNoDifference()) {
				valid = false
				if (columnDiff.firstOnly.isNotEmpty()) {
					println("Sheet $name had extra columns: ${columnDiff.firstOnly.joinToString()}")
				}
				if (columnDiff.secondOnly.isNotEmpty()) {
					println("Sheet $name is missing columns: ${columnDiff.secondOnly.joinToString()}")
				}
			}
		}
		return valid
	}
	
	init {
		sheetInfos[D2ActInfo.FILE_PATH] = D2ActInfo.INFO
		sheetInfos[D2AnimData.FILE_PATH] = D2AnimData.INFO
		sheetInfos[D2Armor.FILE_PATH] = D2Armor.INFO
		sheetInfos[D2ArmType.FILE_PATH] = D2ArmType.INFO
		sheetInfos[D2AutoMagic.FILE_PATH] = D2AutoMagic.INFO
		sheetInfos[D2AutoMap.FILE_PATH] = D2AutoMap.INFO
		sheetInfos[D2Belts.FILE_PATH] = D2Belts.INFO
		sheetInfos[D2BodyLocs.FILE_PATH] = D2BodyLocs.INFO
		sheetInfos[D2Books.FILE_PATH] = D2Books.INFO
		sheetInfos[D2CharStats.FILE_PATH] = D2CharStats.INFO
		sheetInfos[D2Colors.FILE_PATH] = D2Colors.INFO
		sheetInfos[D2CompCode.FILE_PATH] = D2CompCode.INFO
		sheetInfos[D2Composit.FILE_PATH] = D2Composit.INFO
		sheetInfos[D2CubeMain.FILE_PATH] = D2CubeMain.INFO
		sheetInfos[D2CubeMod.FILE_PATH] = D2CubeMod.INFO
		sheetInfos[D2DifficultyLevels.FILE_PATH] = D2DifficultyLevels.INFO
		sheetInfos[D2ElemTypes.FILE_PATH] = D2ElemTypes.INFO
		sheetInfos[D2Events.FILE_PATH] = D2Events.INFO
		sheetInfos[D2Experience.FILE_PATH] = D2Experience.INFO
		sheetInfos[D2Gamble.FILE_PATH] = D2Gamble.INFO
		sheetInfos[D2Gems.FILE_PATH] = D2Gems.INFO
		sheetInfos[D2Hireling.FILE_PATH] = D2Hireling.INFO
		sheetInfos[D2HirelingDesc.FILE_PATH] = D2HirelingDesc.INFO
		sheetInfos[D2HitClass.FILE_PATH] = D2HitClass.INFO
		sheetInfos[D2Inventory.FILE_PATH] = D2Inventory.INFO
		sheetInfos[D2ItemRatio.FILE_PATH] = D2ItemRatio.INFO
		sheetInfos[D2ItemStatCost.FILE_PATH] = D2ItemStatCost.INFO
		sheetInfos[D2ItemTypes.FILE_PATH] = D2ItemTypes.INFO
		sheetInfos[D2LevelGroups.FILE_PATH] = D2LevelGroups.INFO
		sheetInfos[D2Levels.FILE_PATH] = D2Levels.INFO
		sheetInfos[D2LowQualityItems.FILE_PATH] = D2LowQualityItems.INFO
		sheetInfos[D2LvlMaze.FILE_PATH] = D2LvlMaze.INFO
		sheetInfos[D2LvlPrest.FILE_PATH] = D2LvlPrest.INFO
		sheetInfos[D2LvlSub.FILE_PATH] = D2LvlSub.INFO
		sheetInfos[D2LvlTypes.FILE_PATH] = D2LvlTypes.INFO
		sheetInfos[D2LvlWarp.FILE_PATH] = D2LvlWarp.INFO
		sheetInfos[D2MagicPrefix.FILE_PATH] = D2MagicPrefix.INFO
		sheetInfos[D2MagicSuffix.FILE_PATH] = D2MagicSuffix.INFO
		sheetInfos[D2Misc.FILE_PATH] = D2Misc.INFO
		sheetInfos[D2MissCalc.FILE_PATH] = D2MissCalc.INFO
		sheetInfos[D2Missiles.FILE_PATH] = D2Missiles.INFO
		sheetInfos[D2MonAI.FILE_PATH] = D2MonAI.INFO
		sheetInfos[D2MonEquip.FILE_PATH] = D2MonEquip.INFO
		sheetInfos[D2MonLvl.FILE_PATH] = D2MonLvl.INFO
		sheetInfos[D2MonMode.FILE_PATH] = D2MonMode.INFO
		sheetInfos[D2MonPlace.FILE_PATH] = D2MonPlace.INFO
		sheetInfos[D2MonPreset.FILE_PATH] = D2MonPreset.INFO
		sheetInfos[D2MonProp.FILE_PATH] = D2MonProp.INFO
		sheetInfos[D2MonSeq.FILE_PATH] = D2MonSeq.INFO
		sheetInfos[D2MonSounds.FILE_PATH] = D2MonSounds.INFO
		sheetInfos[D2MonStats.FILE_PATH] = D2MonStats.INFO
		sheetInfos[D2MonStats2.FILE_PATH] = D2MonStats2.INFO
		sheetInfos[D2MonType.FILE_PATH] = D2MonType.INFO
		sheetInfos[D2MonUMod.FILE_PATH] = D2MonUMod.INFO
		sheetInfos[D2NPC.FILE_PATH] = D2NPC.INFO
		sheetInfos[D2Objects.FILE_PATH] = D2Objects.INFO
		sheetInfos[D2ObjGroup.FILE_PATH] = D2ObjGroup.INFO
		sheetInfos[D2ObjMode.FILE_PATH] = D2ObjMode.INFO
		sheetInfos[D2ObjPreset.FILE_PATH] = D2ObjPreset.INFO
		sheetInfos[D2ObjType.FILE_PATH] = D2ObjType.INFO
		sheetInfos[D2Overlay.FILE_PATH] = D2Overlay.INFO
		sheetInfos[D2PetType.FILE_PATH] = D2PetType.INFO
		sheetInfos[D2PlayerClass.FILE_PATH] = D2PlayerClass.INFO
		sheetInfos[D2PlrMode.FILE_PATH] = D2PlrMode.INFO
		sheetInfos[D2PlrType.FILE_PATH] = D2PlrType.INFO
		sheetInfos[D2Properties.FILE_PATH] = D2Properties.INFO
		sheetInfos[D2QualityItems.FILE_PATH] = D2QualityItems.INFO
		sheetInfos[D2RarePrefix.FILE_PATH] = D2RarePrefix.INFO
		sheetInfos[D2RareSuffix.FILE_PATH] = D2RareSuffix.INFO
		sheetInfos[D2Runes.FILE_PATH] = D2Runes.INFO
		sheetInfos[D2SetItems.FILE_PATH] = D2SetItems.INFO
		sheetInfos[D2Sets.FILE_PATH] = D2Sets.INFO
		sheetInfos[D2Shrines.FILE_PATH] = D2Shrines.INFO
		sheetInfos[D2SkillCalc.FILE_PATH] = D2SkillCalc.INFO
		sheetInfos[D2SkillDesc.FILE_PATH] = D2SkillDesc.INFO
		sheetInfos[D2Skills.FILE_PATH] = D2Skills.INFO
		sheetInfos[D2SoundEnviron.FILE_PATH] = D2SoundEnviron.INFO
		sheetInfos[D2Sounds.FILE_PATH] = D2Sounds.INFO
		sheetInfos[D2States.FILE_PATH] = D2States.INFO
		sheetInfos[D2StorePage.FILE_PATH] = D2StorePage.INFO
		sheetInfos[D2SuperUniques.FILE_PATH] = D2SuperUniques.INFO
		sheetInfos[D2TreasureClassEx.FILE_PATH] = D2TreasureClassEx.INFO
		sheetInfos[D2UniqueAppellation.FILE_PATH] = D2UniqueAppellation.INFO
		sheetInfos[D2UniqueItems.FILE_PATH] = D2UniqueItems.INFO
		sheetInfos[D2UniquePrefix.FILE_PATH] = D2UniquePrefix.INFO
		sheetInfos[D2UniqueSuffix.FILE_PATH] = D2UniqueSuffix.INFO
		sheetInfos[D2WanderingMon.FILE_PATH] = D2WanderingMon.INFO
		sheetInfos[D2Weapons.FILE_PATH] = D2Weapons.INFO
	}
	
}