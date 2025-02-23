package com.eatloop.rest.mapper

import com.eatloop.rest.dto.menu.MenuItemResponse
import com.eatloop.model.MenuItem

object MenuDtoMapper {

    fun MenuItem.toResponse() = MenuItemResponse(
        id = this.id,
        name = this.name!!,
        description = this.description!!,
        price = this.price!!,
        imageUrl = this.imgUrl!!,
        category = this.category!!,
        stock = this.stock!!,
        rating = this.rating!!,
        numberOfRatings = this.numberOfRatings!!,
        updatedAt = this.updatedAt!!
    )

}