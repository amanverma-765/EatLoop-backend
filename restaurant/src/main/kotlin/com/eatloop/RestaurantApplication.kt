package com.eatloop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class RestaurantApplication

fun main(args: Array<String>) {
    runApplication<RestaurantApplication>(*args)
}