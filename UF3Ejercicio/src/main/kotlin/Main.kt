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
            
        }
    }
    
}
