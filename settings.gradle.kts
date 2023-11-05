pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven(url = "https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "PluginTemplate"

include(":paper")