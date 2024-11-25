package io.github.warren1001.d2data

import io.github.warren1001.d2data.file.D2Files
import java.io.File

const val CURRENT_VERSION = "81914"
const val PATH_DIRECTORY_FILES = "C:\\Games\\Diablo\\Text Files\\"
const val PATH_DIRECTORY_CURRENT = "$PATH_DIRECTORY_FILES$CURRENT_VERSION\\"

fun main() {
	
	val directory = File(PATH_DIRECTORY_CURRENT)
	val manager = D2Files(directory)
	
	manager.loadAllSheets()
	
	if (!manager.verify()) {
		println("------------------------------------")
		println("Data provided at ${directory.absolutePath} is not of the D2R dataversionbuild 81914, errors may occur if attempting to parse this data")
		println("------------------------------------")
	}
	
	compareDifferences(manager)
	
}

fun compareDifferences(manager : D2Files) {
	val filesDir = File(PATH_DIRECTORY_FILES)
	val dirs = filesDir.listFiles { file -> file.isDirectory }
	if (dirs != null) {
		dirs.sortDescending()
		val newestVersion = dirs[0].name
		if (newestVersion > CURRENT_VERSION) {
			val newestDirectory = File(PATH_DIRECTORY_FILES, newestVersion)
			val newManager = D2Files(newestDirectory)
			newManager.loadAllSheets()
			manager.compareToNew(newManager)
		} else {
			println("Current version $CURRENT_VERSION is newest")
		}
	} else {
		println("Files directory ${filesDir.absolutePath} was empty")
	}
}

fun <T> List<T>.similarity(other: List<T>, ignoreEmpty: Boolean = false): Float {
	var matches = 0
	var counts = 0
	for (i in 0 until minOf(this.size, other.size)) {
		if (!ignoreEmpty || ((this[i] != "" && this[i] != "0") || (other[i] != "" && other[i] != "0"))) {
			counts++
			if (this[i] == other[i]) {
				matches++
			}
		}
	}
	return if (counts == 0) 1F else matches.toFloat() / counts
}

fun File.forEachFileDeep(skipDirectories: List<String> = emptyList(), action: (File) -> Unit) {
	require(isDirectory) { "File $this is not a directory" }
	listFiles()?.forEach {
		if (it.isDirectory) {
			val relative = it.relativeTo(this).path
			if (!skipDirectories.contains(relative)) it.forEachFileDeep(skipDirectories, action)
		}
		else action(it)
	}
}

fun String.properSeparator() = replace("\\", File.separator).replace("/", File.separator)

