package level_4

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        // Parent Scope 에서 동작합니다.
        launch {
            println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
        }

        // Scope 에 Confined 되지 않게 하는 Dispatcher 로 메인 쓰레드에서 동작합니다.
        launch(Dispatchers.Unconfined) {
            println("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
        }

        // Default Dispatcher 를 사용합니다.
        launch(Dispatchers.Default) {
            println("Default               : I'm working in thread ${Thread.currentThread().name}")
        }

        // 새로운 쓰레드를 생성합니다.
        launch(newSingleThreadContext("New Thread")) {
            println("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
        }

        // Unconfined Dispatcher 와 Confined Dispatcher 의 차이점은,
        // Unconfined 는 첫 실행은 호출 한 쓰레드에서 동작하지만, suspend 된 이후 (예시의 delay(500) 같은) 에는
        // 중단점 이후에 코루틴이 재개(resume)될 때는 중단 함수를 재개한 스레드에서 수행됩니다.
        // 그러므로 CPU 시간을 소비하지 않으면서, 특정 스레드에 국한된 데이터 처리 (예: UI 업데이트) 를 하지 않는 작업에 적합합니다.
        launch(Dispatchers.Unconfined) {
            println("Unconfined      : I'm working in thread ${Thread.currentThread().name}")
            delay(500)
            println("Unconfined      : After delay in thread ${Thread.currentThread().name}")
        }

        // 반면 Confined Dispatcher 는 호출자 Coroutines 로 제한됩니다.
        launch {
            println("main runBlocking: I'm working in thread ${Thread.currentThread().name}")
            delay(1000)
            println("main runBlocking: After delay in thread ${Thread.currentThread().name}")
        }

    }
}