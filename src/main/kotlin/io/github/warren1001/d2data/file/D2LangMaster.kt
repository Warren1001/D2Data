package io.github.warren1001.d2data.file

import io.github.warren1001.d2data.lang.MultiLangString

class D2LangMaster(langs : Collection<D2Lang>) {
	
	val strings = mutableMapOf<String, MultiLangString>()
	
	init {
		require(langs.isNotEmpty()) { "Cannot make a master language file out of no language files" }
		for (lang in langs) {
			strings.putAll(lang.strings)
		}
	}
	
	operator fun get(key: String): MultiLangString = strings[key.lowercase()] ?: error("No string for key ${key.lowercase()} in master language file")
	
	fun has(key: String) = strings.containsKey(key.lowercase())

}