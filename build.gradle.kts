plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("8.0.0-alpha08").apply(false)
    id("com.android.library").version("8.0.0-alpha08").apply(false)
    kotlin("android").version("1.7.10").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
    id("org.jetbrains.kotlinx.kover").version("0.6.1")
}

buildscript {
    dependencies {
        classpath("org.jetbrains.kotlinx:kover:0.6.1")
    }
}

allprojects {
    apply(plugin = "kover")
}

koverMerged {
    enable()
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
