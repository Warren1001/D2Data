package io.github.warren1001.d2data.utils

import io.github.warren1001.d2data.enums.D2Header

open class TableCollection<E>(val rows: MutableList<MutableList<E>>, columnIdentifiers: List<Any>, val lookupColumn: Int, protected val listConverter: ListConverter, private val defaultValue: E) {
	
	val columns = listConverter.convert(rows[0].indices.map { i -> listConverter.convert(rows.map { it[i] }) })
	
	protected val otherRowKeys = columns[lookupColumn].mapIndexed { index: Int, element: E -> element to index }.toMap().toMutableMap()
	protected val otherColumnKeys = columnIdentifiers.mapIndexed { index: Int, any: Any -> any to index }.toMap().toMutableMap()
	
	fun createRow(index: Int) {
		val newRow = listConverter.convert(columns.map { defaultValue })
		rows.add(index, newRow)
		columns.forEach { it.add(index, defaultValue) }
	}
	
	fun deleteRow(index: Int) {
		val row = rows.removeAt(index)
		otherRowKeys.remove(row[lookupColumn])
		columns.forEach { it.removeAt(index) }
	}
	
	fun createColumn(index: Int, columnKey: Any) {
		val newColumn = listConverter.convert(rows.map { defaultValue })
		columns.add(index, newColumn)
		rows.forEach { it.add(index, defaultValue) }
		otherColumnKeys[columnKey] = index
	}
	
	fun deleteColumn(index: Int, columnKey: Any) {
		columns.removeAt(index)
		rows.forEach { it.removeAt(index) }
		otherColumnKeys.remove(columnKey)
	}
	
	operator fun get(row: Int, column: Int): E {
		require(row in rows.indices) { "Row $row out of bounds" }
		require(column in columns.indices) { "Column $column out of bounds" }
		return rows[row][column]
	}
	
	operator fun get(row: Int, columnKey: Any) = this[row, otherColumnKeys[columnKey] ?: throw IllegalArgumentException("No column found with key $columnKey")]
	
	operator fun set(row: Int, column: Int, value: E) {
		require(row in rows.indices) { "Row $row out of bounds" }
		require(column in columns.indices) { "Column $column out of bounds" }
		val oldValue = rows[row][column]
		if (oldValue != value) otherRowKeys.remove(oldValue)
		rows[row][column] = value
		columns[column][row] = value
		otherRowKeys[value] = row
	}
	
	operator fun set(row: Int, columnKey: Any, value: E) {
		require(row in rows.indices) { "Row $row out of bounds" }
		val column = otherColumnKeys[columnKey] ?: throw IllegalArgumentException("No column found with key $columnKey")
		this[row, column] = value
	}
	
	operator fun set(rowKey: E, column: Int, value: E) {
		require(column in columns.indices) { "Column $column out of bounds" }
		val row = otherRowKeys[rowKey] ?: throw IllegalArgumentException("No row found with key $rowKey")
		this[row, column] = value
	}
	
	operator fun set(rowKey: E, columnKey: Any, value: E) {
		val row = otherRowKeys[rowKey] ?: throw IllegalArgumentException("No row found with key $rowKey")
		val column = otherColumnKeys[columnKey] ?: throw IllegalArgumentException("No column found with key $columnKey")
		this[row, column] = value
	}
	
	fun find(key: E, lookupColumn: Int = this.lookupColumn, column: Int): E {
		val row = columns[lookupColumn].indexOf(key)
		return this[row, column]
	}
	
	fun find(key: E, lookupColumn: Int = this.lookupColumn, columnKey: Any): E {
		val row = columns[lookupColumn].indexOf(key)
		val column = otherColumnKeys[columnKey] ?: throw IllegalArgumentException("No column found with key $columnKey")
		return this[row, column]
	}
	
	fun find(key: E, lookupColumnKey: Any, column: Int): E {
		val row = columns[otherColumnKeys[lookupColumnKey] ?: throw IllegalArgumentException("No column found with key $lookupColumnKey")].indexOf(key)
		return this[row, column]
	}
	
	fun find(key: E, lookupColumnKey: Any, columnKey: Any): E {
		val row = columns[otherColumnKeys[lookupColumnKey] ?: throw IllegalArgumentException("No column found with key $lookupColumnKey")].indexOf(key)
		val column = otherColumnKeys[columnKey] ?: throw IllegalArgumentException("No column found with key $columnKey")
		return this[row, column]
	}
	
	fun findAndSet(key: E, lookupColumn: Int = this.lookupColumn, column: Int, value: E) {
		val row = columns[lookupColumn].indexOf(key)
		this[row, column] = value
	}
	
	fun findAndSet(key: E, lookupColumn: Int = this.lookupColumn, columnKey: Any, value: E) {
		val row = columns[lookupColumn].indexOf(key)
		val column = otherColumnKeys[columnKey] ?: throw IllegalArgumentException("No column found with key $columnKey")
		this[row, column] = value
	}
	
	fun findAndSet(key: E, lookupColumnKey: Any, column: Int, value: E) {
		val row = columns[otherColumnKeys[lookupColumnKey] ?: throw IllegalArgumentException("No column found with key $lookupColumnKey")].indexOf(key)
		this[row, column] = value
	}
	
	fun findAndSet(key: E, lookupColumnKey: Any, columnKey: Any, value: E) {
		val row = columns[otherColumnKeys[lookupColumnKey] ?: throw IllegalArgumentException("No column found with key $lookupColumnKey")].indexOf(key)
		val column = otherColumnKeys[columnKey] ?: throw IllegalArgumentException("No column found with key $columnKey")
		this[row, column] = value
	}
	
	fun findRowIndex(key: E, lookupColumn: Int = this.lookupColumn) = columns[lookupColumn].indexOf(key)
	
	fun findRowIndex(key: E, lookupColumnKey: Any) = findRowIndex(key, otherColumnKeys[lookupColumnKey] ?: throw IllegalArgumentException("No column found with key $lookupColumnKey"))
	
	fun findRowIndex(key: E, header: D2Header) = findRowIndex(key, header.header)
	
	fun findRow(key: E, lookupColumn: Int = this.lookupColumn) = rows[columns[lookupColumn].indexOf(key)]
	
	fun findRow(key: E, lookupColumnKey: Any) = findRow(key, otherColumnKeys[lookupColumnKey] ?: throw IllegalArgumentException("No column found with key $lookupColumnKey"))
	
	fun findRow(key: E, header: D2Header) = findRow(key, header.header)
	
	fun findColumnIndex(columnKey: Any) = otherColumnKeys[columnKey] ?: throw IllegalArgumentException("No column found with key $columnKey")
	
	fun findColumnIndex(header: D2Header) = findColumnIndex(header.header)
	
	fun findColumn(columnKey: Any) = columns[otherColumnKeys[columnKey] ?: throw IllegalArgumentException("No column found with key $columnKey")]
	
	fun findColumn(header: D2Header) = findColumn(header.header)
	
	fun getRowLookupValue(row: Int) = columns[lookupColumn][row]
	
	fun forEachRow(action: (Int) -> Unit) = rows.forEachIndexed { index, _ -> action(index) }
	
}