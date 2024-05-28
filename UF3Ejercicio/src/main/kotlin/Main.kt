
fun main() {
    val inventory = Inventory()

    // Agregar elementos al inventario
    inventory.afegirItem(Item(1, "Espada", "Arma", 100, 2.5))
    inventory.afegirItem(Item(2, "Escudo", "Armadura", 150, 5.0))
    inventory.afegirItem(Item(3, "Poción de Vida", "Poción", 50, 0.1))
}
