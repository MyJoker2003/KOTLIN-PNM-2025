package Capitulo_04

fun main() {
    // Crear una matriz vacía de tipo String
    val empty = emptyArray<String>()
    println("Arreglo vacio: ${empty.joinToString()}") // Imprime: Arreglo vacío:

    // Crear una matriz con tamaño 5 y valores iniciales
    val strings = Array<String>(size = 5) { index -> "Item #$index" }
    println("Arreglo con valores iniciales: ${strings.joinToString()}") // Imprime: [Item #0, Item #1, Item #2, Item #3, Item #4]
    println("Tamano del arreglo: ${strings.size}") // Imprime: 5

    // Usar get() y set() para modificar el arreglo
    strings.set(2, "ChangedItem")
    println("Elemento en el indice 2 despues de set(): ${strings.get(2)}") // Imprime: ChangedItem

    // Usar la notación de corchetes para acceder y modificar el valor
    strings[2] = "ChangedAgain"
    println("Elemento en el indice 2 despues de usar corchetes: ${strings[2]}") // Imprime: ChangedAgain
}
