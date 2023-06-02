package LeetCode.kotlin

class threeSumKotlin {

}

fun threeSum(nums: IntArray): List<List<Int>> {
    val result: MutableList<List<Int>> = mutableListOf()

    // Sorting the array
    nums.sort()

    for (i in 0 until nums.size - 2) {
        // Skip duplicate values for the first element
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue
        }

        var left = i + 1
        var right = nums.size - 1

        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]

            when {
                sum == 0 -> {
                    result.add(listOf(nums[i], nums[left], nums[right]))

                    // Skip duplicate values for the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--
                    }

                    left++
                    right--
                }
                sum < 0 -> left++
                else -> right--
            }
        }
    }

    return result
}


