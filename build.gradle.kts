buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(AndroidCore.buildToolsClasspath)
        classpath(AndroidCore.kotlinPluginClasspath)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}