plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
}

tasks.register("clean", Delete::class.java).configure { delete(project.layout.buildDirectory) }
