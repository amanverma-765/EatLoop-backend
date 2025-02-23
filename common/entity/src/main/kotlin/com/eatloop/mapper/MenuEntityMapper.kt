package com.eatloop.mapper

import com.eatloop.entity.MenuItemEntity
import com.eatloop.model.MenuItem

object MenuEntityMapper {

    fun MenuItem.toEntity() = MenuItemEntity(
        id = this.id,
        name = this.name,
        description = this.description,
        price = this.price,
        imageUrl = this.imgUrl,
        category = this.category,
        stock = this.stock,
        restaurantId = this.restaurantId,
    )

    fun MenuItemEntity.toDomain() = MenuItem(
        id = this.id,
        name = this.name,
        description = this.description,
        price = this.price,
        imgUrl = this.imageUrl,
        category = this.category,
        stock = this.stock,
        restaurantId = this.restaurantId,
        rating = this.rating,
        numberOfRatings = this.numberOfRatings,
        updatedAt = this.updatedAt
    )
}