package com.eatloop.rest.mapper

import com.eatloop.rest.dto.menu.MenuItemResponse
import com.eatloop.model.MenuItem

object MenuDtoMapper {

    fun MenuItem.toResponse() = MenuItemResponse(
        id = id,
        name = name,
        description = description,
        price = price,
        imageUrl = imageUrl,
        category = category,
        stock = stock,
        rating = rating,
        numberOfRatings = numberOfRatings,
        updatedAt = updatedAt
    )


}