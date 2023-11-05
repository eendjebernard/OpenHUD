plugins {
    `java-library`
    kotlin("jvm") version "1.8.20-Beta"

    id("io.papermc.paperweight.userdev") version "1.5.5"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.2"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("xyz.jpenilla.run-paper") version "2.1.0"
}

group = "me.mrbernard.openhud"
version = "1.0"
description = "Easy and fast HUD plugin with an API"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

repositories {
    maven(url = "https://jitpack.io")
}

dependencies {
    paperweight.paperDevBundle(version = "1.20.1-R0.1-SNAPSHOT")

    implementation(group = "com.github.Revxrsal.Lamp", name = "common", version = "3.1.5")
    implementation(group = "com.github.Revxrsal.Lamp", name = "bukkit", version = "3.1.5")
}

tasks {

    assemble {
        dependsOn(shadowJar)
        dependsOn(reobfJar)
    }

    compileKotlin {
        kotlinOptions.jvmTarget = JavaLanguageVersion.of(17).toString()
    }

    compileJava {
        options.encoding = Charsets.UTF_8.name() // We want UTF-8 for everything

        options.release.set(17)
    }
}

bukkit {
    name = "PluginTemplate"
    main = "me.mrbernard.plugintemplate.PluginTemplate"
    apiVersion = "1.20"
    authors = listOf("Mr_Bernard_")
}