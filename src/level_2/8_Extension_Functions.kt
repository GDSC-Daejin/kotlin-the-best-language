package level_2

// String 뒤에 사용할 수 있는 함수를 만듭니다. 그래서 이름은 "확장 함수" 입니다.
fun String.removeComma(): String {
    /*
     여기서 this 는 이 함수를 실행할 객체를 나타낸 것입니다.
     하지만 굳이 쓰지 않아도 됩니다.
     return replace(".", "")
     */
    return this.replace(".", "")
}

fun main() {

    val text = """
        .......... Hello ............
        .......... World ............
        .......... Hello ............
        .......... World ............
    """.trimIndent()

    println(text.removeComma())
}