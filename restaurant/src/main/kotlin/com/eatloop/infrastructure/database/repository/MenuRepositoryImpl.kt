package com.eatloop.infrastructure.database.repository

import com.eatloop.infrastructure.database.jpa.MenuItemJpaRepo
import com.eatloop.mapper.MenuEntityMapper.toDomain
import com.eatloop.mapper.MenuEntityMapper.toEntity
import com.eatloop.model.MenuItem
import com.eatloop.repository.RestaurantMenuRepository
import org.springframework.stereotype.Component

@Component
class MenuRepositoryImpl(private val menuItemJpaRepo: MenuItemJpaRepo): RestaurantMenuRepository {

    override fun getAllMenuItems(): List<MenuItem> {
        return menuItemJpaRepo.findAll().map { it.toDomain() }
    }

    override fun getMenuItemById(id: String): MenuItem? {
        return menuItemJpaRepo.findById(id).orElse(null)?.toDomain()
    }

    override fun addNewMenuItem(menuItem: MenuItem): MenuItem {
        return menuItemJpaRepo.save(menuItem.toEntity()).toDomain()
    }

    override fun updateMenuItem(id: String, menuItem: MenuItem): MenuItem {
        val menuItemEntity = menuItemJpaRepo.findById(id).orElse(null)
        menuItemEntity?.let { menu ->
            val updatedMenu = menu.copy(
                name = menuItem.name,
                description = menuItem.description,
                price = menuItem.price,
                category = menuItem.category,
                stock = menuItem.stock,
                imageUrl = menuItem.imgUrl
            )
            return menuItemJpaRepo.save(updatedMenu).toDomain()
        } ?: throw NoSuchElementException("Menu item not found")
    }

    override fun deleteMenuItem(id: String): Boolean {
        return try {
            menuItemJpaRepo.deleteById(id)
            true
        } catch (e: Exception) {
            false
        }
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