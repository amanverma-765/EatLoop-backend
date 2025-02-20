package com.ark.eatloop.rest.dto.catalog

data class CatalogItemResponse(
    val id: Long,
    val name: String,
    val description: String,
    val price: Double,
    val currency: String,
    val image: String,
    val category: String,
    val quantity: Int
)
