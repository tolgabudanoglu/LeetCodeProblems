package LeetCode.kotlin

fun main() {
    val intArray = intArrayOf(8,1,2,2,3)
    println(smallerNumbersThanCurrent(intArray))
}

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val result = mutableListOf<Int>()
    for (i in nums.indices) {
        var count = 0
        for (j in nums.indices) {
            if (i != j && nums[i] > nums[j]) {
                count++
            }
        }
        result.add(count)
    }
    return result.toIntArray()
}