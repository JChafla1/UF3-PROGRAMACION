/*He usado la data class debido al ahorro de codigo que me proporcionaria hacer
* una class normal, ya que esta clase me proporciona implementaciones por defecto
* para funciones como "equals()", "hashCode()" y cosas asi */

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    // Atributos, los he cambiado a castellano que me lio si no
    val id: Int,
    val nombre: String,
    val tipo: String,
    val valor: Int,
    val peso: Double
    
)
