package inventoryManagement

fun String.getArguments(command: String): List<Any>? {
    val commands = command.split("  *".toRegex()).toMutableList()
    val inputs = split("  *".toRegex()).toMutableList()

    commands.forEachIndexed { index, s ->
        if (s.startsWith("?").not() || s.contains("|").not()) {
            return@forEachIndexed
        }

        val default = s.substring(s.indexOf("|") + 1, s.length)
        commands[index] = s.substring(0, s.indexOf("|"))
        val options = s.substring(1, s.indexOf("|")).split("/")
        if (options.contains(inputs.getOrNull(index))) {
            return@forEachIndexed
        }
        try {
            inputs.add(index, default)
        } catch (e: Exception) {
            return null
        }
    }
    if (commands.size != inputs.size) {
        return null
    }

    val arguments = mutableListOf<Any>()

    commands.forEachIndexed { index, s ->
        when {
            s == ":int" -> arguments.add(inputs[index].toIntOrNull() ?: return null)
            s == ":string" -> arguments.add(inputs[index])
            s.startsWith("?") -> {
                val options = s.substring(1, s.length).split("/")

                if (options.contains(inputs[index]).not()) {
                    return null
                }
                arguments.add(inputs[index])
            }
            else -> {
                if (inputs[index] != s) {
                    return null
                }
            }
        }
    }
    return arguments
}