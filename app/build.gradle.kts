
plugins {
    kotlin("jvm") version "1.9.22"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("xyz.jpenilla.run-paper") version "2.2.2"
}

group = "dev.ddo" // 본인의 패키지명으로 변경
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.3-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}
// Apply a specific Java toolchain to ease working on different environments.
kotlin {
    jvmToolchain(21)
}

tasks {
    runServer {  // 서버 실행 설정
        minecraftVersion("1.21.3")
        // downloadPlugins {
        //     // 필요한 플러그인들을 여기에 추가할 수 있습니다
        //     // hangar("plugin-name", "version") 
        //     // modrinth("plugin-name", "version")
        //     // url("plugin-url")
        // }
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "21"
    }
    compileJava {
        options.encoding = "UTF-8"
    }
    jar {
        archiveFileName.set("ktdev.jar")
        destinationDirectory.set(file("D:/MyPlace/minecraft dev/paper2/plugins"))
    }
}