/*He usado la data class debido al ahorro de codigo que me proporcionaria hacer
* una class normal, ya que esta clase me proporciona implementaciones por defecto
* para funciones como "equals()", "hashCode()" y cosas asi */

data class Item(
    // Atributos
    val id: Int,
    val nom: String,
    val tipus: String,
    val valor: Int,
    val pes: Double
    
)
