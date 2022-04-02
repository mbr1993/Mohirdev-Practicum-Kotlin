fun main() {

    val arrayList = ArrayList<String>(3)

    println("Enter a name:")
    arrayList.add(readLine()!!)

    println("Enter a name:")
    arrayList.add(readLine()!!)

    println("Enter a name:")
    arrayList.add(readLine()!!)

    for (i in arrayList) println(i)
    println()
    for (i in 0 until arrayList.size) println(i)

}