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
    }
}

rootProject.name = "RunAnywhere"

// SDK modules
include(":runanywhere-kotlin")
project(":runanywhere-kotlin").projectDir = file("sdk/runanywhere-kotlin")

include(":runanywhere-core-llamacpp")
project(":runanywhere-core-llamacpp").projectDir =
    file("sdk/runanywhere-kotlin/modules/runanywhere-core-llamacpp")

include(":runanywhere-core-onnx")
project(":runanywhere-core-onnx").projectDir =
    file("sdk/runanywhere-kotlin/modules/runanywhere-core-onnx")

include(":runanywhere-core-rag")
project(":runanywhere-core-rag").projectDir =
    file("sdk/runanywhere-kotlin/modules/runanywhere-core-rag")