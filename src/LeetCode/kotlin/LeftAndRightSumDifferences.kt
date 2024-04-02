package LeetCode.kotlin

fun main() {
    val intArray = intArrayOf(10,4,8,3)
    println(leftRightDifference(intArray))
}

fun leftRightDifference(nums: IntArray): IntArray {

    var sum = 0
    var leftSum = 0
    var answer = IntArray(nums.size)
    for (i in  nums.indices){
        sum+= nums[i]
    }
    var rightSum = sum
    for (i in  nums.indices){
        rightSum-=nums[i]
        answer[i] = Math.abs(leftSum - rightSum)
        leftSum+=nums[i]
    }

    return answer

}