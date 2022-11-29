plugins {
    with(Dependencies.Plugins) {
        id(ANDROID_APP)
        kotlin(ANDROID)
    }
}

@Suppress("UnstableApiUsage")
android {
    with(ProjectSettings) {
        namespace = "$PROJECT_ID.android"
        compileSdk = COMPILE_SDK_VERSION
        defaultConfig {
            applicationId = "$PROJECT_ID.android"
            minSdk = MIN_SDK_VERSION
            targetSdk = TARGET_SDK_VERSION
            versionCode = getVersionCode(project)
            versionName = getVersionName(project)
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(Dependencies.Modules.CLIENT))

    with(Dependencies.Android) {
        implementation(COMPOSE)
        implementation(COMPOSE_TOOLING)
        implementation(COMPOSE_TOOLING_PREVIEW)
        implementation(COMPOSE_FOUNDATION)
        implementation(COMPOSE_MATERIAL)
        implementation(COMPOSE_ACTIVITY)
    }
}
