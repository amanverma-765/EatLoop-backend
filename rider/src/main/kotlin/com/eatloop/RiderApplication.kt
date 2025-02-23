package com.eatloop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class RiderApplication

fun main(args: Array<String>) {
    runApplication<RiderApplication>(*args)
}