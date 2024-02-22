package LeetCode.kotlin

fun main() {

    // dizinin verilerini toplayrak targeti 0 yapmaya çalışan algoritma

    var numbers = intArrayOf(1,1,4,2,3)
    minOperations(numbers,5)

}

fun minOperations(nums: IntArray, x: Int): Int {


    var sum = 0

    for (num in nums){
        sum +=num
    }
    val target = sum - x
    var left =0
    var maxLength = -1
    var runningSum = 0

    for (right in nums.indices){
        runningSum+=nums[right]

        while (runningSum > target && left <=right){
            runningSum -= nums[left]
            left++
        }

        if (runningSum == target){
            maxLength = maxOf(maxLength,right - left +1)
        }
    }

    return if (maxLength != -1) nums.size - maxLength else -1


}