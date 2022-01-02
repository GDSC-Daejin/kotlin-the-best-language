package level_3

enum class Color(val value: String) {
    RED("#ff0000"), GREEN("#00ff00"), BLUE("#0000ff")
}

enum class Shape {
    OVAL, RECT, TRIANGLE
}

fun main() {
    val colors = Color.values()
    val shape = Shape.values()

    println(colors.map { it.value })
    println(shape.map { it.name })
}