package Capitulo_02

fun main() {
    // Simulamos un EditText que puede ser nulo
    val textField: String? = null // Puedes cambiarlo a un valor no nulo como "Hola Mundo"

    // Usamos el operador seguro y Elvis para obtener el texto de manera segura
    val text = textField?.toString() ?: "Texto no disponible"

    // Imprimimos el resultado
    println("Texto: $text")
}

