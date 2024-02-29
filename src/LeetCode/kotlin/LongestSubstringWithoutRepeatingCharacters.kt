package LeetCode.kotlin

fun main() {

    println( lengthOfLongestSubstring("abcabcbb"))
    println( lengthOfLongestSubstring2("abcabcbb"))

}

fun lengthOfLongestSubstring(s: String): Int {

    val charArray = s.toCharArray()
    var result = 0
    var leftIndex = 0
    val set = HashSet<Char>()

    for (rightIndex in charArray.indices){
        while (set.contains(charArray[rightIndex])){
            set.remove(charArray[leftIndex])
            leftIndex++
        }
        set.add(charArray[rightIndex])
        result = maxOf(result,rightIndex - leftIndex + 1)

    }

    return result



}

fun lengthOfLongestSubstring2(s: String): Int {
    val set = HashSet<Char>()
    var result = 0
    var left = 0
    var right = 0

    while (s.length > right) {
        if (set.contains(s[right])) {
            set.remove(s[left])
            left++
        } else {
            set.add(s[right])
            right++
            result = if (result < set.size) set.size else result
        }
    }
    return result
}