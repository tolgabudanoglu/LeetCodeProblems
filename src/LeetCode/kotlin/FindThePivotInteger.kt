package LeetCode.kotlin


fun main() {

    print( pivotInteger(8))

}

/*fun pivotInteger(n: Int): Int {
    var firstSum = 0
    var secondSum = 0
    for(i in 1 .. n){
        firstSum = 0
        for(j in 1 .. i){
            firstSum += j
        }
        secondSum = 0
        for(t in i..n){
            secondSum += t
        }
        if(firstSum == secondSum){
            return i
        }
    }
    return -1
}*/

fun pivotInteger(n: Int): Int {
    val totalSum = n * (n + 1) / 2
    var leftSum = 0

    for (i in 1..n) {
        leftSum += i
        if (leftSum == totalSum - leftSum + i) {
            return i
        }
    }

    return -1
}