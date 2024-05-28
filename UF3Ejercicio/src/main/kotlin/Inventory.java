/*Esta vez creo una clase normal*/

public class Inventory {

  // "items" propiedad privada que contiene una lista mutable de elementos
    private val items: MutableList<Item> = mutableListOf()

  // Añadir un elemento al inventario
    fun agregarItem(item: Item) {
        items.add(item)
    }

  // Eliminar elemento del inventario
    fun eliminarItem(id: Int): Boolean {
        return items.removeIf { it.id == id }
    }

}
