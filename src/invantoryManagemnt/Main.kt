package invantoryManagemnt

fun main() {
    while (true) {
        val input = readLine() ?: ""

        var arguments = input.getArguments("clients list")
        if (arguments != null) {
            print("Listing clients")
            continue
        }

        arguments = input.getArguments("clients add :string :string")
        if (arguments != null) {
            println("Adding client name=${arguments.first()} number=${arguments[1]}")
            continue
        }

        arguments = input.getArguments("clients list sort by ?id/name/number ?asc/desc|asc")
        if (arguments != null) {
            println("Listing clients sorted by ${arguments.first()} ${arguments[1]}")
            continue
        }
    }


}