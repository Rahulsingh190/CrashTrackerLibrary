plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.crash.tracker"
    compileSdk = 34

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    defaultConfig {
        minSdk = 19
        multiDexEnabled = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(files("libs/rxjava.jar"))
    implementation(files("libs/rxandroid.jar"))
    implementation(files("libs/reactive-streams.jar"))
    implementation(files("libs/retrofit.jar"))
    implementation(files("libs/gson.jar"))
    implementation(files("libs/okhttp.jar"))
    implementation(files("libs/okio.jar"))
    implementation(files("libs/logging-interceptor.jar"))
    implementation(files("libs/converter-gson.jar"))
    implementation(files("libs/adapter-rxjava2.jar"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}