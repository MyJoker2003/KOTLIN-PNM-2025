package Capitulo_03

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER
)
annotation class Strippable(val importanceValue: Int)