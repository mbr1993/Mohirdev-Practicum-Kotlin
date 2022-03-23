fun main() {
    for (i in 1..10) println(fibonacci(i))
}

fun fibonacci(number: Int): Int {
    if (number <= 1) return 1
    return fibonacci(number - 1) + fibonacci(number - 2)  //recursive function
}