package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2LvlTypes(header: String, vararg headerHistory: String): D2Header {
	
	NAME("Name"),
	ID("Id"),
	FILE_1("File 1"),
	FILE_2("File 2"),
	FILE_3("File 3"),
	FILE_4("File 4"),
	FILE_5("File 5"),
	FILE_6("File 6"),
	FILE_7("File 7"),
	FILE_8("File 8"),
	FILE_9("File 9"),
	FILE_10("File 10"),
	FILE_11("File 11"),
	FILE_12("File 12"),
	FILE_13("File 13"),
	FILE_14("File 14"),
	FILE_15("File 15"),
	FILE_16("File 16"),
	FILE_17("File 17"),
	FILE_18("File 18"),
	FILE_19("File 19"),
	FILE_20("File 20"),
	FILE_21("File 21"),
	FILE_22("File 22"),
	FILE_23("File 23"),
	FILE_24("File 24"),
	FILE_25("File 25"),
	FILE_26("File 26"),
	FILE_27("File 27"),
	FILE_28("File 28"),
	FILE_29("File 29"),
	FILE_30("File 30"),
	FILE_31("File 31"),
	FILE_32("File 32"),
	ACT("Act");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/lvltypes.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = NAME
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}