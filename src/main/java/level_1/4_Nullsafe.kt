package level_1

import kotlin.random.Random

fun stringOrNull() : String? {
    val isNull = Random.nextBoolean()
    return if (isNull) null else "Not a null"
}

fun main() {
    val nullable : String? = stringOrNull()

    println(nullable)
    println(nullable?.length)
    println(nullable ?: "This is Null!")
}