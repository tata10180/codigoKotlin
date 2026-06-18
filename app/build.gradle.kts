plugins {
    kotlin("jvm") version "1.9.23"
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    testImplementation(libs.junit)
}