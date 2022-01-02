package level_1

import kotlin.random.Random

fun main() {

    var stop = false
    while (stop) {
        println("Hello!")
        stop = Random.nextBoolean()
    }

    (0..10).forEach {
        println(it)
    }

    repeat(10) { index ->
        println(index)
    }

}