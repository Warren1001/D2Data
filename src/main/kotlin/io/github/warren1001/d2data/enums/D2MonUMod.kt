package io.github.warren1001.d2data.enums

enum class D2MonUMod(val header: String) {
	
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
	}
	
}