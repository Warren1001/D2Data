package io.github.warren1001.d2data

import java.io.File

val DIRECTORY = File("2.4")
val MANAGER = D2Sheets(DIRECTORY)

fun main() {
	
	MANAGER.loadAll()
	
	if (!MANAGER.verify()) {
		println("------------------------------------")
		println("Data provided at ${DIRECTORY.absolutePath} is not of the D2R version 2.5.2, errors will occur if attempting to parse this data")
		println("------------------------------------")
	}
	
	compareDifferences()
	
}

fun compareDifferences() {
	val newManager = D2Sheets(File("current"))
	newManager.loadAll()
	MANAGER.compareToNew(newManager)
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
