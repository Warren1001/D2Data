package io.github.warren1001.d2data.enums

enum class D2MonUMod(override val header: String): D2Header {
	
	UNIQUE_MOD("uniquemod"),
	ID("id"),
	ENABLED("enabled"),
	VERSION("version"),
	XFER("xfer"),
	CHAMPION("champion"),
	F_PICK("fPick"),
	EXCLUDE_1("exclude1"),
	EXCLUDE_2("exclude2"),
	CPICK("cpick"),
	CPICK_NIGHTMARE("cpick (N)"),
	CPICK_HELL("cpick (H)"),
	UPICK("upick"),
	UPICK_NIGHTMARE("upick (N)"),
	UPICK_HELL("upick (H)"),
	CONSTANTS("constants"),
	CONSTANT_DESC("*constant desc"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "monumod"
		val HEADERS = values().map { it.header }
		val UNIQUE_HEADER = UNIQUE_MOD
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getSheetName() = SHEET_NAME
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}