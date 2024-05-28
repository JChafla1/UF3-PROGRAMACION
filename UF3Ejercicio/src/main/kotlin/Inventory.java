/*Esta vez creo una clase normal*/

import kotlinx.serialization.Serializable

@Serializable
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

  // Obtener un elemento del inventario
    fun obtenerItem(id: Int): Item? {
        return items.find { it.id == id }
    }

  // Obtener todos los elementos del inventario
    fun obtenerTodosLosItems(): List<Item> {
        return items.toList()
    }

}
