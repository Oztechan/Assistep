/*
 * Copyright (c) 2021 Mustafa Ozhan. All rights reserved.
 */

object Dependencies {
    object Common {
        const val TEST = "test"
    }

    object Android {
        const val COMPOSE = "androidx.compose.ui:ui:${Versions.COMPOSE}"
        const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
        const val COMPOSE_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
        const val COMPOSE_FOUNDATION = "androidx.compose.foundation:foundation:${Versions.COMPOSE}"
        const val COMPOSE_MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE}"
        const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
    }

    object ClassPaths {
        const val ANDROID_GRADLE_PLUGIN = "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_PLUGIN}"
        const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
        const val KOVER = "org.jetbrains.kotlinx:kover:${Versions.KOVER}"
    }

    object Plugins {
        const val MULTIPLATFORM = "multiplatform"
        const val ANDROID = "android"
        const val ANDROID_APP = "com.android.application"
        const val ANDROID_LIB = "com.android.library"
        const val KOVER = "org.jetbrains.kotlinx.kover"
    }

    object Modules {
        const val CLIENT = ":client"
    }

    object Frameworks {
        const val CLIENT = "Client"
    }
}
