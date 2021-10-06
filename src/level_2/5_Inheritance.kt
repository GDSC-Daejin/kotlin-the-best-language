package level_2

interface Animal {
    // Kotlin interface can declare value or variable as member
    val legCount: Int
    val name: String

    // Kotlin interface can implement function (then this function implementation is optional now)
    fun greeting() {
        val legCountAsString = if (legCount == 0) "no leg" else "$legCount legs"
        println("Hello! I'm $name, I have $legCountAsString")
    }
}

abstract class Dog : Animal {
    override val legCount: Int = 4
}

abstract class Snake : Animal {
    override val legCount: Int = 0
}

class WelshCorgi : Dog() {
    override val name: String get() = "Welsh Corgi"
}

class BlackMamba : Snake() {
    override val name: String get() = "Black Mamba"
}

fun main() {

    val welshCorgi = WelshCorgi()
    welshCorgi.greeting()

    val blackMamba = BlackMamba()
    blackMamba.greeting()

}