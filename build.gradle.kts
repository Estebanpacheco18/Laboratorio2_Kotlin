plugins {
    kotlin("jvm") version "1.9.24"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("acuario.MainKt")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "acuario.MainKt"
    }
}