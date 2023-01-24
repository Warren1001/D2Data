package io.github.warren1001.d2data

import io.github.warren1001.d2data.utils.ListDifference
import java.io.File

open class D2Sheet(protected val manager: D2Sheets, file: File, protected val trueHeaders: List<String>, protected var lookupIndex: Int = 0) {
	
	val name: String = file.nameWithoutExtension
	val headers: List<String>
	protected val columnLookup: MutableMap<String, Int> = mutableMapOf()
	protected val rows: MutableList<MutableList<String>>
	protected val rowIndices: List<String>
	protected val rowLookup: MutableMap<String, Int> = mutableMapOf()
	protected val columns: List<List<String>>
	
	init {
		val lines = file.readLines().toMutableList()
		headers = lines.removeFirst().split("\t")
		headers.forEachIndexed { i, column -> columnLookup[column] = i }
		rows = lines.map { it.split("\t").toMutableList() }.filter { it[0].lowercase() != "expansion" && it[0].isNotEmpty() }.toMutableList()
		rowIndices = rows.map { it[lookupIndex] }
		rowIndices.forEachIndexed { i, row -> rowLookup[row] = i }
		columns = headers.indices.map { i -> rows.map { it[i] } }
	}
	
	private fun findValue(key: String, header: Int): String {
		return rows.firstOrNull { it[lookupIndex].lowercase() == key.lowercase() }?.get(header) ?: error("Could not find '$key' in column '${headers[lookupIndex]}' in '$name'")
	}
	
	fun getValue(key: String, header: String): String {
		val index = columnLookup[header] ?: throw IllegalArgumentException("Header $header not found in sheet $name")
		return findValue(key, index)
	}
	
	fun getValue(key: String, header: String, default: String): String {
		val index = columnLookup[header] ?: throw IllegalArgumentException("Header $header not found in sheet $name")
		val value = findValue(key, index)
		return value.ifBlank { default }
	}
	
	fun getValue(row: Int, header: String): String {
		val index = columnLookup[header] ?: throw IllegalArgumentException("Header $header not found in sheet $name")
		return rows[row][index]
	}
	
	fun getValue(row: Int, header: String, default: String): String {
		val value = getValue(row, header)
		return value.ifBlank { default }
	}
	
	fun getValueRef(referenceHeader: String, referenceValue: String, header: String): String {
		val referenceIndex = columnLookup[referenceHeader] ?: throw IllegalArgumentException("Header $referenceHeader not found in sheet $name")
		val index = columnLookup[header] ?: throw IllegalArgumentException("Header $header not found in sheet $name")
		return rows.firstOrNull { it[referenceIndex].lowercase() == referenceValue.lowercase() }?.get(index) ?: error("Could not find '$referenceValue' in column '$referenceHeader' in '$name'")
	}
	
	fun getValueAsInt(key: String, header: String) = getValue(key, header).toInt()
	
	fun getValueAsInt(key: String, header: String, default: Int): Int {
		val value = getValue(key, header)
		return if (value.isBlank()) default else value.toInt()
	}
	
	fun getValueAsInt(row: Int, header: String) = getValue(row, header).toInt()
	
	fun getValueAsInt(row: Int, header: String, default: Int): Int {
		val value = getValue(row, header)
		return if (value.isBlank()) default else value.toInt()
	}
	
	fun forEach(action: (index: Int) -> Unit) {
		rows.forEachIndexed { index, list -> if (list[0].isNotEmpty() && list[0].lowercase() != "expansion") action(index) }
	}
	
	fun compare(new: D2Sheet) {
		
		val columnDiff = ListDifference(headers, new.headers)
		val headerMatchedMappings = mutableMapOf<String, String>()
		
		val rowDiff = ListDifference(rowIndices, new.rowIndices)
		val rowMatchedMappings = mutableMapOf<String, String>()
		
		if (columnDiff.firstOnly.isNotEmpty() && columnDiff.secondOnly.isNotEmpty()) {
			val columnIterator = columnDiff.firstOnly.iterator()
			val cachedFilteredNewColumns = mutableMapOf<String, List<String>>()
			while (columnIterator.hasNext()) {
				val header = columnIterator.next()
				val filteredColumns = columns[columnLookup[header]!!].filterIndexed { i, _ -> rowDiff.shared.map { rowLookup[it]!! }.contains(i) }
				var bestSimilarity = 0.0F
				var bestHeader = ""
				for (newHeader in columnDiff.secondOnly) {
					val filteredNewColumns = cachedFilteredNewColumns.getOrPut(newHeader) {
						new.columns[new.columnLookup[newHeader]!!].filterIndexed { i, _ -> rowDiff.shared.map { new.rowLookup[it]!! }.contains(i) }
					}
					val similarity = filteredColumns.similarity(filteredNewColumns)
					if (similarity > 0.9 && similarity > bestSimilarity) {
						bestSimilarity = similarity
						bestHeader = newHeader
					}
				}
				if (bestSimilarity > 0.0F) {
					headerMatchedMappings[header] = bestHeader
					columnIterator.remove()
					columnDiff.secondOnly.remove(bestHeader)
				}
			}
		}
		
		if (rowDiff.firstOnly.isNotEmpty() && rowDiff.secondOnly.isNotEmpty()) {
			val rowIterator = rowDiff.firstOnly.iterator()
			while (rowIterator.hasNext()) {
				val row = rowIterator.next()
				var bestSimilarity = 0.0F
				var bestRow = ""
				for (newRow in rowDiff.secondOnly) {
					val similarity = rows[rowLookup[row]!!].filterIndexed { i, _ -> columnDiff.shared.map { columnLookup[it] }.contains(i) }
						.similarity(new.rows[new.rowLookup[newRow]!!].filterIndexed { i, _ -> columnDiff.shared.map { new.columnLookup[it] }.contains(i) })
					if (similarity > 0.95 && similarity > bestSimilarity) {
						bestSimilarity = similarity
						bestRow = newRow
					}
				}
				if (bestSimilarity > 0.0F) {
					rowMatchedMappings[row] = bestRow
					rowIterator.remove()
					rowDiff.secondOnly.remove(bestRow)
				}
			}
		}
		
		if (columnDiff.secondOnly.isNotEmpty()) {
			columnDiff.secondOnly.forEach {
				println("[$name] New header: $it")
				new.formatColumn(it).forEach { println("\t$it") }
			}
		}
		if (headerMatchedMappings.isNotEmpty()) {
			headerMatchedMappings.forEach { println("[$name] Header '${it.key}' likely renamed to '${it.value}'") }
		}
		if (columnDiff.firstOnly.isNotEmpty()) {
			columnDiff.firstOnly.forEach {
				println("[$name] Removed header: $it")
				formatColumn(it).forEach { println("\t$it") }
			}
		}
		
		if (rowDiff.secondOnly.isNotEmpty()) {
			val exploredRowIndices = new.rowIndices.toMutableList()
			rowDiff.secondOnly.forEach {
				val rowIndex = exploredRowIndices.indexOf(it)
				println("[$name] New row (${rowIndex + 1}):")
				println("\t${new.formatRow(it).joinToString(", ")}")
				exploredRowIndices[rowIndex] = ""
			}
		}
		if (rowDiff.firstOnly.isNotEmpty()) {
			val exploredRowIndices = rowIndices.toMutableList()
			rowDiff.firstOnly.forEach {
				val rowIndex = exploredRowIndices.indexOf(it)
				println("[$name] Removed row (${rowIndex + 1}):")
				println("\t${formatRow(it).joinToString(", ")}")
				exploredRowIndices[rowIndex] = ""
			}
		}
		
		if (rowDiff.shared.isNotEmpty()) {
			rowDiff.shared.forEach { index ->
				val oldRowIndex = rowLookup[index]!!
				val oldRow = rows[oldRowIndex]
				val oldRowFiltered = oldRow.filterIndexed { i, _ -> columnDiff.shared.map { columnLookup[it] }.contains(i) }
				val newRowIndex = new.rowLookup[index]!!
				val newRow = new.rows[newRowIndex]
				val newRowFiltered = newRow.filterIndexed { i, _ -> columnDiff.shared.map { new.columnLookup[it] }.contains(i) }
				if (oldRowFiltered != newRowFiltered) {
					if (oldRowIndex == newRowIndex) println("[$name] Modified row (${oldRowIndex + 1}): $index")
					else println("[$name] Modified row (${oldRowIndex + 1},${newRowIndex + 1}): $index")
					var oi = 0
					var ni = 0
					while (oi < oldRow.size && ni < newRow.size) {
						val oldHeader = headers[oi]
						val newHeader = new.headers[ni]
						if (oldHeader != newHeader && headerMatchedMappings[oldHeader] != newHeader) {
							if (columnDiff.shared.contains(oldHeader)) {
								if (newRow[ni].isNotEmpty()) println("\t${newHeader}: New column -> '${newRow[ni]}'")
								ni++
							} else if (columnDiff.shared.contains(newHeader)) {
								if (oldRow[oi].isNotEmpty()) println("\t${oldHeader}: '${oldRow[oi]}' -> Removed column")
								oi++
							} else if (columnDiff.firstOnly.contains(oldHeader)) {
								if (oldRow[oi].isNotEmpty()) println("\t${oldHeader}: '${oldRow[oi]}' -> Removed column")
								oi++
							} else if (columnDiff.secondOnly.contains(newHeader)) {
								if (newRow[ni].isNotEmpty()) println("\t${newHeader}: New column -> '${newRow[ni]}'")
								ni++
							} else {
								println("---------- this shouldn't be possible ----------")
								//println("\t${oldHeader}: '${oldRow[oi]}' -> ${newHeader}: '${newRow[ni]}'")
								//println("ni: $ni, oi: $oi, oldRow.size: ${oldRow.size}, newRow.size: ${newRow.size}")
								//println("------------------------------------------------")
								//ni++
								//oi++
							}
						} else {
							if (oldRow[oi] != newRow[ni]) {
								if (headerMatchedMappings[oldHeader] == newHeader) println("\t${oldHeader}->${newHeader}: '${oldRow[oi]}' -> '${newRow[ni]}'")
								else println("\t${newHeader}: '${oldRow[oi]}' -> '${newRow[ni]}'")
							}
							oi++
							ni++
						}
					}
					while (oi < oldRow.size) {
						if (oldRow[oi].isNotEmpty()) {
							val oldHeader = headers[oi]
							println("\t${oldHeader}: '${oldRow[oi]}' -> Removed column")
						}
						oi++
					}
					while (ni < newRow.size) {
						if (newRow[ni].isNotEmpty()) {
							val newHeader = new.headers[ni]
							println("\t${newHeader}: New column -> '${newRow[ni]}'")
						}
						ni++
					}
				}
			}
		}
	}
	
	private fun formatColumn(header: String) = columns[columnLookup[header]!!].mapIndexed { i, s -> "${rowIndices[i]}: '$s'" }.filter { !it.contains("''") }
	
	private fun formatRow(index: String) = rows[rowLookup[index]!!].mapIndexed { i, s -> "${headers[i]}='$s'" }.filter { !it.contains("''") }
	
	fun verify(): Boolean {
		val diff = ListDifference(headers, trueHeaders)
		return diff.firstOnly.isEmpty() && diff.secondOnly.isEmpty()
	}
	
}