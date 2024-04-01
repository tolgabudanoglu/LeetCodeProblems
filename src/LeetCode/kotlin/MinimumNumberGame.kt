package LeetCode.kotlin

fun main() {
    val array = intArrayOf(5,4,2,3)

    println(numberGame(array).toString())
}

fun numberGame(nums: IntArray): IntArray {
    nums.sort()

    // Initializing the output array.
    val arr = IntArray(nums.size)

    // Selecting the elements from the input array
    // according to the given rules.

    for (i in 1 until nums.size step 2) {
        arr[i - 1] = nums[i]
        arr[i] = nums[i - 1]
    }

    return arr
}