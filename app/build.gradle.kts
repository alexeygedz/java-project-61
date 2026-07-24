plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.52.0"
    id("application")
    id("org.sonarqube") version "7.3.1.8318"
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

checkstyle {
    toolVersion = "13.8.0"
    configFile = file("config/checkstyle/checkstyle.xml")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "alexeygedz_java-project-61")
        property("sonar.organization", "alexeygedz")
    }
}