package LeetCode.kotlin

fun main() {
    val intArray = intArrayOf(2,3,5,1,3)
    println(kidsWithCandies(intArray,3))
}

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {

    var max = candies.max()
    var mutableBooleanList = mutableListOf<Boolean>()
    for (i in candies.indices){
        var sum = 0
        sum = candies[i] + extraCandies
        if (sum >= max){
            mutableBooleanList.add(true)


        }else{
            mutableBooleanList.add(false)

        }
    }

    return mutableBooleanList

}