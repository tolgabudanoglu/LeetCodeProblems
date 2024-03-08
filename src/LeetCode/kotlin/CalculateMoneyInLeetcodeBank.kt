package LeetCode.kotlin


fun main() {

    println(totalMoney(20))

}
fun totalMoney(n: Int): Int {
    var result = 0
    var monday = 1
    var dayCount = 0

    for (i in 0 until n) {
        result += monday + dayCount
        if (++dayCount == 7) {
            dayCount = 0
            monday++
        }
    }

    return result
}
