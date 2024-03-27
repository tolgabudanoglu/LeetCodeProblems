package LeetCode.kotlin

fun main() {

}

fun smallestEvenMultiple(n: Int): Int {

    var ans :Int = 1
    while (ans % n == 0 && ans % 2 == 0  ){
        ans++
    }
    return ans
}