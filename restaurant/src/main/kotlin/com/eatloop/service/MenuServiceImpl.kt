package com.eatloop.service

import com.eatloop.model.MenuItem
import com.eatloop.repository.RestaurantMenuRepository
import org.springframework.stereotype.Service

@Service
class MenuServiceImpl(private val menuRepository: RestaurantMenuRepository): RestaurantMenuService {

    override fun getAllMenuItems(): List<MenuItem> {
        return menuRepository.getAllMenuItems()
    }

    override fun getMenuItemById(restaurantId: String, id: String): MenuItem? {
        // validate the restaurant
        return menuRepository.getMenuItemById(id)
    }

    override fun addNewMenuItem(menuItem: MenuItem): MenuItem {
        return menuRepository.addNewMenuItem(menuItem)
    }

    override fun updateMenuItem(id: String, menuItem: MenuItem): MenuItem {
        return menuRepository.updateMenuItem(id, menuItem)
    }

    override fun deleteMenuItem(restaurantId: String, id: String): Boolean {
        // validate the restaurant
        return menuRepository.deleteMenuItem(id)
    }

    override fun getMenuItemsByCategory(restaurantId: String, category: String): List<MenuItem> {
        // validate the restaurant
        return menuRepository.getMenuItemsByCategory(category)
    }

    override fun getMenuItemsByRestaurant(restaurantId: String): List<MenuItem> {
        return menuRepository.getMenuItemsByRestaurant(restaurantId)
    }

    override fun searchMenuItemsByName(restaurantId: String, name: String): List<MenuItem> {
        // validate the restaurant
        return menuRepository.searchMenuItemsByName(name)
    }

}