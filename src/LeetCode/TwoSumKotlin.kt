package LeetCode

import java.util.*

fun main(){


    val nums = intArrayOf(2,7,11,15)
    val target = 9
    println(Arrays.toString(twoSumKotlin(nums,target)))



}

fun twoSumKotlin(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices){
        for (j in nums.indices){
            if (nums[i]+nums[j] == target && i!=j){

                return intArrayOf(i,j)
            }
        }
    }

    throw IllegalStateException("hata")


}
