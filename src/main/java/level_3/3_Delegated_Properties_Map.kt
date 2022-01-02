package level_3

fun main() {

    val map = mapOf(
        "name" to "Harry",
        "age" to 20
    )

    val name by map
    val age by map

    println(name)
    println(age)

}