package LeetCode.kotlin

//karekökü tam sayı olursa true dönecek diğer türlü false

fun main() {

    println(isPerfectSquare(16))

}
fun isPerfectSquare(num: Int): Boolean {
    if (num < 1) return false
    var left = 1
    var right = num

    while (left <= right) {
        val mid = left + (right - left) / 2
        val square = mid.toLong() * mid.toLong()

        if (square == num.toLong()) return true

        if (square < num) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    return false
}
