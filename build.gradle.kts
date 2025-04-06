plugins {
    id("java")
}

group = "me.nettee"
version = "0.1.0-rc1"

repositories {
    mavenCentral()
}

dependencies {
    // Choose: api("org.springframework:spring-webmvc") vs compileOnly("org.springframework:spring-webmvc")
    compileOnly("org.springframework:spring-webmvc:6.2.2")
    compileOnly("org.springframework.boot:spring-boot-autoconfigure:3.4.3")

    implementation("org.springframework.boot:spring-boot-starter-web:3.4.3")
}

tasks.test {
    useJUnitPlatform()
}