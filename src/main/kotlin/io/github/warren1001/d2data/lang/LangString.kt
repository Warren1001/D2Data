package io.github.warren1001.d2data.lang

interface LangString {
	
	fun get(lang: String): String
	
	//fun getKey(): String
	
	fun append(other: LangString, separator: String)
	
	fun clone(/*key: String = getKey()*/): LangString
	
	fun map(transform: (String, String) -> String): LangString
	
}