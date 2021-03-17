
object AndroidCore {
    private const val kotlinVersion = "1.4.31"
    private const val buildToolsVersion = "7.0.0-alpha10"

    const val compileSdkVersion = 30
    const val applicationId = "com.bluelampcreative.recipease"
    const val minSdkVersion = 21
    const val targetSdkVersion = 30

    const val buildToolsClasspath = "com.android.tools.build:gradle:$buildToolsVersion"
    const val kotlinPluginClasspath = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidPlugin = "com.android.application"
    const val kotlinPlugin = "kotlin-android"
}

object AndroidLibraries {
    private const val ktxVersion = "1.3.2"
    private const val appCompatVersion = "1.2.0"
    private const val materialVersion = "1.2.1"
    private const val activityComposeVersion = "1.3.0-alpha02"
    private const val lifecycleRuntimeVersion = "2.3.0-alpha06"

    const val ktxCore =  "androidx.core:core-ktx:$ktxVersion"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    const val material = "com.google.android.material:material:$materialVersion"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimeVersion"
}

object ComposeLibraries {
    private const val composeVersion = "1.0.0-beta01"

    const val composeUi = "androidx.compose.ui:ui:$composeVersion"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
    const val composeMaterial = "androidx.compose.material:material:$composeVersion"
}

object TestingLibraries {
    private const val junitVersion = "4.13.2"
    private const val androidxJUnitExtVersion = "1.1.2"
    private const val espressoVersion = "3.3.0"
    private const val composeJunitVersion = "1.0.0-beta02"

    const val junit = "junit:junit:$junitVersion"
    const val junitExt = "androidx.test.ext:junit:$androidxJUnitExtVersion"
    const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
    const val junitCompose = "androidx.compose.ui:ui-test-junit4:$composeJunitVersion"
}

