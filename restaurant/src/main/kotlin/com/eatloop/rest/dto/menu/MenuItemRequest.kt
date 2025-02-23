package com.eatloop.rest.dto.menu

import com.eatloop.enum.FoodCategory

data class MenuItemRequest(
    val name: String,
    val description: String,
    val price: Double,
    val category: FoodCategory,
    val stock: Int,
    val imageUrl: String
)
