import java.io.File

fun cargarInterfazUsuario(nombreFitxero: String): String {
    return File(nombreFitxero).readText()
}

fun main() {
    val inventory = Inventory()
    val menu = cargarInterfazUsuario("menu.txt")

    while (true) {
        println(menu)
        print("Selecciona una opció: ")
        when (readLine()?.toIntOrNull() ?: 0) {
            1 -> {
                println("Introduce los datos del item:")
                print("ID: ")
                val id = readLine()?.toIntOrNull() ?: 0
                print("Nombre: ")
                val nombre = readLine() ?: ""
                print("Tipo: ")
                val Tipo = readLine() ?: ""
                print("Valor: ")
                val valor = readLine()?.toIntOrNull() ?: 0
                print("Peso: ")
                val peso = readLine()?.toDoubleOrNull() ?: 0.0

                inventory.agregarNuevoItem(id, nombre, Tipo, valor, peso)
                println("Ítem añadido con exito")
            }
            2 -> {
                print("Introduce el ID del ítem a eliminar: ")
                val idEliminar = readLine()?.toIntOrNull() ?: 0

                if (inventory.eliminarItemPorId(idEliminar)) {
                    println("Ítem eliminado con éxito.")
                } else {
                    println("No se ha podido encontrar ningún ítem con el ID proporcionado.")
                }
            }
            3 -> {
                print("Introduce el nombre del ítem a buscar: ")
                val nomBuscar = readLine() ?: ""

                val itemsEncontrados = inventory.buscarItemsPorNombre(nomBuscar)
                if (itemsEncontrados.isNotEmpty()) {
                    println("Ítems encontrados:")
                    itemsEncontrados.forEach { println(it) }
                } else {
                    println("No se ha encontrado ningún ítem con el nombre proporcionado.")
                }
            }
            4 -> {
                print("Introduce el tipo del ítem a buscar: ")
                val tipoBuscar = readLine() ?: ""

                val itemsEncontrados = inventory.buscarItemsPorTipo(tipoBuscar)
                if (itemsEncontrados.isNotEmpty()) {
                    println("Ítems encontrados:")
                    itemsEncontrados.forEach { println(it) }
                } else {
                    println("No se ha encontrado ningún ítem con el tipo proporcionado.")
                }
            }
            5 -> {
                println("Todos los ítems en el inventario:")
                inventory.listarTodosLosItems().forEach { println(it) }
            }
            6 -> {
                println("El valor total del inventario es: ${inventory.calcularValorTotal()}")
            }
            7 -> {
                println("El peso total del inventario es: ${inventory.calcularPesoTotal()}")
            }
            8 -> {
                val itemMasValioso = inventory.encontrarItemMasValioso()
                if (itemMasValioso != null) {
                    println("El ítem más valioso es: $itemMasValioso")
                } else {
                    println("No hay ítems en el inventario.")
                }
            }
            9 -> {
                val itemMasPesado = inventory.encontrarItemMasPesado()
                if (itemMasPesado != null) {
                    println("El ítem más pesado es: $itemMasPesado")
                } else {
                    println("No hay ítems en el inventario.")
                }
            }
            10 -> {
                println("¡Adiós!")
                return
            }
            else -> println("Opción inválida. Por favor, selecciona una opción válida.")
            
        }
    }
    
}
