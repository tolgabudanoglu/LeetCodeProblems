package LeetCode.kotlin

fun main(){

    println(isPalindrome(121))



}


fun isPalindrome(x: Int): Boolean {

    return x.toString() == x.toString().reversed()

}

