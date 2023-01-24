package io.github.warren1001.d2data.enums

enum class D2HirelingDesc(val header: String) {
	
	ID("id"),
	HCIDX("*hcIdx"),
	ALTERNATE_VOICE("alternateVoice"),
	EOL("*eol");

	companion object {
		const val SHEET_NAME = "hirelingdesc"
		val HEADERS = values().map { it.header }
	}
	
}