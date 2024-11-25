package io.github.warren1001.d2data.lang

/**
 * mostly for strings where translations aren't available
 */
class SingleLangString(private var key: String, private var string: String): LangString {
	
	override fun get(lang: String) = string
	
	//override fun getKey() = key
	
	override fun append(other: LangString, separator: String) {
		if (other is SingleLangString) {
			string += separator + other.string
		} else {
			throw UnsupportedOperationException("Only SingleLangString can be appended to SingleLangString")
		}
	}
	
	override fun clone(/*key: String*/) = SingleLangString(key, string)
	
	override fun map(transform: (String, String) -> String) = SingleLangString(key, transform(key, string))
	
	override fun toString() = "SingleLangString[key='$key',string='$string']"
	
}