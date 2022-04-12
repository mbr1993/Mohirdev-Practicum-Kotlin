package inventoryManagement

import com.google.gson.Gson
import inventoryManagement.data.Client
import java.io.File

object Repository {

    private val clientFile = File("/home/mbr/IdeaProjects/Mohirdev-Practicum-Kotlin/src/inventoryManagement/files/clientsFile.json")
    private val gson = Gson()

    init {
        if (clientFile.canRead().not()) {
            clientFile.createNewFile()
        }
    }

    private val clients =
        gson.fromJson(clientFile.readText(), Array<Client>::class.java)?.toMutableList() ?: mutableListOf()

    fun add(client: Client) {
        client.id = (clients.lastOrNull()?.id ?: 0) + 1
        clients.add(client)
        clientFile.writeText(gson.toJson(clients))
    }

    fun delete(id: Int) {
        clients.removeIf {
            it.id == id
        }
        clientFile.writeText(gson.toJson(clients))
    }

    fun getClient(): List<Client> {
        return clients
    }

//    fun deleteClient(id: Int) {
//        val deletableClient: Client = clients.firstOrNull { it.id = id }
//        deletableClient.let { client ->
//            clients.remove(client)
//        }
//    }


}