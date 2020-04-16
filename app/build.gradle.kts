plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.androidJunit5)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        applicationId = "info.sanaebadi.junit5"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }


}






dependencies {

    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)


    androidTestImplementation(TestLibraries.espresso)

    //JUnit4
    testImplementation(TestLibraries.junit4)


    // AndroidX test
    androidTestImplementation(TestLibraries.testCore)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.testRule)


    //  LOCAL UNIT TESTS (use JUnit5) JUnit Jupiter
    testImplementation(TestLibraries.junitJupiterApi)
    testImplementation(TestLibraries.junitJupiterParams)
    testRuntimeOnly(TestLibraries.junitJupiterEngine)


    //  MOCKITO
    testImplementation(TestLibraries.mockito)
}
