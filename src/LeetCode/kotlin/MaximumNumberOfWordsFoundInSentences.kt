package LeetCode.kotlin


// cümlelerden oluşan bir dizi veriliyor. en çok kelimesi olan cümlenin kelime sayısı dönüyor.
fun main() {

}

fun mostWordsFound(sentences: Array<String>): Int {

    var ans = 0
    for (sentence in sentences.indices){
        var charArray = sentences[sentence].split(" ")
        var charSize = charArray.size
        if (charSize > ans){
            ans = charSize
        }
    }
    return ans
}