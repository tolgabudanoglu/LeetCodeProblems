package LeetCode.kotlin

fun main() {




}

fun rearrangeArray(nums: IntArray): IntArray {

    val positiveNumbers = ArrayList<Int>()
    val negativeNumbers = ArrayList<Int>()
    val answer = ArrayList<Int>()

    for (num in nums ){
        if (num > 0){
            positiveNumbers.add(num)
        }else{
            negativeNumbers.add(num)
        }
    }

    var index1 = 0
    var index2 =0

    while (index2 <nums.size/2){
        answer.add(positiveNumbers.get(index1))
        index1++
        answer.add(negativeNumbers.get(index2))
        index2++
    }

    return answer.toIntArray()

}