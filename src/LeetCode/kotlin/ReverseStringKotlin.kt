package LeetCode.kotlin

class ReverseStringKotlin {

}

fun reverseString(s: CharArray) {
    var left = 0
    var right = s.size - 1

    while (left < right) {
        // left ve right indislerindeki karakterleri takas et
        val temp = s[left]
        s[left] = s[right]
        s[right] = temp

        // indisleri ortaya doğru hareket ettir
        left++
        right--
    }
}