package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2MonProp(header: String, vararg headerHistory: String): D2Header {
	
	ID("Id"),
	PROP_1("prop1"),
	CHANCE_1("chance1"),
	PAR_1("par1"),
	MIN_1("min1"),
	MAX_1("max1"),
	PROP_2("prop2"),
	CHANCE_2("chance2"),
	PAR_2("par2"),
	MIN_2("min2"),
	MAX_2("max2"),
	PROP_3("prop3"),
	CHANCE_3("chance3"),
	PAR_3("par3"),
	MIN_3("min3"),
	MAX_3("max3"),
	PROP_4("prop4"),
	CHANCE_4("chance4"),
	PAR_4("par4"),
	MIN_4("min4"),
	MAX_4("max4"),
	PROP_5("prop5"),
	CHANCE_5("chance5"),
	PAR_5("par5"),
	MIN_5("min5"),
	MAX_5("max5"),
	PROP_6("prop6"),
	CHANCE_6("chance6"),
	PAR_6("par6"),
	MIN_6("min6"),
	MAX_6("max6"),
	PROP_1_NIGHTMARE("prop1 (N)"),
	CHANCE_1_NIGHTMARE("chance1 (N)"),
	PAR_1_NIGHTMARE("par1 (N)"),
	MIN_1_NIGHTMARE("min1 (N)"),
	MAX_1_NIGHTMARE("max1 (N)"),
	PROP_2_NIGHTMARE("prop2 (N)"),
	CHANCE_2_NIGHTMARE("chance2 (N)"),
	PAR_2_NIGHTMARE("par2 (N)"),
	MIN_2_NIGHTMARE("min2 (N)"),
	MAX_2_NIGHTMARE("max2 (N)"),
	PROP_3_NIGHTMARE("prop3 (N)"),
	CHANCE_3_NIGHTMARE("chance3 (N)"),
	PAR_3_NIGHTMARE("par3 (N)"),
	MIN_3_NIGHTMARE("min3 (N)"),
	MAX_3_NIGHTMARE("max3 (N)"),
	PROP_4_NIGHTMARE("prop4 (N)"),
	CHANCE_4_NIGHTMARE("chance4 (N)"),
	PAR_4_NIGHTMARE("par4 (N)"),
	MIN_4_NIGHTMARE("min4 (N)"),
	MAX_4_NIGHTMARE("max4 (N)"),
	PROP_5_NIGHTMARE("prop5 (N)"),
	CHANCE_5_NIGHTMARE("chance5 (N)"),
	PAR_5_NIGHTMARE("par5 (N)"),
	MIN_5_NIGHTMARE("min5 (N)"),
	MAX_5_NIGHTMARE("max5 (N)"),
	PROP_6_NIGHTMARE("prop6 (N)"),
	CHANCE_6_NIGHTMARE("chance6 (N)"),
	PAR_6_NIGHTMARE("par6 (N)"),
	MIN_6_NIGHTMARE("min6 (N)"),
	MAX_6_NIGHTMARE("max6 (N)"),
	PROP_1_HELL("prop1 (H)"),
	CHANCE_1_HELL("chance1 (H)"),
	PAR_1_HELL("par1 (H)"),
	MIN_1_HELL("min1 (H)"),
	MAX_1_HELL("max1 (H)"),
	PROP_2_HELL("prop2 (H)"),
	CHANCE_2_HELL("chance2 (H)"),
	PAR_2_HELL("par2 (H)"),
	MIN_2_HELL("min2 (H)"),
	MAX_2_HELL("max2 (H)"),
	PROP_3_HELL("prop3 (H)"),
	CHANCE_3_HELL("chance3 (H)"),
	PAR_3_HELL("par3 (H)"),
	MIN_3_HELL("min3 (H)"),
	MAX_3_HELL("max3 (H)"),
	PROP_4_HELL("prop4 (H)"),
	CHANCE_4_HELL("chance4 (H)"),
	PAR_4_HELL("par4 (H)"),
	MIN_4_HELL("min4 (H)"),
	MAX_4_HELL("max4 (H)"),
	PROP_5_HELL("prop5 (H)"),
	CHANCE_5_HELL("chance5 (H)"),
	PAR_5_HELL("par5 (H)"),
	MIN_5_HELL("min5 (H)"),
	MAX_5_HELL("max5 (H)"),
	PROP_6_HELL("prop6 (H)"),
	CHANCE_6_HELL("chance6 (H)"),
	PAR_6_HELL("par6 (H)"),
	MIN_6_HELL("min6 (H)"),
	MAX_6_HELL("max6 (H)"),
	EOL("*eol");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/monprop.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = ID
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}