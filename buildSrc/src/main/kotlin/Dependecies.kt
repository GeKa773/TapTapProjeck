object Dependencies {

    object Plugins {
        const val version = "7.3.1"
        const val androidGradlePlugin = "com.android.tools.build:gradle:$version"
    }

    object Kotlin {
        const val version = "1.8.10"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object AndroidX {
        const val core = "androidx.core:core-ktx:1.9.0"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.6.0"
        const val activityCompose = "androidx.activity:activity-compose:1.6.1"
        const val junit = "androidx.test.ext:junit:1.1.5"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.5.1"
    }

    object Compose {
        const val version = "1.4.2"
        private const val uiVersion = "1.3.3"
        private const val materialVersion = "1.0.1"
        private const val nav_version = "2.5.3"

        const val ui = "androidx.compose.ui:ui:$uiVersion"
        const val preview = "androidx.compose.ui:ui-tooling-preview:$uiVersion"
        const val material = "androidx.compose.material3:material3:$materialVersion"
        const val junit = "androidx.compose.ui:ui-test-junit4:$uiVersion"
        const val tooling = "androidx.compose.ui:ui-tooling:$uiVersion"
        const val manifest = "androidx.compose.ui:ui-test-manifest:$uiVersion"
        const val navigation = "androidx.navigation:navigation-compose:$nav_version"
    }

    object JUnit {
        const val junit = "junit:junit:4.13.2"
    }

    object Coroutines {
        private const val version = "1.6.4"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
    }
}