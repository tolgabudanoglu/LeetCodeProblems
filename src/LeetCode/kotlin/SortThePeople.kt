package LeetCode.kotlin

fun main() {
    var array = intArrayOf(180,165,170)
    var array2 = arrayOf("Mary","John","Emma")
    println(sortPeople(array2,array))
}

fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {

    val people = mutableListOf<Pair<String, Int>>()
    for (i in names.indices) {
        people.add(names[i] to heights[i])
    }


    val sortedPeople = people.sortedByDescending { it.second }


    return sortedPeople.map { it.first }.toTypedArray()
}
