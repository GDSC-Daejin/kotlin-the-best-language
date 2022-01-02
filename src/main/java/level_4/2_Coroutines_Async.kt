package level_4

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis
import kotlin.time.measureTimedValue

fun main() {
    runBlocking {
        launch {
            // measureTimeMillis 으로 Coroutine Task 의 실행 시간을 측정할 수 있습니다.
            val time = measureTimeMillis {
                // Async 는 launch 와 개념적으로는 동일하되,
                // 다른 점이 있다면 Deferred<T> 를 리턴하여 값을 리턴하여 사용할 수 있습니다.
                val slower = async {
                    delay(2000)
                    println("Slower Async Executed")
                    1
                }

                val faster = async {
                    delay(1000)
                    println("Faster Async Executed")
                    2
                }

                val result = slower.await() + faster.await()
                println("Result : $result")
            }

            println("Measured Time : ${time}ms")
        }
    }
}