package LeetCode.kotlin


fun main() {

}

fun sortedSquares(nums: IntArray): IntArray {

    var arrayList = arrayListOf<Int>()
    for (num in nums){
        arrayList.add(num*num)
    }
    arrayList.sort()

    return arrayList.toIntArray()

}