package io.github.warren1001.d2data.util

class ListDifference<T>(private val first: List<T>, private val second: List<T>) {
	
	val firstOnly = mutableListOf<T>()
	val secondOnly = mutableListOf<T>()
	val shared = mutableListOf<T>()
	
	init {
		first.forEach {
			if (it in second) {
				shared.add(it)
			} else {
				firstOnly.add(it)
			}
		}
		second.forEach {
			if (it !in first) {
				secondOnly.add(it)
			}
		}
	}
	
	fun hasNoDifference() = firstOnly.isEmpty() && secondOnly.isEmpty()
	
}