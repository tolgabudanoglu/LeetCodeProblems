package LeetCode.kotlin

// string deki en büyük tek sayıyı bulma
fun main() {

    print( largestOddNumber("5256"))

}

fun largestOddNumber(num: String): String {



    for (i in num.length-1 downTo 0) {
        if (num[i].code %2 ==1){
            return num.substring(0,i+1)
        }
    }
    return ""
}