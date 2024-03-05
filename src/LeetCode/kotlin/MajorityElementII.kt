package LeetCode.kotlin

fun main() {

}

fun majorityElement(nums: IntArray): List<Int> {

    val result = mutableListOf<Int>()

    if (nums.isEmpty()) {
        return result
    }

    var candidate1: Int? = null
    var count1 = 0
    var candidate2: Int? = null
    var count2 = 0

    // Oylama aşaması
    for (num in nums) {
        when {
            candidate1 == num -> count1++
            candidate2 == num -> count2++
            count1 == 0 -> {
                candidate1 = num
                count1 = 1
            }
            count2 == 0 -> {
                candidate2 = num
                count2 = 1
            }
            else -> {
                count1--
                count2--
            }
        }
    }

    // Oylama sonucunda elde edilen adayların doğrulanması
    count1 = 0
    count2 = 0
    for (num in nums) {
        if (candidate1 == num) count1++
        else if (candidate2 == num) count2++
    }

    // Çoğunlukta olan adayları listeye ekleme
    if (count1 > nums.size / 3) result.add(candidate1!!)
    if (count2 > nums.size / 3) result.add(candidate2!!)

    return result
}


