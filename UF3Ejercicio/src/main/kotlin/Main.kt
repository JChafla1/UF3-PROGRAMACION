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
        }
    }
    
}
