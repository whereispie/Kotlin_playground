package yandex

abstract class BinaryLineSearch


fun main() {
    val vector = listOf(5, 1, 0, 1, 0, 1)

    var repeatTimes = 0
    var maxRepeatTimes = 0

    for (index in vector.indices) {
        if ((vector[index] == 1)) {
            repeatTimes++
        } else {
            repeatTimes = 0
        }
        if (repeatTimes > maxRepeatTimes) {
            maxRepeatTimes = repeatTimes
        }
    }
    println(maxRepeatTimes)
}
