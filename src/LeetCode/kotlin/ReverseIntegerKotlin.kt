package LeetCode.kotlin

fun main(){

}

fun reverse(x: Int): Int {
    var reversed = 0
    var num = x
    while (num != 0) {
        val digit = num % 10
        if (reversed > Int.MAX_VALUE / 10 || (reversed == Int.MAX_VALUE / 10 && digit > 7)) {
            return 0 // Overflow occurred
        }
        if (reversed < Int.MIN_VALUE / 10 || (reversed == Int.MIN_VALUE / 10 && digit < -8)) {
            return 0 // Underflow occurred
        }
        reversed = reversed * 10 + digit
        num /= 10
    }
    return reversed
}