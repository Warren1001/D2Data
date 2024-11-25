package io.github.warren1001.d2data.sheet

interface ListConverter {
	
	fun <E> convert(list: List<E>): MutableList<E>
	
}