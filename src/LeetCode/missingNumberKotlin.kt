package LeetCode

fun main() {


}
fun missingNumber(nums: IntArray): Int {
    var n = nums.size
    var sum = n * (n + 1) / 2
    for (i in nums){
        sum-=i
    }
    return sum


}



