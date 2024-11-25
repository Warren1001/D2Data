package io.github.warren1001.d2data.file

import io.github.warren1001.d2data.enums.sheet.D2Header

interface D2File {
	
	operator fun get(key: String, header: D2Header): String
	
	operator fun get(key: String, lookupColumnName: String, columnName: String): String
	
}