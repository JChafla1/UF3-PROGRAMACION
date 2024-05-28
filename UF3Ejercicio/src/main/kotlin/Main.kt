import java.io.File

fun cargarInterfazUsuario(nombreFitxero: String): String {
    return File(nombreFitxero).readText()
}

fun main() {
    val inventory = Inventory()
    val menu = cargarInterfazUsuario("menu.txt")

    // Agregar elementos al inventario
    inventory.afegirItem(Item(1, "Espada", "Arma", 100, 2.5))
    inventory.afegirItem(Item(2, "Escudo", "Armadura", 150, 5.0))
    inventory.afegirItem(Item(3, "Poción de Vida", "Poción", 50, 0.1))

    // Guardar el inventario en un archivo JSON
    inventory.guardarInventarioAJson("inventario.json")

    // Cargar el inventario desde el archivo JSON
    inventory.cargarInventarioDesDeJson("inventario.json")

    // Mostrar el inventario cargado
    println("Inventario cargado:")
    inventory.obtenerTodosLosItems().forEach { println(it) }
    
}
