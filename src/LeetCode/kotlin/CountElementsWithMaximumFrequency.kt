package LeetCode.kotlin
//tekrar eden eleman sayısını bulma
fun main() {

    print(maxFrequencyElements(intArrayOf(1,2,2,3,1,4)))

}

fun maxFrequencyElements(nums: IntArray): Int {
    var maxFrequency = 0
    var result = 0

    for (i in 0 until nums.size) {
        var frequency = 0

        for (j in 0 until nums.size) {
            if (nums[i] == nums[j]) {
                frequency++
            }
        }

        if (frequency > maxFrequency) {
            maxFrequency = frequency
            result = 1
        } else if (frequency == maxFrequency && frequency > 0) {
            result++
        }
    }

    return result
}
