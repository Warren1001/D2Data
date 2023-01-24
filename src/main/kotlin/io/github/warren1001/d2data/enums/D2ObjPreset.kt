package io.github.warren1001.d2data.enums

enum class D2ObjPreset(val header: String) {
	
	INDEX("Index"),
	ACT("Act"),
	OBJECT_CLASS("ObjectClass"),
	NOTES("*Notes"),
	EOL("*eol");
	
	companion object {
		const val SHEET_NAME = "objpreset"
		val HEADERS = values().map { it.header }
	}
	
}