package io.github.warren1001.d2data.enums

enum class D2HitClass(val header: String) {
	
	HIT_CLASS("Hit Class"),
	CODE("Code");
	
	companion object {
		const val SHEET_NAME = "hitclass"
		val HEADERS = values().map { it.header }
	}
	
}