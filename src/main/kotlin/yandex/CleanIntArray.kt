package yandex

import java.util.LinkedHashSet


class CleanIntArray {
}

fun main() {
    val originalArray = intArrayOf(5, 2, 4, 8, 8, 8)
    val set: MutableSet<Int> = LinkedHashSet()
    for (i in originalArray.indices) {
        set.add(originalArray[i])
    }
}

fun removeDupInIntArray(ints: IntArray) {
    val set: MutableSet<Int> = LinkedHashSet()
    for (i in ints.indices) {
        set.add(ints[i])
    }
    println(set)
}

//Arrays.stream(arr).distinct().toArray();