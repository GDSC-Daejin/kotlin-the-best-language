package level_2

interface Animal {
    // Kotlin 에서의 인터페이스는 함수가 아니어도 됩니다.
    // 컴파일 후 바이트 코드에서는 실제론 함수로 컴파일 됩니다. (int getLegCount() 로 바뀜.)
    val legCount: Int
    val name: String

    // Kotlin 에서의 인터페이스는 함수를 구현해도 됩니다.
    // 구현하는 즉시, 이 인터페이스를 상속받은 클래스에서의 이 함수의 구현은 강제가 아닌 선택이 됩니다.
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