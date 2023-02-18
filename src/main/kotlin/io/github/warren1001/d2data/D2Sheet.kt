package io.github.warren1001.d2data

import io.github.warren1001.d2data.enums.D2Header
import io.github.warren1001.d2data.enums.D2SheetInfo
import io.github.warren1001.d2data.utils.ListConverter
import io.github.warren1001.d2data.utils.ListDifference
import io.github.warren1001.d2data.utils.TableCollection
import java.io.File

open class D2Sheet(protected val manager: D2Sheets, val file: File, val info: D2SheetInfo, val listConverter: ListConverter) {
	
	val name: String = file.nameWithoutExtension
	val columnHeaders: MutableList<String>
	//protected val columnLookup: MutableMap<String, Int> = mutableMapOf()
	//protected val rows: MutableList<MutableList<String>>
	val table: TableCollection<String>
	//protected val rowLookup: MutableMap<String, Int> = mutableMapOf()
	//protected val columns: List<List<String>>
	//protected val lookupIndex: Int
	
	init {
		val lines = file.readLines().toMutableList()
		columnHeaders = lines.removeFirst().split("\t").toMutableList()
		//columnHeaders.forEachIndexed { i, column -> columnLookup[column] = i }
		//rows = listConverter.convert(lines.map { listConverter.convert(it.split("\t")) })
		val lookupColumn = info.getUniqueHeader()?.header?.let { columnHeaders.indexOf(it) } ?: 0
		table = TableCollection(listConverter.convert(lines.map { listConverter.convert(it.split("\t")) }), columnHeaders, lookupColumn, listConverter, "")
		//rowHeaders = rows.map { it[lookupIndex] }.toMutableList()
		//columns = columnHeaders.indices.map { i -> rows.map { it[i] } }
	}
	
	//fun getData() = rows
	
	fun <E> mapIndexed(transform: (Int, MutableList<String>) -> E) = table.rows.mapIndexed(transform)
	
	fun createRow(index: Int) = table.createRow(index)
	
	fun deleteRow(index: Int) = table.deleteRow(index)
	
	fun createColumn(index: Int, columnName: String) {
		columnHeaders.add(index, columnName)
		table.createColumn(index, columnName)
	}
	
	fun deleteColumn(index: Int): String {
		val columnName = columnHeaders.removeAt(index)
		table.deleteColumn(index, columnName)
		return columnName
	}
	
	operator fun set(row: Int, column: Int, value: String) {
		table[row, column] = value
	}
	
	operator fun set(row: Int, columnName: String, value: String) {
		table[row, columnName] = value
	}
	
	operator fun set(row: Int, header: D2Header, value: String) {
		this[row, header.header] = value
	}
	
	operator fun get(row: Int, column: Int) = table[row, column]
	
	operator fun get(row: Int, columnName: String) = table[row, columnName]
	
	operator fun get(row: Int, header: D2Header) = this[row, header.header]
	
	operator fun get(key: String, column: Int) = table.find(key, column = column)
	
	operator fun get(key: String, lookupColumn: Int, column: Int) = table.find(key, lookupColumn, column)
	
	operator fun get(key: String, lookupColumn: Int, columnName: String) = table.find(key, lookupColumn, columnName)
	
	operator fun get(key: String, lookupColumnName: String, column: Int) = table.find(key, lookupColumnName, column)
	
	operator fun get(key: String, lookupColumnName: String, columnName: String) = table.find(key, lookupColumnName, columnName)
	
	operator fun get(key: String, lookupHeader: D2Header, column: Int) = table.find(key, lookupHeader.header, column)
	
	operator fun get(key: String, lookupHeader: D2Header, header: String) = this[key, lookupHeader.header, header]
	
	operator fun get(key: String, lookupHeader: D2Header, header: D2Header) = this[key, lookupHeader.header, header.header]
	
	operator fun get(key: String, lookupHeader: String, header: D2Header) = this[key, lookupHeader, header.header]
	
	operator fun get(key: String, lookupColumn: Int, header: D2Header) = this[key, lookupColumn, header.header]
	
	fun forEach(action: (index: Int) -> Unit) = table.forEachRow(action)
	
	fun save() = file.writeText(columnHeaders.joinToString("\t") + "\n" + table.rows.joinToString("\n") { it.joinToString("\t") })
	
	fun compare(new: D2Sheet) {
		
		val columnDiff = ListDifference(columnHeaders, new.columnHeaders)
		val headerMatchedMappings = mutableMapOf<String, String>()
		
		val rowDiff = ListDifference(table.columns[table.lookupColumn], new.table.columns[new.table.lookupColumn])
		val rowMatchedMappings = mutableMapOf<String, String>()
		
		if (columnDiff.firstOnly.isNotEmpty() && columnDiff.secondOnly.isNotEmpty()) {
			val columnIterator = columnDiff.firstOnly.iterator()
			val cachedFilteredNewColumns = mutableMapOf<String, List<String>>()
			while (columnIterator.hasNext()) {
				val header = columnIterator.next()
				val filteredColumns = table.findColumn(header).filterIndexed { i, _ -> rowDiff.shared.map { table.findRowIndex(it) }.contains(i) }
				var bestSimilarity = 0.0F
				var bestHeader = ""
				for (newHeader in columnDiff.secondOnly) {
					val filteredNewColumns = cachedFilteredNewColumns.getOrPut(newHeader) {
						new.table.findColumn(newHeader).filterIndexed { i, _ -> rowDiff.shared.map { new.table.findRowIndex(it) }.contains(i) }
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
					val similarity = table.findRow(row).filterIndexed { i, _ -> columnDiff.shared.map { table.findColumnIndex(it) }.contains(i) }
						.similarity(new.table.findRow(row).filterIndexed { i, _ -> columnDiff.shared.map { new.table.findColumnIndex(it) }.contains(i) })
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
			val exploredRowIndices = new.table.columns[new.table.lookupColumn].toMutableList()
			rowDiff.secondOnly.forEach {
				val rowIndex = exploredRowIndices.indexOf(it)
				println("[$name] New row (${rowIndex + 1}):")
				println("\t${new.formatRow(it).joinToString(", ")}")
				exploredRowIndices[rowIndex] = ""
			}
		}
		if (rowDiff.firstOnly.isNotEmpty()) {
			val exploredRowIndices = table.columns[table.lookupColumn].toMutableList()
			rowDiff.firstOnly.forEach {
				val rowIndex = exploredRowIndices.indexOf(it)
				println("[$name] Removed row (${rowIndex + 1}):")
				println("\t${formatRow(it).joinToString(", ")}")
				exploredRowIndices[rowIndex] = ""
			}
		}
		
		if (rowDiff.shared.isNotEmpty()) {
			rowDiff.shared.forEach { index ->
				val oldRowIndex = table.findRowIndex(index)
				val oldRow = table.rows[oldRowIndex]
				val oldRowFiltered = oldRow.filterIndexed { i, _ -> columnDiff.shared.map { table.findColumnIndex(it) }.contains(i) }
				val newRowIndex = new.table.findRowIndex(index)
				val newRow = new.table.rows[newRowIndex]
				val newRowFiltered = newRow.filterIndexed { i, _ -> columnDiff.shared.map { new.table.findColumnIndex(it) }.contains(i) }
				if (oldRowFiltered != newRowFiltered) {
					if (oldRowIndex == newRowIndex) println("[$name] Modified row (${oldRowIndex + 1}): $index")
					else println("[$name] Modified row (${oldRowIndex + 1},${newRowIndex + 1}): $index")
					var oi = 0
					var ni = 0
					while (oi < oldRow.size && ni < newRow.size) {
						val oldHeader = columnHeaders[oi]
						val newHeader = new.columnHeaders[ni]
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
								error("this shouldn't be possible")
								/*
								println("\t${oldHeader}: '${oldRow[oi]}' -> ${newHeader}: '${newRow[ni]}'")
								println("ni: $ni, oi: $oi, oldRow.size: ${oldRow.size}, newRow.size: ${newRow.size}")
								println("------------------------------------------------")
								ni++
								oi++
								*/
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
							val oldHeader = columnHeaders[oi]
							println("\t${oldHeader}: '${oldRow[oi]}' -> Removed column")
						}
						oi++
					}
					while (ni < newRow.size) {
						if (newRow[ni].isNotEmpty()) {
							val newHeader = new.columnHeaders[ni]
							println("\t${newHeader}: New column -> '${newRow[ni]}'")
						}
						ni++
					}
				}
			}
		}
	}
	
	private fun formatColumn(column: String) = table.findColumn(column).mapIndexed { i, s -> "${table.getRowLookupValue(i)}: '$s'" }.filter { !it.contains("''") }
	
	private fun formatRow(row: String) = table.findRow(row).mapIndexed { i, s -> "${columnHeaders[i]}='$s'" }.filter { !it.contains("''") }
	
	fun verify(): Boolean {
		val diff = ListDifference(columnHeaders, info.getHeaders())
		return diff.firstOnly.isEmpty() && diff.secondOnly.isEmpty()
	}
	
}
