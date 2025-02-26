plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.googleGmsGoogleServices)
    alias(libs.plugins.googleAndroidLibrariesMapsplatformSecretsGradlePlugin)

    id("kotlin-kapt")
}

android {
    namespace = "ma.ensaj.agri_alert"
    compileSdk = 34

    defaultConfig {
        applicationId = "ma.ensaj.agri_alert"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3" // Use the latest stable version
    }
}

kapt {
    arguments {
        arg("room.schemaLocation", "$projectDir/schemas")
        arg("room.incremental", "true")
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.runtime.android)
    implementation(libs.androidx.ui.graphics.android)
    implementation(libs.androidx.foundation.android)
    implementation(libs.androidx.material3.android)
    implementation(libs.play.services.location)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.firebase.messaging)
    implementation(libs.play.services.maps)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("androidx.core:core-splashscreen:1.0.0")

    implementation(libs.androidx.core.ktx)

    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation ("androidx.compose.material3:material3:1.3.1")
    implementation ("androidx.compose.ui:ui:1.7.5")
    implementation ("androidx.compose.runtime:runtime:1.7.5")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.7.5")
    implementation ("androidx.activity:activity-compose:1.9.3")
    implementation ("com.applandeo:material-calendar-view:1.9.2")

    implementation ("androidx.work:work-runtime-ktx:2.8.1")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.11.0")
    implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation ("com.google.android.gms:play-services-location:21.0.1")
    implementation ("androidx.cardview:cardview:1.0.0")
    implementation ("com.applandeo:material-calendar-view:1.8.0")

    implementation ("com.google.android.gms:play-services-maps:18.1.0")

    // Room components
    implementation ("androidx.room:room-runtime:2.6.1")
    annotationProcessor ("androidx.room:room-compiler:2.6.1")

    implementation("androidx.datastore:datastore-preferences:1.0.0")


    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.9.21")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.5")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.github.bumptech.glide:glide:4.15.1")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.15.1")

}