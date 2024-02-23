package LeetCode.kotlin


// arraydeki sayıları yan yana yazıp son indeksteki sayıyı birle toplayıp çıktısını ver
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
fun main() {
    val array = arrayOf(9).toIntArray()
    plusOne(array)
}

fun plusOne(digits: IntArray): IntArray {

    for (i in digits.size-1 downTo 0 ){
        if (digits[i] < 9 ){
            digits[i]++
            return digits
        }

        digits[i] = 0
    }
    val result= IntArray(digits.size+1)
    result[0] = 1
    return result
}