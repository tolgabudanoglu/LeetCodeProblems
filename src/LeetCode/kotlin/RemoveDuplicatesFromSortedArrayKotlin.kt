package LeetCode.kotlin

class RemoveDuplicatesFromSortedArrayKotlin {


}


fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }

    var k = 1 // benzersiz elemanların sayısı

    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i]
            k++
        }
    }

    return k
}