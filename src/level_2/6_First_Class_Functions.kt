package level_2

// in Kotlin function can be a property
val printer : (String) -> Unit = {
    println("Printer Prints : $it")
}

// Also function parameter
fun helloCallback(printer : (String) -> Unit) {
    printer("Hello")
}

fun main() {

    val applicationPrinter = printer

    applicationPrinter.invoke("Hello")
    applicationPrinter("World")

    helloCallback {
        applicationPrinter(it)
    }

}
