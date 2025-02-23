plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "eatloop-backend"

include("restaurant")
include("rider")
include("customer")
include("common:utils")
include("common:domain")
include("common:entity")
