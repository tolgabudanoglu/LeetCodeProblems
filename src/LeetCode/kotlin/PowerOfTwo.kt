package LeetCode.kotlin

fun main() {
    isPowerOfTwo(0)

}

fun isPowerOfTwo(n: Int): Boolean {


    return (n > 0 && (n and (n - 1)) == 0)

}