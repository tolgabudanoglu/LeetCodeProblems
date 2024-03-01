package LeetCode.kotlin

fun main() {

    println( maximumOddBinaryNumber("0101"))

}

fun maximumOddBinaryNumber(s: String): String {

    val oneCount = s.count { it == '1' }

    check(oneCount>=1)

    return StringBuilder(s.length).apply {
        repeat(oneCount - 1){
            append('1')
        }
        repeat(s.length - oneCount){
            append('0')
        }
        append('1')
    }.toString()



}