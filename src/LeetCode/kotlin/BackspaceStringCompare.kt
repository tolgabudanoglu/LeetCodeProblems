package LeetCode.kotlin

// # ten önceki karakteri silip iki stringi karşılastırma
fun main() {

}

fun backspaceCompare(s: String, t: String): Boolean {
    return processString(s) == processString(t)
}

fun processString(input: String): String {

    val result = StringBuilder()

    for (char in input){
        if (char == '#'){
            if (result.isNotEmpty()){
                result.deleteCharAt(result.length - 1)
            }
        }else{
            result.append(char)
        }
    }
    return result.toString()
}
