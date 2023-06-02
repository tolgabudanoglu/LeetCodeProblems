package LeetCode.kotlin

class AddDigitsKotlin {
}

fun addDigits(num: Int): Int {
    var number = num
    while (number >= 10) {
        var sum = 0
        while (number != 0) {
            sum += number % 10
            number /= 10
        }
        number = sum
    }
    return number
}