package LeetCode.kotlin

fun main() {

    println(isIsomorphic("egg","add"))

}

fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val sToT = mutableMapOf<Char, Char>()
    val tToS = mutableMapOf<Char, Char>()

    for (i in s.indices) {
        val sChar = s[i]
        val tChar = t[i]

        if (sToT.containsKey(sChar)) {
            if (sToT[sChar] != tChar) return false
        } else {
            sToT[sChar] = tChar
        }

        if (tToS.containsKey(tChar)) {
            if (tToS[tChar] != sChar) return false
        } else {
            tToS[tChar] = sChar
        }
    }

    return true
}
