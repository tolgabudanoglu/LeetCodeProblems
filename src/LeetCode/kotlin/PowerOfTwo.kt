package LeetCode.kotlin


//2 nin üssü sayıları bulma
fun main() {
    isPowerOfTwo(0)

}

fun isPowerOfTwo(n: Int): Boolean {


    return (n > 0 && (n and (n - 1)) == 0)

}