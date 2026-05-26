package syntax.lesson_13_null

fun main() {
    var nullableString: String? = null // знак вопроса ? мы спрашиваем здесь строка или null
    println(nullableString?.length ?: "Null value here") // ?: - Элвис оперератор

    var nullableName: String? = "Djamal"
    println(nullableName?.uppercase() ?: "Null value here")


//    val PI:Double = 3.14
//    println("The pi constant is $PI")

    val PII:Double? = null
    println("The pi constant is ${PII ?: "3.14"}")
}