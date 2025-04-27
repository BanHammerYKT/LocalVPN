pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven("https://jitpack.io")
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        gradlePluginPortal()
        maven("https://jitpack.io")
        mavenCentral()
    }
}

rootProject.name = "LocalVPN"
include(":app")
