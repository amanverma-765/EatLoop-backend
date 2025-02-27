package com.eatloop.model

import com.eatloop.enum.FoodCategory
import java.time.Instant

data class MenuItem(
    val id: String?,
    val name: String,
    val description: String,
    val price: Double,
    val imgUrl: String,
    val category: FoodCategory,
    val stock: Int,
    val restaurantId: String,
    val rating: Double,
    val numberOfRatings: Int,
    val updatedAt: Instant
)
