package level_4

import kotlinx.coroutines.*

fun main() {
    // Kotlin Coroutine 은 Kotlin 에서 사용가능한 비동기 프레임워크입니다.
    // 일반적인 Thread 의 ThreadPool 처럼 다양한 IO, Main, UI 등의 Dispatcher 를 사용할 수 있지만
    // 실제로는 Coroutine 은 싱글 스레드에서 동작하고, 직접 suspend 함수를 Blocking 하는 형태로 동작합니다.
    // 그래서 Kotlin Coroutine 별도로 쓰레드 스위칭이 일어나지 않으므로 가볍고 빠릅니다.
    // 참고 : https://myungpyo.medium.com/%EC%BD%94%EB%A3%A8%ED%8B%B4-%EA%B3%B5%EC%8B%9D-%EA%B0%80%EC%9D%B4%EB%93%9C-%EC%9E%90%EC%84%B8%ED%9E%88-%EC%9D%BD%EA%B8%B0-part-5-62e886f7862d

    // runBlocking 은 예시를 위해 CoroutineScope 를 사용하기 위하여 감싼 것으로,
    // 실제 Product 에 사용할 시에는 별도의 CoroutineScope 를 생성하여 사용합니다.

    /*
    * val scope = CoroutineScope(Dispatchers.IO)
    * scope.launch {
    *  // IO Tasks (API, DB Call)
    * }
    *
    * */
    runBlocking {

        // launch 는 CoroutineScope 로 생성이 가능하며,
        // 여러 suspend, async task 를 처리할 수 있는 하나의 Task 묶음의 Job 형태입니다.
        // Job 을 리턴하기 때문에 원할때 cancel 할 수 있습니다.

        val cancelablePrintJob = launch {
            delay(1000)
            println("Can't be printed")
        }

        launch {
            cancelablePrintJob.cancel()
            suspendCounter()
        }

    }
}

// Blocking 되는 suspend 함수를 사용하기 위해서는 suspend 키워드를 붙여야합니다.
// 여기서는 delay 함수를 사용하기 위해 suspend 키워드를 사용했습니다.
suspend fun suspendCounter() {
    repeat(5) {
        delay(1000)
        println("Count : $it")
    }
}