package com.eatloop.service

import com.eatloop.model.MenuItem

interface CustomerMenuService {

    fun getAllMenuItems(): List<MenuItem>

    fun getMenuItemById(id: String): MenuItem?

    fun getMenuItemsByCategory(category: String): List<MenuItem>

    fun getMenuItemsByRestaurant(restaurantId: String): List<MenuItem>

    fun searchMenuItemsByName(name: String): List<MenuItem>
}

interface RestaurantMenuService {

    fun getAllMenuItems(): List<MenuItem>

    fun getMenuItemById(restaurantId: String, id: String): MenuItem?

    fun addNewMenuItem(menuItem: MenuItem): MenuItem

    fun updateMenuItem(id: String, menuItem: MenuItem): MenuItem

    fun deleteMenuItem(restaurantId: String, id: String): Boolean

    fun getMenuItemsByCategory(restaurantId: String, category: String): List<MenuItem>

    fun getMenuItemsByRestaurant(restaurantId: String): List<MenuItem>

    fun searchMenuItemsByName(restaurantId: String, name: String): List<MenuItem>
}