package level_1

import kotlin.random.Random

fun main() {

    // If
    val name = "Harry"
    if (name.isNotEmpty()) {
        println("Name not empty!")
    }

    if (name.isNotEmpty()) println("Name not empty!")



    // When
    val randomInt = Random.nextInt()

    when (randomInt) {
        in 0 .. 1000 -> println("Small")
        in 1001 .. 2000 -> println("Medium")
        else -> println("Large")
    }

    when ( val innerRandomInt = Random.nextInt()) {
        in 0 .. 1000 -> println("$innerRandomInt is Small")
        in 1001 .. 2000 -> println("$innerRandomInt is Medium")
        else -> println("Large")
    }

}