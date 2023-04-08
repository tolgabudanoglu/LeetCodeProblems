package LeetCode

class twoSumKotlin {

    fun main(){

        print("hi")
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        print(twoSum(nums,target))



    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices){
            for (j in nums.indices){
                if (nums[i]+nums[j] == target && i!=j){

                    return intArrayOf(i,j)
                }
            }
        }

        throw IllegalStateException("hata")


    }
}