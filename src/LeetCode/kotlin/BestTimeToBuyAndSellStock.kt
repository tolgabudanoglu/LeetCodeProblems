package LeetCode.kotlin

//Size fiyatların[i] belirli bir hisse senedinin i'inci gündeki fiyatı olduğu bir dizi fiyatlar veriliyor.
//
//Bir hisse senedi satın almak için tek bir gün seçip, o hisse senedini satmak için gelecekte farklı bir gün seçerek kârınızı en üst düzeye çıkarmak istiyorsunuz.
//
//Bu işlemden elde edebileceğiniz maksimum karı iade edin. Herhangi bir kar elde edemiyorsanız 0 değerini döndürün.
fun main() {

    val array = intArrayOf(7,1,5,3,6,4)
    println(maxProfit(array))

}

fun maxProfit(prices: IntArray): Int {

    var buyPrice =prices[0]
    var maxProfit = 0
    for (i in 1 until  prices.size) {
        val sellPrice = prices[i]
        val currentProfit = sellPrice - buyPrice

        maxProfit = maxOf(maxProfit,currentProfit)
        buyPrice = minOf(buyPrice,sellPrice)
    }
    return maxProfit
}
