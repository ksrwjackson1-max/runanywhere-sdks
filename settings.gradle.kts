pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        mavenLocal()
    }
}

rootProject.name = "RunAnywhere"

include(":runanywhere-kotlin")
project(":runanywhere-kotlin").projectDir = file("sdk/runanywhere-kotlin")

// Backend modules
include(":runanywhere-core-llamacpp")
project(":runanywhere-core-llamacpp").projectDir =
    file("sdk/runanywhere-kotlin/modules/runanywhere-core-llamacpp")

include(":runanywhere-core-onnx")
project(":runanywhere-core-onnx").projectDir =
    file("sdk/runanywhere-kotlin/modules/runanywhere-core-onnx")

include(":runanywhere-core-rag")
project(":runanywhere-core-rag").projectDir =
    file("sdk/runanywhere-kotlin/modules/runanywhere-core-rag")

// Playground Android module
include(":android-use-agent")
project(":android-use-agent").projectDir = file("Playground/android-use-agent")

// If you have an app folder inside android-use-agent, include it as subproject
include(":android-use-agent:app")
project(":android-use-agent:app").projectDir = file("Playground/android-use-agent/app")