package io.github.warren1001.d2data

import io.github.warren1001.d2data.impl.*
import java.io.File


class D2SheetManager(private val dir: File) {
	
	companion object {
		
		val ARMOR = D2Armor::class.java
		val ARM_TYPE = D2ArmType::class.java
		val AUTO_MAGIC = D2AutoMagic::class.java
		val AUTOMAP = D2AutoMap::class.java
		val BELTS = D2Belts::class.java
		val BODY_LOCS = D2BodyLocs::class.java
		val BOOKS = D2Books::class.java
		val CHAR_STATS = D2CharStats::class.java
		val COLORS = D2Colors::class.java
		val COMP_CODE = D2CompCode::class.java
		val COMPOSIT = D2Composit::class.java
		val CUBE_MAIN = D2CubeMain::class.java
		val CUBE_MOD = D2CubeMod::class.java
		val DIFFICULTY_LEVELS = D2DifficultyLevels::class.java
		val ELEM_TYPES = D2ElemTypes::class.java
		val EVENTS = D2Events::class.java
		val EXPERIENCE = D2Experience::class.java
		val GAMBLE = D2Gamble::class.java
		val GEMS = D2Gems::class.java
		val HIRELING = D2Hireling::class.java
		val HIT_CLASS = D2HitClass::class.java
		val INVENTORY = D2Inventory::class.java
		val ITEM_RATIO = D2ItemRatio::class.java
		val ITEM_STAT_COST = D2ItemStatCost::class.java
		val ITEM_TYPES = D2ItemTypes::class.java
		val LEVELS = D2Levels::class.java
		val LOW_QUALITY_ITEMS = D2LowQualityItems::class.java
		val LVL_MAZE = D2LvlMaze::class.java
		val LVL_PREST = D2LvlPrest::class.java
		val LVL_SUB = D2LvlSub::class.java
		val LVL_TYPES = D2LvlTypes::class.java
		val LVL_WARP = D2LvlWarp::class.java
		val MAGIC_PREFIX = D2MagicPrefix::class.java
		val MAGIC_SUFFIX = D2MagicSuffix::class.java
		val MISC = D2Misc::class.java
		val MISS_CALC = D2MissCalc::class.java
		val MISSILES = D2Missiles::class.java
		val MON_AI = D2MonAI::class.java
		val MON_EQUIP = D2MonEquip::class.java
		val MON_LVL = D2MonLvl::class.java
		val MON_MODE = D2MonMode::class.java
		val MON_PLACE = D2MonPlace::class.java
		val MON_PRESET = D2MonPreset::class.java
		val MON_PROP = D2MonProp::class.java
		val MON_SEQ = D2MonSeq::class.java
		val MON_SOUNDS = D2MonSounds::class.java
		val MON_STATS = D2MonStats::class.java
		val MON_STATS2 = D2MonStats2::class.java
		val MON_TYPE = D2MonType::class.java
		val MON_U_MOD = D2MonUMod::class.java
		val NPC = D2NPC::class.java
		val OBJECTS = D2Objects::class.java
		val OBJ_GROUP = D2ObjGroup::class.java
		val OBJ_MODE = D2ObjMode::class.java
		val OBJ_PRESET = D2ObjPreset::class.java
		val OBJ_TYPE = D2ObjType::class.java
		val OVERLAY = D2Overlay::class.java
		val PET_TYPE = D2PetType::class.java
		val PLAYER_CLASS = D2PlayerClass::class.java
		val PLR_MODE = D2PlrMode::class.java
		val PLR_TYPE = D2PlrType::class.java
		val QUALITY_ITEMS = D2QualityItems::class.java
		val RARE_PREFIX = D2RarePrefix::class.java
		val RARE_SUFFIX = D2RareSuffix::class.java
		val RUNES = D2Runes::class.java
		val SET_ITEMS = D2SetItems::class.java
		val SETS = D2Sets::class.java
		val SHRINES = D2Shrines::class.java
		val SKILL_CALC = D2SkillCalc::class.java
		val SKILL_DESC = D2SkillDesc::class.java
		val SKILLS = D2Skills::class.java
		val SOUND_ENVIRON = D2SoundEnviron::class.java
		val SOUNDS = D2Sounds::class.java
		val STATES = D2States::class.java
		val STORE_PAGE = D2StorePage::class.java
		val SUPER_UNIQUES = D2SuperUniques::class.java
		val TREASURE_CLASS_EX = D2TreasureClassEx::class.java
		val UNIQUE_APPELLATION = D2UniqueAppellation::class.java
		val UNIQUE_ITEMS = D2UniqueItems::class.java
		val UNIQUE_PREFIX = D2UniquePrefix::class.java
		val UNIQUE_SUFFIX = D2UniqueSuffix::class.java
		val WANDERING_MON = D2WanderingMon::class.java
		val WEAPONS = D2Weapons::class.java
		
		
	}
	
	private val classMap: MutableMap<Class<*>, D2Sheet> = mutableMapOf()
	
	fun <T : D2Sheet> getSheet(clazz: Class<T>): T {
		return classMap.computeIfAbsent(clazz) { clazz.getConstructor(D2SheetManager::class.java, File::class.java).newInstance(this, dir) } as T
	}
	
}