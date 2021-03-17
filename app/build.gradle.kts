plugins {
    id(AndroidCore.androidPlugin)
    id(AndroidCore.kotlinPlugin)
}
android {
    compileSdkVersion(AndroidCore.compileSdkVersion)
    defaultConfig {
        applicationId = AndroidCore.applicationId
        minSdkVersion(AndroidCore.minSdkVersion)
        targetSdkVersion(AndroidCore.targetSdkVersion)
        versionCode = 1 //once we get some automation in place we can replace this with env vars.
        versionName = "1.0"
    }
    buildTypes {
        getByName("debug") {
            isDebuggable = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "$project.rootDir/tools/proguard-rules.pro")
        }

        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-beta01"
        kotlinCompilerVersion = "1.4.30"
    }
}

dependencies {

    //Android Libs
    implementation(AndroidLibraries.ktxCore)
    implementation(AndroidLibraries.appCompat)
    implementation(AndroidLibraries.material)
    implementation(AndroidLibraries.lifecycleRuntime)
    implementation(AndroidLibraries.activityCompose)

    //Compose
    implementation(ComposeLibraries.composeUi)
    implementation(ComposeLibraries.composeUiTooling)
    implementation(ComposeLibraries.composeMaterial)

    testImplementation(TestingLibraries.junit)
    androidTestImplementation(TestingLibraries.junitExt)
    androidTestImplementation(TestingLibraries.espresso)
    androidTestImplementation(TestingLibraries.junitCompose)
}
