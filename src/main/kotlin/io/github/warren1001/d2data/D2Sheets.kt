package io.github.warren1001.d2data

import io.github.warren1001.d2data.impl.*
import java.io.File


class D2Sheets(private val dir: File) {
	
	val ARMOR = D2Armor(this, dir)
	val ARM_TYPE = D2ArmType(this, dir)
	val AUTO_MAGIC = D2AutoMagic(this, dir)
	val AUTOMAP = D2AutoMap(this, dir)
	val BELTS = D2Belts(this, dir)
	val BODY_LOCS = D2BodyLocs(this, dir)
	val BOOKS = D2Books(this, dir)
	val CHAR_STATS = D2CharStats(this, dir)
	val COLORS = D2Colors(this, dir)
	val COMP_CODE = D2CompCode(this, dir)
	val COMPOSIT = D2Composit(this, dir)
	val CUBE_MAIN = D2CubeMain(this, dir)
	val CUBE_MOD = D2CubeMod(this, dir)
	val DIFFICULTY_LEVELS = D2DifficultyLevels(this, dir)
	val ELEM_TYPES = D2ElemTypes(this, dir)
	val EVENTS = D2Events(this, dir)
	val EXPERIENCE = D2Experience(this, dir)
	val GAMBLE = D2Gamble(this, dir)
	val GEMS = D2Gems(this, dir)
	val HIRELING = D2Hireling(this, dir)
	val HIRELING_DESC = D2HirelingDesc(this, dir)
	val HIT_CLASS = D2HitClass(this, dir)
	val INVENTORY = D2Inventory(this, dir)
	val ITEM_RATIO = D2ItemRatio(this, dir)
	val ITEM_STAT_COST = D2ItemStatCost(this, dir)
	val ITEM_TYPES = D2ItemTypes(this, dir)
	val LEVEL_GROUPS = D2LevelGroups(this, dir)
	val LEVELS = D2Levels(this, dir)
	val LOW_QUALITY_ITEMS = D2LowQualityItems(this, dir)
	val LVL_MAZE = D2LvlMaze(this, dir)
	val LVL_PREST = D2LvlPrest(this, dir)
	val LVL_SUB = D2LvlSub(this, dir)
	val LVL_TYPES = D2LvlTypes(this, dir)
	val LVL_WARP = D2LvlWarp(this, dir)
	val MAGIC_PREFIX = D2MagicPrefix(this, dir)
	val MAGIC_SUFFIX = D2MagicSuffix(this, dir)
	val MISC = D2Misc(this, dir)
	val MISS_CALC = D2MissCalc(this, dir)
	val MISSILES = D2Missiles(this, dir)
	val MON_AI = D2MonAI(this, dir)
	val MON_EQUIP = D2MonEquip(this, dir)
	val MON_LVL = D2MonLvl(this, dir)
	val MON_MODE = D2MonMode(this, dir)
	val MON_PLACE = D2MonPlace(this, dir)
	val MON_PRESET = D2MonPreset(this, dir)
	val MON_PROP = D2MonProp(this, dir)
	val MON_SEQ = D2MonSeq(this, dir)
	val MON_SOUNDS = D2MonSounds(this, dir)
	val MON_STATS = D2MonStats(this, dir)
	val MON_STATS2 = D2MonStats2(this, dir)
	val MON_TYPE = D2MonType(this, dir)
	val MON_U_MOD = D2MonUMod(this, dir)
	val NPC = D2NPC(this, dir)
	val OBJECTS = D2Objects(this, dir)
	val OBJ_GROUP = D2ObjGroup(this, dir)
	val OBJ_MODE = D2ObjMode(this, dir)
	val OBJ_PRESET = D2ObjPreset(this, dir)
	val OBJ_TYPE = D2ObjType(this, dir)
	val OVERLAY = D2Overlay(this, dir)
	val PET_TYPE = D2PetType(this, dir)
	val PLAYER_CLASS = D2PlayerClass(this, dir)
	val PLR_MODE = D2PlrMode(this, dir)
	val PLR_TYPE = D2PlrType(this, dir)
	val QUALITY_ITEMS = D2QualityItems(this, dir)
	val RARE_PREFIX = D2RarePrefix(this, dir)
	val RARE_SUFFIX = D2RareSuffix(this, dir)
	val RUNES = D2Runes(this, dir)
	val SET_ITEMS = D2SetItems(this, dir)
	val SETS = D2Sets(this, dir)
	val SHRINES = D2Shrines(this, dir)
	val SKILL_CALC = D2SkillCalc(this, dir)
	val SKILL_DESC = D2SkillDesc(this, dir)
	val SKILLS = D2Skills(this, dir)
	val SOUND_ENVIRON = D2SoundEnviron(this, dir)
	val SOUNDS = D2Sounds(this, dir)
	val STATES = D2States(this, dir)
	val STORE_PAGE = D2StorePage(this, dir)
	val SUPER_UNIQUES = D2SuperUniques(this, dir)
	val TREASURE_CLASS_EX = D2TreasureClassEx(this, dir)
	val UNIQUE_APPELLATION = D2UniqueAppellation(this, dir)
	val UNIQUE_ITEMS = D2UniqueItems(this, dir)
	val UNIQUE_PREFIX = D2UniquePrefix(this, dir)
	val UNIQUE_SUFFIX = D2UniqueSuffix(this, dir)
	val WANDERING_MON = D2WanderingMon(this, dir)
	val WEAPONS = D2Weapons(this, dir)
	
	private val sheets = listOf(ARMOR, ARM_TYPE, AUTO_MAGIC, AUTOMAP, BELTS, BODY_LOCS, BOOKS, CHAR_STATS, COLORS, COMP_CODE, COMPOSIT, CUBE_MAIN, CUBE_MOD, DIFFICULTY_LEVELS, ELEM_TYPES, EVENTS,
		EXPERIENCE, GAMBLE, GEMS, HIRELING, HIRELING_DESC, HIT_CLASS, INVENTORY, ITEM_RATIO, ITEM_STAT_COST, ITEM_TYPES, LEVEL_GROUPS, LEVELS, LOW_QUALITY_ITEMS, LVL_MAZE, LVL_PREST, LVL_SUB,
		LVL_TYPES, LVL_WARP, MAGIC_PREFIX, MAGIC_SUFFIX, MISC, MISS_CALC, MISSILES, MON_AI, MON_EQUIP, MON_LVL, MON_MODE, MON_PLACE, MON_PRESET, MON_PROP, MON_SEQ, MON_SOUNDS, MON_STATS, MON_STATS2,
		MON_TYPE, MON_U_MOD, NPC, OBJECTS, OBJ_GROUP, OBJ_MODE, OBJ_PRESET, OBJ_TYPE, OVERLAY, PET_TYPE, PLAYER_CLASS, PLR_MODE, PLR_TYPE, QUALITY_ITEMS, RARE_PREFIX, RARE_SUFFIX, RUNES, SET_ITEMS,
		SETS, SHRINES, SKILL_CALC, SKILL_DESC, SKILLS, SOUND_ENVIRON, SOUNDS, STATES, STORE_PAGE, SUPER_UNIQUES, TREASURE_CLASS_EX, UNIQUE_APPELLATION, UNIQUE_ITEMS, UNIQUE_PREFIX, UNIQUE_SUFFIX,
		WANDERING_MON, WEAPONS)
	
	fun compareToNew(newSheets: D2Sheets) {
		var i = 0
		var o = 0
		while (i < sheets.size) {
			val curr = sheets[i]
			val new = newSheets.sheets[o]
			if (curr.name != new.name) {
				println("New file: ${new.name}")
			} else {
				curr.compare(new)
				i++
			}
			o++
		}
		for (i in o until newSheets.sheets.size) {
			println("New file: ${newSheets.sheets[i].name}")
		}
	}
	
	fun verify() {
		sheets.forEach { it.verify() }
	}
	
}