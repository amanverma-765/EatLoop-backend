package com.eatloop.infrastructure.database.jpa

import com.eatloop.entity.MenuItemEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MenuItemJpaRepo: MongoRepository<MenuItemEntity, String> {

    fun findByCategory(category: String): List<MenuItemEntity>

    fun findByRestaurantId(restaurantId: String): List<MenuItemEntity>

    fun findByNameContainingIgnoreCase(name: String): List<MenuItemEntity>
}