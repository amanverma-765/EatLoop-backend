package com.ark.eatloop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EatLoopApplication

fun main(args: Array<String>) {
    runApplication<EatLoopApplication>(*args)
}
