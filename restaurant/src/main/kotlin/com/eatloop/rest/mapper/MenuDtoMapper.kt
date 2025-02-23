package com.eatloop.rest.mapper

import com.eatloop.model.MenuItem
import com.eatloop.rest.dto.menu.MenuItemRequest
import com.eatloop.rest.dto.menu.MenuItemResponse
import java.time.Instant

object MenuDtoMapper {

    fun MenuItem.toResponse() = MenuItemResponse(
        id = this.id,
        name = this.name,
        description = this.description,
        price = this.price,
        imgUrl = this.imgUrl,
        category = this.category,
        stock = this.stock,
        rating = this.rating,
        numberOfRatings = this.numberOfRatings,
        updatedAt = this.updatedAt
    )

    fun MenuItemRequest.toDomain(restaurantId: String) = MenuItem(
        id = null,
        name = this.name,
        description = this.description,
        price = this.price,
        imgUrl = this.imageUrl,
        category = this.category,
        stock = this.stock,
        restaurantId = restaurantId,
        rating = 0.0,
        numberOfRatings = 0,
        updatedAt = Instant.now()
    )

}