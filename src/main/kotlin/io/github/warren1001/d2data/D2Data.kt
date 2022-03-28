package io.github.warren1001.d2data

import io.github.warren1001.d2data.impl.D2Hireling
import java.io.File

val DIRECTORY = File("current")
val MANAGER = D2SheetManager(DIRECTORY)

fun main() {
	
	println() // just some space from the command line blob of text
	
	//displayAffixes()
	
	//compareFuryDiff(D2Sheet(MANAGER, File("before.txt")), D2Sheet(MANAGER, File("after.txt")))
	//compareDifferences(D2Sheet(MANAGER, File("before.txt")), D2Sheet(MANAGER, File("after.txt")))
	printHirelingData()
	
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