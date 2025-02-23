package com.eatloop.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "menu_items")
data class MenuItemEntity(
    @Id
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
