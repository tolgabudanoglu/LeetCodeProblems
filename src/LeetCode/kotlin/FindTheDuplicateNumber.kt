package LeetCode.kotlin


fun main() {

}

fun findDuplicate(nums: IntArray): Int {

    var ans:Int = 0

    for (i in 0 until nums.size-1){
        for (j in i +1 until nums.size)
        if (nums[i] == nums[j]){
            ans = nums[i]
            break
        }
    }
    return ans
}