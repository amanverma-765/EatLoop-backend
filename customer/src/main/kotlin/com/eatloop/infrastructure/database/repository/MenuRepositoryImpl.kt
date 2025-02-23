package com.eatloop.infrastructure.database.repository

import com.eatloop.infrastructure.database.jpa.MenuItemJpaRepo
import com.eatloop.mapper.MenuEntityMapper.toDomain
import com.eatloop.model.MenuItem
import org.springframework.stereotype.Component
import com.eatloop.repository.CustomerMenuRepository

@Component
class MenuRepositoryImpl(private val menuItemJpaRepo: MenuItemJpaRepo): CustomerMenuRepository {

    override fun getAllMenuItems(): List<MenuItem> {
        return menuItemJpaRepo.findAll().map { it.toDomain() }
    }

    override fun getMenuItemById(id: String): MenuItem? {
        return menuItemJpaRepo.findById(id).orElse(null)?.toDomain()
    }

    override fun getMenuItemsByCategory(category: String): List<MenuItem> {
        return menuItemJpaRepo.findByCategory(category).map { it.toDomain() }
    }

    override fun getMenuItemsByRestaurant(restaurantId: String): List<MenuItem> {
        return menuItemJpaRepo.findByRestaurantId(restaurantId).map { it.toDomain() }
    }

    override fun searchMenuItemsByName(name: String): List<MenuItem> {
        return menuItemJpaRepo.findByNameContainingIgnoreCase(name).map { it.toDomain() }
    }
}