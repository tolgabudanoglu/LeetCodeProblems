package LeetCode.kotlin

fun main() {
    isPowerOfTwo(0)

}

fun isPowerOfTwo(n: Int): Boolean {

    if (n == 1){
        return true
    }
    return (n > 0 && (n and (n - 1)) == 0)

}