package io.github.warren1001.d2data.enums

enum class D2ItemRatio(val header: String) {
	
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
		const val SHEET_NAME = "itemratio"
		val HEADERS = values().map { it.header }
	}
	
}