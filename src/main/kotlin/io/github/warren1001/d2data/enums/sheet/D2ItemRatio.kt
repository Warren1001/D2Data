package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2ItemRatio(override val header: String): D2Header {
	
	FUNCTION("Function"),
	VERSION("Version"),
	UBER("Uber"),
	CLASS_SPECIFIC("Class Specific"),
	UNIQUE("Unique"),
	UNIQUE_DIVISOR("UniqueDivisor"),
	UNIQUE_MIN("UniqueMin"),
	RARE("Rare"),
	RARE_DIVISOR("RareDivisor"),
	RARE_MIN("RareMin"),
	SET("Set"),
	SET_DIVISOR("SetDivisor"),
	SET_MIN("SetMin"),
	MAGIC("Magic"),
	MAGIC_DIVISOR("MagicDivisor"),
	MAGIC_MIN("MagicMin"),
	HI_QUALITY("HiQuality"),
	HI_QUALITY_DIVISOR("HiQualityDivisor"),
	NORMAL("Normal"),
	NORMAL_DIVISOR("NormalDivisor");
	
	companion object {
		val FILE_PATH = "global/excel/itemratio.txt".properSeparator()
		val HEADERS = values().map { it.header }
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = null
			override fun isHardcode() = HARDCODE
		}
	}
	
}