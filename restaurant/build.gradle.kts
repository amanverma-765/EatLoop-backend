dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":common:utils"))
    implementation(project(":common:domain"))
    implementation(project(":common:entity"))
}
