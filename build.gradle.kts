import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
}

group = "me.vopolskiy"
version = "1.0-SNAPSHOT"

// ....
// version = "0.9"  - tag
// version = "1.0-SNAPSHOT"  - master
// version = "1.0-SNAPSHOT"  - branch feature-name
// version = "1.0-SNAPSHOT"  - branch feature-name - merge updates from master
// version = "1.0"  - tag
// version = "1.1"  - tag
// version = "1.2-SNAPSHOT"  - feature branch merge to master
//  - предупредить что собираемся мержить в мастер
//  - кому написать запрос на мерж в мастер?
//  - запуститься сборка в мастере, подождать пока закончиться с успешными тестами
// version = "1.3-SNAPSHOT"  - master в гите поменяет версию на 1.3-SNAPSHOT
// version = "1.3"  - сборка тега - кнопкой freeze?
// в тимсити должна появиться еще одна сборка с тегом 1.3
//
//
// version = "0.9"-SNAPSHOT
// version = "0.9" -> tag
// version = "1.0-SNAPSHOT"
// version = "1.0" -> tag
//

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.5.10")

}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}