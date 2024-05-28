/*Esta vez creo una clase normal*/
/*Estuve un buen rato viendo porque no m funcionaba, y era porque habia hecho un javaclass*/

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import java.io.File

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


    // Método para guardar el inventario en un archivo JSON
    fun guardarInventarioAJson(nombreFitxero: String) {
        val json = Json(JsonConfiguration.Stable)
        val jsonString = json.stringify(items)
        File(nombreFitxero).writeText(jsonString)
    }

    // Método para cargar el inventario desde un archivo JSON
    fun cargarInventarioDesDeJson(nombreFitxero: String) {
        val json = Json(JsonConfiguration.Stable)
        val jsonString = File(nombreFitxero).readText()
        val itemsFromJson = json.parse(Item.serializer().list, jsonString)
        items.clear()
        items.addAll(itemsFromJson)
    }


    // Agregar nuevo item
    fun agregarNuevoItem(id: Int, nombre: String, tipo: String, valor: Int, peso: Double) {
        val nouItem = Item(id, nombre, tipo, valor, peso)
        items.add(nouItem)
    }

    // Eliminar item item
    fun eliminarItemPorId(id: Int): Boolean {
        return items.removeIf { it.id == id }
    }

    // Buscar Items
    fun buscarItemsPorNombre(nombre: String): List<Item> {
        return items.filter { it.nombre.equals(nombre, ignoreCase = true) }
    }

    fun buscarItemsPorTipo(tipo: String): List<Item> {
        return items.filter { it.tipo.equals(tipo, ignoreCase = true) }
    }

    // Listar Items
    fun listarTodosLosItems(): List<Item> {
        return items.toList()
    }


    // Calcular Valor
    fun calcularValorTotal(): Int {
        return items.sumBy { it.valor }
    }

    // CalcularPeso
    fun calcularPesoTotal(): Double {
        return items.sumByDouble { it.peso }
    }

    // Encontrar el item mas valisoso
    fun encontrarItemMasValioso(): Item? {
        return items.maxByOrNull { it.valor }
    }

    // Encontrar el item mas pesado
    fun encontrarItemMasPesado(): Item? {
        return items.maxByOrNull { it.peso }
    }

}
