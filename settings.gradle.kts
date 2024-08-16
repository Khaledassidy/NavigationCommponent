pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google() // Add Google Maven repository
        mavenCentral() // Add Maven Central repository
        // Add other repositories as needed
    }
}

rootProject.name = "Navigation Commponent"
include(":app")
