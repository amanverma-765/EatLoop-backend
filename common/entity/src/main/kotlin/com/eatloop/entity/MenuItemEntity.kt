package com.eatloop.entity

import com.eatloop.enum.FoodCategory
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant


@Document(collection = "menu_items")
data class MenuItemEntity(
    @Id
    val id: String?,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val category: FoodCategory,
    val stock: Int,
    val restaurantId: String,
    val rating: Double = 0.0,
    val numberOfRatings: Int = 0,
    val updatedAt: Instant = Instant.now()
)
