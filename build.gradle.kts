plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //Spring
    implementation("org.springframework:spring-context:6.1.3")
    implementation("org.springframework:spring-core:6.1.3")
    implementation("org.springframework:spring-beans:6.1.3")
    implementation("org.springframework:spring-aspects:6.1.4")

    implementation ("org.hibernate:hibernate-core:6.4.1.Final")
    runtimeOnly ("org.postgresql:postgresql:42.7.1")
    implementation ("org.slf4j:slf4j-log4j12:2.0.11")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    compileOnly ("org.projectlombok:lombok:1.18.30")
    annotationProcessor ("org.projectlombok:lombok:1.18.30")
    testCompileOnly ("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.30")
}

tasks.test {
    useJUnitPlatform()
}