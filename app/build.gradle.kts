plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "xyz.hexene.localvpn"
    //noinspection GradleDependency
    compileSdk = libs.versions.appCompileSdk.get().toInt()

    defaultConfig {
        applicationId = "xyz.hexene.localvpn"
        minSdk = libs.versions.appMinSdk.get().toInt()
        //noinspection OldTargetApi
        targetSdk = libs.versions.appTargetSdk.get().toInt()
        versionCode = libs.versions.appVersionCode.get().toInt()
        versionName = libs.versions.appVersionName.get()
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(libs.appcompat.v7)
}
