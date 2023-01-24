package io.github.warren1001.d2data.utils

class SetDifference<T>(private val first: Set<T>, private val second: Set<T>) {
	
	val firstOnly = mutableSetOf<T>()
	val secondOnly = mutableSetOf<T>()
	val shared = mutableSetOf<T>()
	
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
	
}