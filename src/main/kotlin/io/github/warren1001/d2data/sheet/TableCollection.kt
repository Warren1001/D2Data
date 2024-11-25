package io.github.warren1001.d2data.sheet

import io.github.warren1001.d2data.enums.sheet.D2Header

open class TableCollection(private val name: String, val rows: MutableList<MutableList<String>>, columnIdentifiers: List<String>, val lookupColumn: Int,
                           protected val listConverter: ListConverter, private val defaultValue: String) {
	
	val columns = listConverter.convert(rows[0].indices.map { i -> listConverter.convert(rows.map { it[i] }) })
	
	protected val otherRowKeys = columns[lookupColumn].mapIndexed { index: Int, element: String -> element.lowercase() to index }.toMap(HashMap())
	protected val otherColumnKeys = columnIdentifiers.mapIndexed { index: Int, element: String -> element.lowercase() to index }.toMap(HashMap())
	
	fun createRow(index: Int) {
		val newRow = listConverter.convert(columns.map { defaultValue })
		rows.add(index, newRow)
		columns.forEach { it.add(index, defaultValue) }
	}
	
	fun duplicateRowIf(transform: (Int) -> Boolean) {
		val indices = rows.indices.filter(transform)
		var offset = 0
		indices.forEach { index ->
			val realIndex = index + offset
			val newRow = listConverter.convert(rows[realIndex])
			rows.add(realIndex, newRow)
			columns.forEach { it.add(realIndex, it[realIndex]) }
			offset++
		}
	}
	
	fun deleteRow(index: Int) {
		val row = rows.removeAt(index)
		otherRowKeys.remove(row[lookupColumn].lowercase())
		columns.forEach { it.removeAt(index) }
	}
	
	fun createColumn(index: Int, columnKey: String) {
		val newColumn = listConverter.convert(rows.map { defaultValue })
		columns.add(index, newColumn)
		rows.forEach { it.add(index, defaultValue) }
		otherColumnKeys[columnKey.lowercase()] = index
	}
	
	fun deleteColumn(index: Int, columnKey: String) {
		columns.removeAt(index)
		rows.forEach { it.removeAt(index) }
		otherColumnKeys.remove(columnKey.lowercase())
	}
	
	operator fun get(row: Int, column: Int): String {
		require(row in rows.indices) { "Row $row out of bounds for sheet $name" }
		require(column in columns.indices) { "Column $column out of bounds for sheet $name" }
		return rows[row][column]
	}
	
	operator fun get(row: Int, columnKey: String) = this[row, otherColumnKeys[columnKey.lowercase()] ?: error("No column found with key $columnKey in sheet $name")]
	
	operator fun get(row: Int, columnHeader: D2Header) = this[row,
		columnHeader.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${columnHeader.headerHistory} in sheet $name")]
	
	operator fun set(row: Int, column: Int, value: String) {
		require(row in rows.indices) { "Row $row out of bounds for sheet $name" }
		require(column in columns.indices) { "Column $column out of bounds for sheet $name" }
		val oldValue = rows[row][column]
		if (oldValue != value && (!otherRowKeys.contains(value.lowercase()) || otherRowKeys[value.lowercase()] == row)) otherRowKeys.remove(oldValue)
		rows[row][column] = value
		columns[column][row] = value
		if (column == lookupColumn) otherRowKeys[value.lowercase()] = row
	}
	
	operator fun set(row: Int, columnKey: String, value: String) {
		require(row in rows.indices) { "Row $row out of bounds for sheet $name" }
		val column = otherColumnKeys[columnKey.lowercase()] ?: error("No column found with key $columnKey in sheet $name")
		this[row, column] = value
	}
	
	operator fun set(row: Int, columnHeader: D2Header, value: String) {
		this[row, columnHeader.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${columnHeader.headerHistory} in sheet $name")] = value
	}
	
	operator fun set(rowKey: String, column: Int, value: String) {
		require(column in columns.indices) { "Column $column out of bounds for sheet $name" }
		val row = otherRowKeys[rowKey.lowercase()] ?: error("No row found with key $rowKey in sheet $name")
		this[row, column] = value
	}
	
	operator fun set(rowKey: String, columnKey: String, value: String) {
		val row = otherRowKeys[rowKey.lowercase()] ?: error("No row found with key $rowKey in sheet $name")
		val column = otherColumnKeys[columnKey.lowercase()] ?: error("No column found with key $columnKey in sheet $name")
		this[row, column] = value
	}
	
	operator fun set(rowKey: String, columnHeader: D2Header, value: String) {
		this[rowKey, columnHeader.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${columnHeader.headerHistory} in sheet $name")] = value
	}
	
	fun find(key: String, lookupColumn: Int = this.lookupColumn, column: Int): String {
		if (lookupColumn == this.lookupColumn) return this[otherRowKeys[key.lowercase()] ?: error("No row found with key $key in column $lookupColumn in sheet $name"), column]
		val row = columns[lookupColumn].indexOfCaseInsensitive(key)
		if (row == -1) error("No row found with key $key in column $lookupColumn in sheet $name")
		return this[row, column]
	}
	
	fun find(key: String, lookupColumn: Int = this.lookupColumn, columnKey: String): String {
		val column = otherColumnKeys[columnKey.lowercase()] ?: error("No column found with key $columnKey in sheet $name")
		return find(key, lookupColumn, column)
	}
	
	fun find(key: String, lookupColumn: Int = this.lookupColumn, columnHeader: D2Header) = find(key,
		lookupColumn, columnHeader.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${columnHeader.headerHistory} in sheet $name"))
	
	fun find(key: String, lookupColumnKey: String, column: Int): String {
		val lookupColumn = otherColumnKeys[lookupColumnKey.lowercase()] ?: error("No column found with key $lookupColumnKey in sheet $name")
		return find(key, lookupColumn, column)
	}
	
	fun find(key: String, lookupColumnHeader: D2Header, column: Int) = find(key,
		lookupColumnHeader.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${lookupColumnHeader.headerHistory} in sheet $name"), column)
	
	fun find(key: String, lookupColumnKey: String, columnKey: String): String {
		val lookupColumn = otherColumnKeys[lookupColumnKey.lowercase()] ?: error("No column found with key $lookupColumnKey in sheet $name")
		val column = otherColumnKeys[columnKey.lowercase()] ?: error("No column found with key $columnKey in sheet $name")
		return find(key, lookupColumn, column)
	}
	
	fun find(key: String, lookupColumnHeader: D2Header, columnKey: String) = find(key,
		lookupColumnHeader.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${lookupColumnHeader.headerHistory} in sheet $name"), columnKey)
	
	fun find(key: String, lookupColumnKey: String, columnHeader: D2Header) = find(key, lookupColumnKey,
		columnHeader.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${columnHeader.headerHistory} in sheet $name"))
	
	fun find(key: String, lookupColumnHeader: D2Header, columnHeader: D2Header) = find(key,
		lookupColumnHeader.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${lookupColumnHeader.headerHistory} in sheet $name"),
		columnHeader.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${columnHeader.headerHistory} in sheet $name"))
	
	fun findAndSet(key: String, lookupColumn: Int = this.lookupColumn, column: Int, value: String) {
		if (lookupColumn == this.lookupColumn) {
			this[otherRowKeys[key.lowercase()] ?: error("No row found with key $key in column $lookupColumn in sheet $name"), column] = value
			return
		}
		val row = columns[lookupColumn].indexOfCaseInsensitive(key)
		if (row == -1) error("No row found with key $key in column $lookupColumn in sheet $name")
		this[row, column] = value
	}
	
	fun findAndSet(key: String, lookupColumn: Int = this.lookupColumn, columnKey: String, value: String) = findAndSet(key, lookupColumn,
		otherColumnKeys[columnKey] ?: error("No column found with key $columnKey in sheet $name"), value)
	
	fun findAndSet(key: String, lookupColumnKey: String, column: Int, value: String) = findAndSet(key,
		otherColumnKeys[lookupColumnKey] ?: error("No column found with key $lookupColumnKey in sheet $name"), column, value)
	
	fun findAndSet(key: String, lookupColumnKey: String, columnKey: String, value: String) {
		val row = columns[otherColumnKeys[lookupColumnKey] ?: error("No column found with key $lookupColumnKey in sheet $name")].indexOfCaseInsensitive(key)
		if (row == -1) error("No row found with key $key in column $lookupColumnKey in sheet $name")
		val column = otherColumnKeys[columnKey] ?: error("No column found with key $columnKey in sheet $name")
		this[row, column] = value
	}
	
	fun findRowIndex(key: String, lookupColumn: Int = this.lookupColumn): Int {
		if (lookupColumn == this.lookupColumn) return otherRowKeys[key.lowercase()] ?: error("No row found with key $key in column $lookupColumn in sheet $name")
		return columns[lookupColumn].indexOfCaseInsensitive(key)
	}
	
	fun findRowIndex(key: String, lookupColumnKey: String) = findRowIndex(key, otherColumnKeys[lookupColumnKey.lowercase()] ?: error("No column found with key $lookupColumnKey in sheet $name"))
	
	fun findRowIndex(key: String, header: D2Header) = findRowIndex(key,
		header.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${header.headerHistory} in sheet $name"))
	
	fun findRowNullable(key : String, lookupColumn: Int = this.lookupColumn): MutableList<String>? {
		if (lookupColumn == this.lookupColumn) return otherRowKeys[key.lowercase()]?.let { rows[it] }
		val index = columns[lookupColumn].indexOfCaseInsensitive(key)
		if (index == -1) return null
		return rows[index]
	}
	
	fun findRowNullable(key: String, lookupColumnKey: String) = findRowNullable(key, otherColumnKeys[lookupColumnKey.lowercase()] ?: error("No column found with key $lookupColumnKey in sheet $name"))
	
	fun findRowNullable(key: String, header: D2Header) = findRowNullable(key,
		header.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${header.headerHistory} in sheet $name"))
	
	fun findRow(key: String, lookupColumn: Int = this.lookupColumn) = findRowNullable(key, lookupColumn) ?: error("No row found with key $key in column $lookupColumn in sheet $name")
	
	fun findRow(key: String, lookupColumnKey: String) = findRow(key, otherColumnKeys[lookupColumnKey.lowercase()] ?: error("No column found with key $lookupColumnKey in sheet $name"))
	
	fun findRow(key: String, header: D2Header) = findRow(key,
		header.headerHistory.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${header.headerHistory} in sheet $name"))
	
	fun findColumnIndex(columnKey: String) = otherColumnKeys[columnKey.lowercase()] ?: error("No column found with key $columnKey in sheet $name")
	
	fun findColumnIndex(header: D2Header) = findColumnIndex(header.headerHistory
		.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${header.headerHistory} in sheet $name"))
	
	fun findColumn(columnKey: String) = columns[otherColumnKeys[columnKey.lowercase()] ?: error("No column found with key $columnKey in sheet $name")]
	
	fun findColumn(header: D2Header) = findColumn(header.headerHistory
		.firstOrNull { otherColumnKeys.contains(it.lowercase()) } ?: error("No column found with key in ${header.headerHistory} in sheet $name"))
	
	fun getRowLookupValue(row: Int) = columns[lookupColumn][row]
	
	fun forEachRow(action: (Int) -> Unit) = rows.forEachIndexed { index, _ -> action(index) }
	
}

fun List<String>.indexOfCaseInsensitive(value: String) = indexOfFirst { it.equals(value, true) }
