package yandex

class Brackets {
}

fun main() {
    val one = readLine()!!.toCharArray()
    val two = readLine()!!.toCharArray()

    if (one.lastIndex != two.indices.last) {
        println("not match att all")
        println("${one} not match at all to ${two}}")
        return
    }

    two.reverse()
    if (one.contentEquals(two)) {
        println("This is anagram")
        println("${one} == ${two}} MATCH")
        return
    } else {
        println("${one} not match at all to ${two}}")
        return
    }
}
