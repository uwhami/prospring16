plugins {
	java
	war
	id("org.springframework.boot") version "3.2.1"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.prospring16"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation("jakarta.annotation:jakarta.annotation-api:3.0.0-M1")
	implementation("jakarta.validation:jakarta.validation-api:3.1.0-M1")
	implementation("org.assertj:assertj-core:3.25.1")
	implementation("org.springframework.boot:spring-boot-starter-security:3.2.1")
	implementation("com.h2database:h2:2.2.224")
	implementation("org.springframework:spring-webmvc:6.1.2")
	implementation("org.hibernate.validator:hibernate-validator:8.0.1.Final")


}

tasks.withType<Test> {
	useJUnitPlatform()
}
