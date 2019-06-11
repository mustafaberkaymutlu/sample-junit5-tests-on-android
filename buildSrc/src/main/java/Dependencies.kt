@file:Suppress("unused")

object Versions {
    const val appVersionCode = 1
    const val appVersionName = "1.0"

    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29

    const val kotlin = "1.3.31"
    const val ktxCore = "1.0.2"
    const val appCompat = "1.0.2"
    const val ktlint = "0.33.0"

    // test
    const val junit5 = "1.4.2.0"
    const val junitJupiter = "5.4.2"
    const val mockito = "2.28.2"
    const val mockitoKotlin = "1.6.0"
    const val assertJ = "3.12.2"
}

object Libraries {
    const val androidGradlePlugin = "com.android.tools.build:gradle:3.4.1"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"

    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    const val ktlint = "com.pinterest:ktlint:${Versions.ktlint}"

    // test
    const val junitGradlePlugin = "de.mannodermaus.gradle.plugins:android-junit5:${Versions.junit5}"
    const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junitJupiter}"
    const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junitJupiter}"
    const val junitJupiterParams = "org.junit.jupiter:junit-jupiter-params:${Versions.junitJupiter}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockitoKotlin = "com.nhaarman:mockito-kotlin:${Versions.mockitoKotlin}"
    const val assertj = "org.assertj:assertj-core:${Versions.assertJ}"
}