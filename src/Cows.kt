fun main() {
    for (i in 1..30) {
        println("$i: ${getCows(i)}")
    }
}

fun getCows(years: Int): Int {
    val ages = MutableList<Int>(1) { 0 }

    for (year in 0 until years) {
        for (i in ages.indices) {
            if (ages[i] >= 3) {
                ages.add(0)
            }
            ages[i]++
        }
    }
    return ages.size
}