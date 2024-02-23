package LeetCode.kotlin


// arraydeki sayıları yan yana yazıp birle toplayıp çıktısını ver
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