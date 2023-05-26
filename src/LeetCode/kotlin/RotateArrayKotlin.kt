package LeetCode.kotlin

fun main() {


}

fun rotate(nums: IntArray, k: Int){

    var rotatedK =k % nums.size

    var result = IntArray(nums.size)

    for (i in 0 until rotatedK){
        result[i] = nums[nums.size - rotatedK + i]
    }
    var j = 0
    for (i in rotatedK until nums.size) {
        result[i] = nums[j]
        j++
    }

    result.copyInto(nums)


}


