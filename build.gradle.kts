plugins {
    application
    kotlin("jvm") version "1.6.10"
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
}

application {
    mainClass.set("MainKt")
}