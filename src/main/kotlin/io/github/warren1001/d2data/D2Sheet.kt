package io.github.warren1001.d2data

import java.io.File

abstract class D2Sheet {
	
	val name: String
	
	protected val manager: D2Sheets
	private val headers: List<String>
	private val columnLookup: MutableMap<String, Int> = mutableMapOf()
	//private val sheetLookup: MutableMap<String, List<String>> = mutableMapOf()
	private val data: List<List<String>>
	
	constructor(manager: D2Sheets, dir: File, fileName: String): this(manager, File(dir.path, if (fileName.endsWith(".txt")) fileName else "$fileName.txt"))
	
	constructor(manager: D2Sheets, file: File) {
		this.name = file.nameWithoutExtension
		this.manager = manager
		val lines = file.readLines().toMutableList()
		headers = lines.removeFirst().split("\t")
		headers.forEachIndexed { i, column -> columnLookup[column] = i }
		//println(lines.size)
		data = lines.map { it.split("\t") }.toMutableList()
		//println(sheetLookup.size)
	}
	
	private fun findValue(key: String, header: Int): String? {
		return data.firstOrNull { it[0] == key }?.get(header)
	}
	
	fun getValue(key: String, header: String): String? {
		val index = columnLookup[header] ?: throw IllegalArgumentException("Header $header not found in sheet $name")
		return findValue(key, index)
	}
	
	fun getValue(row: Int, header: String): String? {
		val index = columnLookup[header] ?: throw IllegalArgumentException("Header $header not found in sheet $name")
		return data[row][index]
	}
	
	fun getHeaders(): List<String> {
		return headers
	}
	
	abstract fun getTrueHeaders(): List<String>
	
	/*fun getSheetLookup(): Map<String, List<String>> {
		return sheetLookup
	}*/
	
	fun forEach(action: (index: Int) -> Unit) {
		data.forEachIndexed { index, list -> if (list[0].isNotEmpty() && list[0].lowercase() != "expansion") action(index) }
		//data.filter { it[0].isNotEmpty() && it[0].lowercase() != "expansion" }.forEach(action)
	}
	
	fun verify(): Boolean {
		val diff = compareHeaders(getTrueHeaders())
		return diff[0].isNotEmpty() || diff[1].isNotEmpty()
	}
	
	private fun compareHeaders(headers: List<String>): List<MutableList<Int>> {
		//val headers = getTrueHeaders()
		val skippableHeaders: List<MutableList<Int>> = listOf(mutableListOf(), mutableListOf()) // old, new
		if (headers != this.headers) {
			var oi = 0
			var ni = 0
			while (true) {
				if (oi == headers.size) {
					if (ni != this.headers.size) println("[$name] New header(s): ${this.headers.subList(ni, this.headers.size).joinToString(", ")}")
					for (i in ni until this.headers.size) {
						skippableHeaders[1].add(i)
					}
					break
				}
				if (ni == this.headers.size) {
					if (oi != headers.size) println("[$name] Removed header(s): ${headers.subList(oi, headers.size).joinToString(", ")}")
					for (i in oi until headers.size) {
						skippableHeaders[0].add(i)
					}
					break
				}
				val o = headers[oi]
				val n = this.headers[ni]
				//println("old: $o, new: $n")
				if (headers[oi] != this.headers[ni]) {
					val i = checkRemainingListForValueAtIndex(this.headers, headers[oi])
					if (i == -1) {
						println("[$name] Removed/renamed header: ${headers[oi]}")
						skippableHeaders[0].add(oi)
						oi++
					} else {
						val o = checkRemainingListForValueAtIndex(headers, this.headers[ni])
						if (o == -1) {
							println("[$name] New/renamed header: ${this.headers[ni]}")
							skippableHeaders[1].add(ni)
							ni++
						} else {
							println("you were lazy and ignored this part, we dunno whats going on, might run into an error")
							//println("[$name] Renamed header: ${headers[oi]} -> ${this.headers[ni]}")
							//skippableHeaders[0].add(oi)
							//skippableHeaders[1].add(ni)
							oi++
							ni++
						}
					}
				} else {
					oi++
					ni++
				}
			}
		}
		return skippableHeaders
	}
	
	private fun checkRemainingListForValueAtIndex(list: List<String>, value: String): Int {
		return list.indexOfFirst { it == value }
	}
	
	fun compare(newSheet: D2Sheet) {
		val curr = data.toMutableList()
		val new = newSheet.data.toMutableList()
		val skippableHeaders: List<MutableList<Int>> = newSheet.compareHeaders(headers)
		for (i in curr.indices) {
			val replacement = curr[i].toMutableList()
			skippableHeaders[0].sortedDescending().forEach { replacement.removeAt(it) }
			curr[i] = replacement
		}
		for (i in new.indices) {
			val replacement = new[i].toMutableList()
			skippableHeaders[1].sortedDescending().forEach { replacement.removeAt(it) }
			new[i] = replacement
		}
		if (curr.size - new.size > 0) {
			println("upgrade this to how the new > old one works idiot")
			curr.forEachIndexed { index, values ->
				if (index >= new.size) {
					println("[$name] Old row ${index + 1} (${data[index][0]})\n${listRow(data[index], headers)}")
				} else if (values != new[index]) {
					println("[$name] Modified Row ${index + 1} (${data[index][0]})\n${findDifferences(values, new[index])}")
				}
			}
		} else if (new.size - curr.size > 0) {
			var oi = 0
			var ni = 0
			while (true) {
				if (oi == curr.size) {
					for (i in ni until new.size) {
						println("[$name] New row ${i + 1} (${newSheet.data[i][0]})\n${listRow(newSheet.data[i], newSheet.headers)}")
					}
					break
				}
				if (ni == new.size) {
					for (i in oi until curr.size) {
						println("[$name] Removed row ${i + 1} (${data[i][0]})\n${listRow(data[i], headers)}")
					}
					break
				}
				if (curr[oi][0] != new[ni][0]) {
					val i = newSheet.findRowIndex(curr[oi][0])
					if (i == -1) {
						println("[$name] Removed row ${oi + 1} (${data[oi][0]})\n${listRow(data[oi], headers)}")
						oi++
					} else {
						val o = findRowIndex(new[ni][0])
						if (o == -1) {
							println("[$name] New row ${ni + 1} (${newSheet.data[ni][0]})\n${listRow(newSheet.data[ni], newSheet.headers)}")
							ni++
						} else {
							println("you were lazy and ignored this part, we dunno whats going on, might run into an error")
							//println("[$name] Renamed row ${oi + 1} (${data[oi][0]}) -> ${ni + 1} (${newSheet.data[ni][0]})\n${findDifferences(curr[oi], new[ni])}")
							oi++
							ni++
						}
						//println("[$name] New row ${ni + 1} (${newSheet.data[ni][0]})\n${listRow(newSheet.data[ni], newSheet.headers)}")
					}
					//println("[$name] Modified Row ${ni + 1} (${newSheet.data[ni][0]})\n${findDifferences(curr[oi], new[ni])}")
				} else if (curr[oi] != new[ni]) {
					println("[$name] Modified Row ${ni + 1} (${newSheet.data[ni][0]})\n${findDifferences(curr[oi], new[ni])}")
					oi++
					ni++
				} else {
					oi++
					ni++
				}
			}
			/*new.forEachIndexed { index, values ->
				if (index >= curr.size) {
					println("[$name] New row ${index + 1} (${newSheet.data[index][0]})\n${listRow(newSheet.data[index], newSheet.headers)}")
				} else if (values != data[index]) {
					println("[$name] Modified Row ${index + 1} (${newSheet.data[index][0]})\n${findDifferences(curr[index], values)}")
				}
			}*/
		} else {
			curr.forEachIndexed { index, values ->
				if (values != new[index]) {
					println("[$name] Modified Row ${index + 1} (${data[index][0]})\n${findDifferences(values, new[index])}")
				}
			}
		}
	}
	
	private fun findRowIndex(value: String): Int {
		return data.indexOfFirst { it[0] == value }
	}
	
	private fun findDifferences(oldValues: List<String>, newValues: List<String>): String {
		val builder = StringBuilder("\t")
		oldValues.forEachIndexed { index, value ->
			val header = headers[index]
			if (value != newValues[index]) {
				builder.append("$header:'$value'->'${newValues[index]}'\n\t")
			}
		}
		return builder.toString().substring(0, 0.coerceAtLeast(builder.length - 2))
	}
	
	private fun listRow(data: List<String>, headers: List<String>): String {
		val builder = StringBuilder("\t")
		data.forEachIndexed { index, value ->
			if (value.isNotBlank()) builder.append("${headers[index]}:'$value'\n\t")
		}
		return builder.toString().substring(0, 0.coerceAtLeast(builder.length - 2))
	}
	
}