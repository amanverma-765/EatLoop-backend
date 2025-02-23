package com.eatloop.rest.dto.menu

data class MenuItemResponse(
    val id: String?,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val category: String,
    val stock: Int,
    val rating: Double,
    val numberOfRatings: Int,
    val updatedAt: Long
)
