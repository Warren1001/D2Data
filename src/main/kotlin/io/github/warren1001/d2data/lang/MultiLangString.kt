package io.github.warren1001.d2data.lang

class MultiLangString(private val key: String, private val strings: MutableMap<String, String>): LangString {
	
	override fun get(lang: String) = strings[lang] ?: error("No string in $key for language $lang")
	
	//override fun getKey() = key
	
	override fun append(other: LangString, separator: String) {
		for (entry in strings) {
			strings[entry.key] = entry.value + separator + other.get(entry.key)
		}
	}
	
	override fun clone(/*key: String*/) = MultiLangString(key, strings.toMutableMap())
	
	override fun map(transform: (String, String) -> String): MultiLangString {
		val newStrings = mutableMapOf<String, String>()
		for (entry in strings) {
			newStrings[entry.key] = transform(entry.key, entry.value)
		}
		return MultiLangString(key, newStrings)
	}
	
	fun getStrings() = strings.toMutableMap()
	
	override fun toString() = "MultiLangString[key='$key',strings=$strings]"
	
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is MultiLangString) return false
		
		if (key != other.key) return false
		if (strings != other.strings) return false
		
		return true
	}
	
	override fun hashCode(): Int {
		var result = key.hashCode()
		result = 31 * result + strings.hashCode()
		return result
	}
	
}