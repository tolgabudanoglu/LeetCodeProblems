package LeetCode.kotlin

fun main() {
    println(sumOfTheDigitsOfHarshadNumber(23))
}

fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {

    var temp = x
    var digit = 0
    while (temp !=0){
        digit += temp % 10
        temp /=10
    }
    if (x % digit == 0){
        return digit
    }else{
        return -1
    }

}