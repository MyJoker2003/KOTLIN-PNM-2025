package Capitulo_04

fun main() {
    // Crear un arreglo de enteros
    val numbers = intArrayOf(3, 1, 4, 1, 5, 9, 2, 6)

    // Obtener el valor en un índice (si es válido)
    val element = numbers.getOrNull(2) // Devuelve el elemento o null si el índice es fuera de rango
    println("Elemento en el indice 2: $element")

    // Ordenar el arreglo
    val sortedNumbers = numbers.sortedArray()
    println("Arreglo ordenado: ${sortedNumbers.joinToString()}")

    // Obtener el valor mínimo y máximo
    println("Valor minimo: ${numbers.min()}")
    println("Valor maximo: ${numbers.max()}")
}