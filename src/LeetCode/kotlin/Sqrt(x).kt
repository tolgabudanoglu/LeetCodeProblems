package LeetCode.kotlin

//sayının karekökünü bulma
fun main() {

    println(mySqrt(64))

}

fun mySqrt(x: Int): Int {
    if (x <= 1) return x // x 1'den küçük veya eşitse, x'i direk döndür

    var left = 1 // Arama aralığının sol sınırı 1
    var right = x // Arama aralığının sağ sınırı x'e eşit

    while (left <= right) { // Sol sınır sağ sınırdan küçük veya eşit olduğu sürece
        val mid = left + (right - left) / 2 // Orta değeri hesapla
        val square = mid.toLong() * mid.toLong() // Orta değerin karesini hesapla (taşmaları önlemek için Long'a çevir)

        if (square == x.toLong()) return mid.toInt() // Eğer karesi x'e eşitse, orta değeri döndür

        if (square < x) { // Eğer karesi x'ten küçükse
            left = mid + 1 // Arama aralığının sol sınırını orta değerin bir fazlası yap
        } else { // Eğer karesi x'ten büyükse
            right = mid - 1 // Arama aralığının sağ sınırını orta değerin bir eksiği yap
        }
    }

    return right.toInt() // Sonuç olarak sağ sınırı döndür (karekök x'ten küçük olduğu için)
}

