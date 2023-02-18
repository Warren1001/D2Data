package io.github.warren1001.d2data.utils

interface ListConverter {
	
	fun <E> convert(list: List<E>): MutableList<E>
	
}