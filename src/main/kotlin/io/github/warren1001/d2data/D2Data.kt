package io.github.warren1001.d2data

import io.github.warren1001.d2data.impl.D2Hireling
import io.github.warren1001.d2data.impl.D2Levels
import io.github.warren1001.d2data.impl.D2MonLvl
import io.github.warren1001.d2data.impl.D2MonStats
import java.io.File

val DIRECTORY = File("current")
val MANAGER = D2Sheets(DIRECTORY)

fun main() {
	
	//println() // just some space from the command line blob of text
	
	//displayAffixes()
	
	//compareFuryDiff(D2Sheet(MANAGER, File("before.txt")), D2Sheet(MANAGER, File("after.txt")))
	//compareDifferences(D2Sheet(MANAGER, File("before.txt")), D2Sheet(MANAGER, File("after.txt")))
	//printHirelingData()
	
	//compareDifferences()
	
	//printExperienceInfo()
	//printDefenseInfo()
	//printMonInfoForMacro()
	
	//val before = D2Sheet(MANAGER, File("monstats.txt"))
	//before.getSheetLookup().forEach {  }
	
	
	/*File("current").listFiles { _, name -> name.endsWith(".txt") }!!.forEach { file ->
		val sheet = D2Sheet(file)
		println("${file.nameWithoutExtension}:")
		sheet.getHeaders().forEach { header ->
			val formattedHeader = header.replace(' ', '_').replace("*", "").replace('/', '_').replace('-', '_').replace('.', '_').replace(Regex("(?<!^)([A-Z][a-z]+)"), "_$1")
				.replace(Regex("([a-z]+)([A-Z]+)"), "$1_$2").replace("__", "_")
				.uppercase().replace(Regex("([A-Z])([0-9])"), "$1_$2").replace(Regex("([0-9])([A-Z])"), "$1_$2").replace("V_S", "VS").replace("C_E", "CE").replace("A_R", "AR").replace("H_P", "HP")
				.replace("(N)", "_NIGHTMARE").replace("(H)", "_HELL")
			println("\t\tconst val $formattedHeader = \"$header\"")
		}
	}*/
	
	/*File("current").listFiles { _, name -> name.endsWith(".txt") }!!.forEach { file ->
		val name = file.nameWithoutExtension
		println("\t\tconst val ${name.uppercase()} = \"$name\"")
		
	}*/
	//compareDifferences()
	
	/*File("impl")
		.listFiles { _, name -> name.endsWith(".kt") }!!.forEach { file ->
			Files.writeString(file.toPath(), Files.readString(file.toPath()).replace("import io.github.warren1001.d2data.D2SheetManager\\import java.io.File", "import io.github.warren1001.d2data.D2SheetManager" + System.lineSeparator() +
					"import java.io.File"))
		}*/
	/*val list = mutableListOf<String>()
	Files.write(Paths.get("a.txt"), Files.readAllLines(Paths.get("a.txt")).map { os ->
		val name = os.replace("const val ", "").split(" = ")[0].replace("\t", "")
		val s = name.lowercase().replace('_', ' ')
		val words = s.split(" ").toMutableList()
		
		var output = ""
		
		for (word in words) {
			output += word.replaceFirstChar { it.uppercase() }
		}
		
		list.add("import io.github.warren1001.d2data.impl.D2$output")
		
		return@map "val $name = D2$output::class.java"
	})
	Files.write(Paths.get("b.txt"), list)*/
}

/*fun displayAffixes() {
	val magicPrefixes = D2MagicPrefix(DIRECTORY)
	val magicSuffixes = D2MagicSuffix(DIRECTORY)
	val properties = D2Properties(DIRECTORY)
	magicPrefixes.forEach { key ->
		val code = magicPrefixes.getValue(key, D2MagicPrefix.MOD_1_CODE)
		val min = magicPrefixes.getValue(key, D2MagicPrefix.MOD_1_MIN)
		val max = magicPrefixes.getValue(key, D2MagicPrefix.MOD_1_MAX)
		val propDesc = properties.getValue(code, D2Properties.TOOLTIP).replace("#", if (min == max) min else "$min-$max")
		println("$key: $propDesc")
	}
}*/

fun swapImmunityToSorb() {
	val monStats = D2MonStats(MANAGER, DIRECTORY)
}

fun printMonInfoForMacro() {
	val levelsList = mutableListOf(
		"Blood Moor", "Den of Evil",
		"Cold Plains", "Cave Level 1", "Cave Level 2",
		"Burial Grounds", "Crypt", "Mausoleum",
		"Stony Field", // unlisted
		"Dark Wood",
		"Black Marsh", "Tower Cellar Level 1", "Tower Cellar Level 2", "Tower Cellar Level 3", "Tower Cellar Level 4", "Tower Cellar Level 5",
		"Jail Level 1", "Jail Level 2", "Jail Level 3",
		"Cathedral", "Catacombs Level 1", "Catacombs Level 2", "Catacombs Level 3", "Catacombs Level 4",
		"Tristram", "Moo Moo Farm",
		"Sewers Level 1", "Sewers Level 2", "Sewers Level 3",
		"Rocky Waste", "Stony Tomb Level 1", "Stony Tomb Level 2",
		"Dry Hills", "Halls of the Dead Level 1", "Halls of the Dead Level 2", "Halls of the Dead Level 3",
		"Far Oasis", "Maggot Lair Level 1", "Maggot Lair Level 2", "Maggot Lair Level 3",
		"Lost City", "Valley of Snakes", "Claw Viper Temple Level 1", "Claw Viper Temple Level 2",
		"Harem Level 1", "Harem Level 2", "Palace Cellar Level 1", "Palace Cellar Level 2", "Palace Cellar Level 3", "Arcane Sanctuary",
		"Tal Rasha's Tomb",
		"Spider Forest", "Spider Cavern",
		"Flayer Jungle", "Flayer Dungeon",
		"Lower Kurast",
		"Kurast Bazaar", "Disused Fane", "Ruined Temple",
		// Sewers Level 1 and 2 are already in the list from act 2
		"Travincal",
		"Durance of Hate Level 1", "Durance of Hate Level 2", "Durance of Hate Level 3",
		"Outer Steppes", "Plains of Despair", "River of Flame", "The Chaos Sanctuary",
		"Bloody Foothills", "Frigid Highlands", "Arreat Plateau",
		"Crystalline Passage", "Frozen River", "Glacial Trail", "The Ancients' Way", "Icy Cellar",
		"Nihlathak's Temple", "Halls of Anguish", "Halls of Pain", "Halls of Vaught",
		"The Worldstone Keep Level 1", "The Worldstone Keep Level 2", "The Worldstone Keep Level 3", "Throne of Destruction", "The Worldstone Chamber",
	)
	val levels = D2Levels(MANAGER, DIRECTORY)
	val monStats = D2MonStats(MANAGER, DIRECTORY)
	val noDupes = mutableSetOf<String>();
	println("monId\tmonName\texp\tlevelName\tareaLevel\tUni Density Min\tUni Density Max\t" +
			"Fire Res\tbreakByLR(<113)\tbreakByInf(<117)\tbreakByConv(<130)\tbreakByConvAndLR(<143)\tunbreakable(>=143)\t" +
			"Cold Res\tbreakByLR(<113)\tbreakByInf(<117)\tbreakByConv(<130)\tbreakByConvAndLR(<143)\tunbreakable(>=143)\t" +
			"Light Res\tbreakByLR(<113)\tbreakByInf(<117)\tbreakByConv(<130)\tbreakByConvAndLR(<143)\tunbreakable(>=143)\t" +
			"Poison Res\tbreakByLR(<113)\tPhys Res\tbreakByDecrep(<110)\tbrakByAmp(<120)\tMagic Res\tanimal\tdemon\tundead")
	levels.forEach { key ->
		val areaLvl = levels.getValue(key, D2Levels.MON_LVL_EX_HELL) ?: return@forEach
		if (areaLvl.isBlank()) return@forEach
		val levelName = levels.getValue(key, D2Levels.STRING_NAME) ?: return@forEach
		if (!levelsList.contains(levelName)) return@forEach
		var uniDensMin = levels.getValue(key, D2Levels.MON_U_MIN_HELL) ?: "0"
		if (uniDensMin.isEmpty()) uniDensMin = "0"
		var uniDensMax = levels.getValue(key, D2Levels.MON_U_MAX_HELL) ?: "0"
		if (uniDensMax.isEmpty()) uniDensMax = "0"
		for (i in 1..20) {
			val nmon = levels.getValue(key, "nmon$i") ?: break
			if (nmon.isBlank()) break
			val exp = monStats.getValue(nmon, D2MonStats.EXP_HELL) ?: continue
			if (exp.isBlank()) continue
			
			var fireRes = monStats.getValue(nmon, D2MonStats.RES_FI_HELL) ?: "0"
			if (fireRes.isBlank()) fireRes = "0"
			val breakFireByLR = fireRes.toInt() < 113
			val breakFireByInf = fireRes.toInt() < 117
			val breakFireByConv = fireRes.toInt() < 130
			val breakFireByConvLR = fireRes.toInt() < 143
			val unbreakableFire = fireRes.toInt() >= 143
			
			var coldRes = monStats.getValue(nmon, D2MonStats.RES_CO_HELL) ?: "0"
			if (coldRes.isBlank()) coldRes = "0"
			val breakColdByLR = coldRes.toInt() < 113
			val breakColdByInf = coldRes.toInt() < 117
			val breakColdByConv = coldRes.toInt() < 130
			val breakColdByConvLR = coldRes.toInt() < 143
			val unbreakableCold = coldRes.toInt() >= 143
			
			var lightRes = monStats.getValue(nmon, D2MonStats.RES_LI_HELL) ?: "0"
			if (lightRes.isBlank()) lightRes = "0"
			val breakLightByLR = lightRes.toInt() < 113
			val breakLightByInf = lightRes.toInt() < 117
			val breakLightByConv = lightRes.toInt() < 130
			val breakLightByConvLR = lightRes.toInt() < 143
			val unbreakableLight = lightRes.toInt() >= 143
			
			var poisRes = monStats.getValue(nmon, D2MonStats.RES_PO_HELL) ?: "0"
			if (poisRes.isBlank()) poisRes = "0"
			val breakPoisByLR = poisRes.toInt() < 113
			
			var physRes = monStats.getValue(nmon, D2MonStats.RES_DM_HELL) ?: "0"
			if (physRes.isBlank()) physRes = "0"
			val physResByDecrep = physRes.toInt() < 110
			val physResByAmp = physRes.toInt() < 120
			
			var magicRes = monStats.getValue(nmon, D2MonStats.RES_MA_HELL) ?: "0"
			if (magicRes.isBlank()) magicRes = "0"
			
			var demon = monStats.getValue(nmon, D2MonStats.DEMON) ?: "false"
			if (demon.isEmpty()) demon = "false"
			if (demon == "1") demon = "true"
			
			var lUndead = monStats.getValue(nmon, D2MonStats.L_UNDEAD) ?: "false"
			if (lUndead.isEmpty()) lUndead = "false"
			var hUndead = monStats.getValue(nmon, D2MonStats.H_UNDEAD) ?: "false"
			if (hUndead.isEmpty()) hUndead = "false"
			val undead = (lUndead == "true" || lUndead == "1" || hUndead == "true" || hUndead == "1").toString()
			
			val animal = (demon == "false" && undead == "false").toString()
			
			var monName = monStats.getValue(nmon, D2MonStats.NAME_STR) ?: continue
			if (noDupes.contains(nmon + levelName)) continue
			noDupes.add(nmon + levelName)
			if (monName.contains(Regex("([a-z]+)([A-Z])"))) {
				monName = monName.replace(Regex("([a-z]+)([A-Z])"), "$1 $2")
			}
			println("$nmon\t$monName\t$exp\t$levelName\t$areaLvl\t$uniDensMin\t$uniDensMax\t$fireRes\t$breakFireByLR\t$breakFireByInf\t$breakFireByConv\t$breakFireByConvLR\t$unbreakableFire" +
					"\t$coldRes\t$breakColdByLR" +
					"\t$breakColdByInf\t$breakColdByConv\t$breakColdByConvLR\t$unbreakableCold\t$lightRes\t$breakLightByLR\t$breakLightByInf\t$breakLightByConv\t$breakLightByConvLR\t$unbreakableLight\t$poisRes\t$breakPoisByLR\t$physRes\t$physResByDecrep\t$physResByAmp\t$magicRes\t$animal\t$demon\t$undead")
		}
	}
}

fun printExperienceInfo() {
	val levelsList = mutableListOf(
		"Blood Moor", "Den of Evil",
		"Cold Plains", "Cave Level 1", "Cave Level 2",
		"Burial Grounds", "Crypt", "Mausoleum",
		"Stony Field", // unlisted
		"Dark Wood",
		"Black Marsh", "Tower Cellar Level 1", "Tower Cellar Level 2", "Tower Cellar Level 3", "Tower Cellar Level 4", "Tower Cellar Level 5",
		"Jail Level 1", "Jail Level 2", "Jail Level 3",
		"Cathedral", "Catacombs Level 1", "Catacombs Level 2", "Catacombs Level 3", "Catacombs Level 4",
		"Tristram", "Moo Moo Farm",
		"Sewers Level 1", "Sewers Level 2", "Sewers Level 3",
		"Rocky Waste", "Stony Tomb Level 1", "Stony Tomb Level 2",
		"Dry Hills", "Halls of the Dead Level 1", "Halls of the Dead Level 2", "Halls of the Dead Level 3",
		"Far Oasis", "Maggot Lair Level 1", "Maggot Lair Level 2", "Maggot Lair Level 3",
		"Lost City", "Valley of Snakes", "Claw Viper Temple Level 1", "Claw Viper Temple Level 2",
		"Harem Level 1", "Harem Level 2", "Palace Cellar Level 1", "Palace Cellar Level 2", "Palace Cellar Level 3", "Arcane Sanctuary",
		"Tal Rasha's Tomb",
		"Spider Forest", "Spider Cavern",
		"Flayer Jungle", "Flayer Dungeon",
		"Lower Kurast",
		"Kurast Bazaar", "Disused Fane", "Ruined Temple",
		// Sewers Level 1 and 2 are already in the list from act 2
		"Travincal",
		"Durance of Hate Level 1", "Durance of Hate Level 2", "Durance of Hate Level 3",
		"Outer Steppes", "Plains of Despair", "River of Flame", "Chaos Sanctuary",
		"Bloody Foothills", "Frigid Highlands", "Arreat Plateau",
		"Crystalline Passage", "Frozen River", "Glacial Trail", "The Ancients' Way", "Icy Cellar",
		"Nihlathak's Temple", "Halls of Anguish", "Halls of Pain", "Halls of Vaught",
		"The Worldstone Keep Level 1", "The Worldstone Keep Level 2", "The Worldstone Keep Level 3", "Throne of Destruction", "The Worldstone Chamber",
	)
	val levels = D2Levels(MANAGER, DIRECTORY)
	val monStats = D2MonStats(MANAGER, DIRECTORY)
	val noDupes = mutableSetOf<String>();
	levels.forEach { key ->
		val areaLvl = levels.getValue(key, D2Levels.MON_LVL_EX_HELL) ?: return@forEach
		if (areaLvl.isBlank()) return@forEach
		val levelName = levels.getValue(key, D2Levels.STRING_NAME) ?: return@forEach
		if (!levelsList.contains(levelName)) return@forEach
		for (i in 1..20) {
			val nmon = levels.getValue(key, "nmon$i") ?: break
			if (nmon.isBlank()) break
			val exp = monStats.getValue(nmon, D2MonStats.EXP_HELL) ?: continue
			if (exp.isBlank()) continue
			var monName = monStats.getValue(nmon, D2MonStats.NAME_STR) ?: continue
			if (noDupes.contains(nmon + levelName)) continue
			noDupes.add(nmon + levelName)
			if (monName.contains(Regex("([a-z]+)([A-Z])"))) {
				monName = monName.replace(Regex("([a-z]+)([A-Z])"), "$1 $2")
			}
			println("\tnew MonsterEntry(\"$nmon\", \"$monName\", $exp, \"$levelName\", $areaLvl),")
		}
	}
}

fun printDefenseInfo() {
	val levelsList = mutableListOf(
		"Blood Moor", "Den of Evil",
		"Cold Plains", "Cave Level 1", "Cave Level 2",
		"Burial Grounds", "Crypt", "Mausoleum",
		"Dark Wood",
		"Black Marsh", "Tower Cellar Level 1", "Tower Cellar Level 2", "Tower Cellar Level 3", "Tower Cellar Level 4", "Tower Cellar Level 5",
		"Jail Level 1", "Jail Level 2", "Jail Level 3",
		"Cathedral", "Catacombs Level 1", "Catacombs Level 2", "Catacombs Level 3", "Catacombs Level 4",
		"Tristram", "Moo Moo Farm",
		"Sewers Level 1", "Sewers Level 2", "Sewers Level 3",
		"Rocky Waste", "Stony Tomb Level 1", "Stony Tomb Level 2",
		"Dry Hills", "Halls of the Dead Level 1", "Halls of the Dead Level 2", "Halls of the Dead Level 3",
		"Far Oasis", "Maggot Lair Level 1", "Maggot Lair Level 2", "Maggot Lair Level 3",
		"Lost City", "Valley of Snakes", "Claw Viper Temple Level 1", "Claw Viper Temple Level 2",
		"Harem Level 1", "Harem Level 2", "Palace Cellar Level 1", "Palace Cellar Level 2", "Palace Cellar Level 3", "Arcane Sanctuary",
		"Tal Rasha's Tomb",
		"Spider Forest", "Spider Cavern",
		"Flayer Jungle", "Flayer Dungeon",
		"Lower Kurast",
		"Kurast Bazaar", "Disused Fane", "Ruined Temple",
		// Sewers Level 1 and 2 are already in the list from act 2
		"Travincal",
		"Durance of Hate Level 1", "Durance of Hate Level 2", "Durance of Hate Level 3",
		"Outer Steppes", "Plains of Despair", "River of Flame", "Chaos Sanctuary",
		"Bloody Foothills", "Frigid Highlands", "Arreat Plateau",
		"Crystalline Passage", "Frozen River", "Glacial Trail", "The Ancients' Way", "Icy Cellar",
		"Nihlathak's Temple", "Halls of Anguish", "Halls of Pain", "Halls of Vaught",
		"The Worldstone Keep Level 1", "The Worldstone Keep Level 2", "The Worldstone Keep Level 2", "Throne of Destruction", "The Worldstone Chamber",
	)
	val levels = D2Levels(MANAGER, DIRECTORY)
	val monStats = D2MonStats(MANAGER, DIRECTORY)
	val monLvl = D2MonLvl(MANAGER, DIRECTORY)
	val noDupes = mutableSetOf<String>();
	levels.forEach { key ->
		val areaLvl = levels.getValue(key, D2Levels.MON_LVL_EX_HELL) ?: return@forEach
		if (areaLvl.isBlank()) return@forEach
		val levelName = levels.getValue(key, D2Levels.STRING_NAME) ?: return@forEach
		if (!levelsList.contains(levelName)) return@forEach
		val monLvlValue = monLvl.getValue(areaLvl, D2MonLvl.AC_HELL)
		for (i in 1..20) {
			val nmon = levels.getValue(key, "nmon$i") ?: break
			if (nmon.isBlank()) break
			val exp = monStats.getValue(nmon, D2MonStats.AC_HELL) ?: continue
			if (exp.isBlank()) continue
			var monName = monStats.getValue(nmon, D2MonStats.NAME_STR) ?: continue
			if (noDupes.contains(nmon + levelName)) continue
			noDupes.add(nmon + levelName)
			if (monName.contains(Regex("([a-z]+)([A-Z])"))) {
				monName = monName.replace(Regex("([a-z]+)([A-Z])"), "$1 $2")
			}
			println("\tnew MonsterEntry(\"$nmon\", \"$monName\", $exp, \"$levelName\", $areaLvl, $monLvlValue),")
		}
	}
}

fun printHirelingData() {
	val hirelings = D2Hireling(MANAGER, DIRECTORY)
	hirelings.forEach { key ->
		val hireling = hirelings.getValue(key, D2Hireling.SUB_TYPE)
		val baseLevel = hirelings.getValue(key, D2Hireling.LEVEL)
		val hp = hirelings.getValue(key, D2Hireling.HP)
		val hpL = hirelings.getValue(key, D2Hireling.HP_LVL)
		val def = hirelings.getValue(key, D2Hireling.DEFENSE)
		val defL = hirelings.getValue(key, D2Hireling.DEF_LVL)
		val str = hirelings.getValue(key, D2Hireling.STR)
		val strL = hirelings.getValue(key, D2Hireling.STR_LVL)
		val dex = hirelings.getValue(key, D2Hireling.DEX)
		val dexL = hirelings.getValue(key, D2Hireling.DEX_LVL)
		val ar = hirelings.getValue(key, D2Hireling.AR)
		val arL = hirelings.getValue(key, D2Hireling.AR_LVL)
		val min = hirelings.getValue(key, D2Hireling.DMG_MIN)
		val max = hirelings.getValue(key, D2Hireling.DMG_MAX)
		val dmgL = hirelings.getValue(key, D2Hireling.DMG_LVL)
		val fr = hirelings.getValue(key, D2Hireling.RESIST_FIRE)
		val frL = hirelings.getValue(key, D2Hireling.RESIST_FIRE_LVL)
		val cr = hirelings.getValue(key, D2Hireling.RESIST_COLD)
		val crL = hirelings.getValue(key, D2Hireling.RESIST_COLD_LVL)
		val lr = hirelings.getValue(key, D2Hireling.RESIST_LIGHTNING)
		val lrL = hirelings.getValue(key, D2Hireling.RESIST_LIGHTNING_LVL)
		val pr = hirelings.getValue(key, D2Hireling.RESIST_POISON)
		val prL = hirelings.getValue(key, D2Hireling.RESIST_POISON_LVL)
		val defaultChance = hirelings.getValue(key, D2Hireling.DEFAULT_CHANCE)
		print("$hireling: ")
		print(
			listOf(baseLevel, hp, hpL, def, defL, str, strL, dex, dexL, ar, arL, min, max, dmgL, fr, frL, cr, crL, lr, lrL, pr, prL, defaultChance).joinToString(separator = ", ")
		)
		val list = mutableListOf<String>()
		for (i in 1..6) {
			val name = hirelings.getValue(key, "Skill$i")
			if (name.isNullOrEmpty()) break
			val chance = hirelings.getValue(key, "Chance$i")
			val chanceL = hirelings.getValue(key, "ChancePerLvl$i")
			val skillLevel = hirelings.getValue(key, "Level$i")
			val skillLevelL = hirelings.getValue(key, "LvlPerLvl$i")
			list.add(listOf("\"$name\"", chance, chanceL, skillLevel, skillLevelL).joinToString(separator = ", ", prefix = "[", postfix = "]"))
		}
		print(", ")
		print(list.joinToString(separator = ", ", prefix = "[", postfix = "]"))
		println()
	}
}

fun printNewColumns(old: D2Sheet, new: D2Sheet) {
	for (v in new.getHeaders()) {
		if (!old.getHeaders().contains(v)) {
			println("\tNew Header in ${new.name}: $v")
			new.getSheetLookup().keys.forEach { key ->
				val value = new.getValue(key, v)
				if (value != null) {
					if (value.isNotBlank()) println("\t\t'$key'('$value')")
				}
			}
		}
	}
}

fun printNewRows(old: D2Sheet, new: D2Sheet) {
	for (v in new.getSheetLookup().keys) {
		if (!old.getSheetLookup().containsKey(v)) {
			println("\tNew Row in ${new.name}: $v")
			new.getHeaders().forEach { header ->
				val value = new.getValue(v, header)
				if (value != null) {
					if (value.isNotBlank()) println("\t\t'$header'('$value')")
				}
			}
		}
	}
}

fun printDeletedRows(old: D2Sheet, new: D2Sheet) {
	for (v in old.getSheetLookup().keys) {
		if (!new.getSheetLookup().containsKey(v)) {
			println("Deleted Row in ${old.name}: $v")
			val reverse = old.getHeaders()
			println("\t$v:")
			old.getSheetLookup()[v]?.forEachIndexed { i, value ->
				println("\t\t'${reverse[i]}'('$value')")
			}
		}
	}
}

fun compareDifferences() {
	
	File("current").listFiles { _, name -> name.endsWith(".txt") }!!.forEach { file ->
		val name = file.nameWithoutExtension
		val original = D2Sheet(MANAGER, file)
		val new = D2Sheet(MANAGER, File("new"), name)
		compareDifferences(original, new)
	}
}

fun compareFuryDiff(old: D2Sheet, new: D2Sheet) {
	old.getHeaders().forEach { header ->
		val oldValue = old.getValue("Fury", header)
		val newValue = new.getValue("Fury", header)
		if (oldValue != newValue) {
			println("\t\t'$header'('$oldValue' -> '$newValue')")
		}
	}
}

fun compareDifferences(old: D2Sheet, new: D2Sheet) {
	val name = old.name
	var printName = false
	printNewColumns(old, new)
	printNewRows(old, new)
	printDeletedRows(old, new)
	
	val reverse = old.getHeaders()
	old.getSheetLookup().forEach { (key, values) ->
		var printKey = false
		val newValues = new.getSheetLookup()[key]
		if (newValues == null) {
			println("could not find column '$key' in new '$name'")
			return@forEach
		}
		for (i in values.indices) {
			val oldValue = values[i]
			val newvalue = new.getValue(key, reverse[i])
			if (newvalue == null) {
				println("Deleted header '${reverse[i]}'.")
				return
			}
			if (oldValue != newvalue) {
				if (!printKey) {
					if (!printName) {
						println("$name:")
						printName = true
					}
					if (name.endsWith("runes.txt")) {
						println("\t${values[1]}: ")
					} else {
						println("\t$key: ")
					}
					printKey = true
				}
				println("\t\t'${reverse[i]}'(old='$oldValue',new='$newvalue')")
			}
			
		}
	}
	if (printName) println()
}