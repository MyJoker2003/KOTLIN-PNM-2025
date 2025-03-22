package Capitulo_04

fun main() {
    // Crear un arreglo de Boolean
    val booleanArray = booleanArrayOf(true, false, true)
    println("BooleanArray: ${booleanArray.joinToString()}") // Imprime: true, false, true

    // Crear un arreglo de Byte
    val byteArray = byteArrayOf(1, 2, 3)
    println("ByteArray: ${byteArray.joinToString()}") // Imprime: 1, 2, 3

    // Crear un arreglo de Char
    val charArray = charArrayOf('a', 'b', 'c')
    println("CharArray: ${charArray.joinToString()}") // Imprime: a, b, c

    // Crear un arreglo de Double
    val doubleArray = doubleArrayOf(1.2, 5.0)
    println("DoubleArray: ${doubleArray.joinToString()}") // Imprime: 1.2, 5.0

    // Crear un arreglo de Float
    val floatArray = floatArrayOf(1.2f, 5.0f)
    println("FloatArray: ${floatArray.joinToString()}") // Imprime: 1.2, 5.0

    // Crear un arreglo de Int
    val intArray = intArrayOf(1, 2, 3)
    println("IntArray: ${intArray.joinToString()}") // Imprime: 1, 2, 3

    // Crear un arreglo de Long
    val longArray = longArrayOf(1L, 2L, 3L)
    println("LongArray: ${longArray.joinToString()}") // Imprime: 1, 2, 3

    // Crear un arreglo de Short
    val shortArray = shortArrayOf(1, 2, 3)
    println("ShortArray: ${shortArray.joinToString()}") // Imprime: 1, 2, 3
}
