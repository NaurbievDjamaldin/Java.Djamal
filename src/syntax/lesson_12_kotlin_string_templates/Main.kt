package syntax.lesson_12_kotlin_string_templates

fun main() {
    val nameOfManager = "Djamaldin Naurbiev"
    //println - вывод, $ - ссылает на переменную
    println("Hello, $nameOfManager !")

    var a = 4
    var b = 8
    println("The sum a + b = ${a + b} ")
}