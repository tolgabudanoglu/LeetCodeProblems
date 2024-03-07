package LeetCode.kotlin
//bir string içindeki son kelimenin uzunluğunu bulmaya çalışan kod
fun main() {

    print(lengthOfLastWord("luffy is still joyboy"))

}

fun lengthOfLastWord(s: String): Int {
    val words = s.trim().split("\\s+".toRegex())
    return if (words.isNotEmpty()) {
        words.last().length
    } else {
        0
    }
}