package io.github.warren1001.d2data.enums

enum class D2BodyLocs(val header: String) {
	
	BODY_LOCATION("Body Location"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "bodylocs"
		val HEADERS = values().map { it.header }
	}
	
}