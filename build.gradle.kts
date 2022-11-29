plugins {
    with(Dependencies.Plugins) {
        id(KOVER).version(Versions.KOVER)
    }
}

buildscript {
    dependencies {
        with(Dependencies.ClassPaths) {
            classpath(ANDROID_GRADLE_PLUGIN)
            classpath(KOTLIN_GRADLE_PLUGIN)
            classpath(KOVER)
        }
    }
}

allprojects {
    apply(plugin = "kover").also{
        koverMerged.enable()
    }
}
