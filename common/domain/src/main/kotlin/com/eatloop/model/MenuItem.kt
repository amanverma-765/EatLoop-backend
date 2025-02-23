package com.eatloop.model

data class MenuItem(
    val id: String?,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val category: String,
    val stock: Int,
    val restaurantId: String,
    val rating: Double,
    val numberOfRatings: Int,
    val updatedAt: Long
)
