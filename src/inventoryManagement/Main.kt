package inventoryManagement

import inventoryManagement.data.Client

fun main() {
    while (true) {
        val input = readLine() ?: ""

        var arguments = input.getArguments("clients list")
        if (arguments != null) {
            println("ID\tNAME\tNUMBER")
            Repository.getClient().forEach {
                println(String.format("%d\t%s\t%s", it.id, it.name, it.number))
            }
            continue
        }

        arguments = input.getArguments("clients add :string :string")

        if (arguments != null) {
            val client = Client(null, arguments.first() as String, arguments[1] as String)
            Repository.add(client)
            continue
        }

        arguments = input.getArguments("clients list sort by ?id/name/number ?asc/desc|asc")
        if (arguments != null) {
            println("Listing clients sorted by ${arguments.first()} ${arguments[1]} ${arguments[2]}")
            continue
        }

        arguments = input.getArguments("clients delete :int")
        if (arguments != null) {
            Repository.delete(arguments.first() as Int)
        }

//        arguments = input.getArguments("clients remove :int")
//        if (arguments != null) {
//            Repository.deleteClient(1)
//        }
    }
}



