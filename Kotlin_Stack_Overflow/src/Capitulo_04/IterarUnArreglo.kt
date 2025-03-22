package Capitulo_04

fun main() {
    // Crear un arreglo de tamaño 5 con los cuadrados de los índices convertidos a cadena
    val asc = Array(5) { i -> (i * i).toString() }

    // Iterar sobre el arreglo utilizando 'in' (similar al bucle mejorado en Java)
    for (s in asc) {
        println(s) // Imprime: "0", "1", "4", "9", "16"
    }

    // Crear una matriz con valores enteros
    val a = arrayOf(1, 2, 3)
    println("Arreglo a: ${a.joinToString()}") // Imprime: [1, 2, 3]

    // Crear un arreglo usando un cierre para multiplicar los índices por 2
    val b = Array(3) { i -> i * 2 }
    println("Arreglo b: ${b.joinToString()}") // Imprime: [0, 2, 4]

    // Crear un arreglo sin inicializar, los valores serán nulos
    val c = arrayOfNulls<Int>(3)
    println("Arreglo c: ${c.joinToString()}") // Imprime: [null, null, null]
}
