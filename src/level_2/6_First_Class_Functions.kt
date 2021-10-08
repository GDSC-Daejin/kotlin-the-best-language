package level_2

// 함수가 변수가 될 수 있습니다.
val printer : (String) -> Unit = {
    println("Printer Prints : $it")
}

// 당연히 다른 함수의 매개변수가 될 수도 있습니다.
fun helloCallback(printer : (String) -> Unit) {
    printer("Hello")
}

fun main() {

    // 변수로 지정된 모습
    val applicationPrinter = printer

    // invoke 로 실행할 수 있습니다.
    applicationPrinter.invoke("Hello")
    // 또한 생략할 수도 있습니다.
    applicationPrinter("World")

    helloCallback {
        applicationPrinter(it)
    }

}
