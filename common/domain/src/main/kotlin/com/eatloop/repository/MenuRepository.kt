package com.eatloop.repository

import com.eatloop.model.MenuItem

interface CustomerMenuRepository {

    fun getAllMenuItems(): List<MenuItem>

    fun getMenuItemById(id: String): MenuItem?

    fun getMenuItemsByCategory(category: String): List<MenuItem>

    fun getMenuItemsByRestaurant(restaurantId: String): List<MenuItem>

    fun searchMenuItemsByName(name: String): List<MenuItem>
}

interface RestaurantMenuRepository {

    fun getAllMenuItems(): List<MenuItem>

    fun getMenuItemById(id: String): MenuItem?

    fun addNewMenuItem(menuItem: MenuItem): MenuItem

    fun updateMenuItem(id: String, menuItem: MenuItem): MenuItem

    fun deleteMenuItem(id: String): Boolean

    fun getMenuItemsByCategory(category: String): List<MenuItem>

    fun getMenuItemsByRestaurant(restaurantId: String): List<MenuItem>

    fun searchMenuItemsByName(name: String): List<MenuItem>
}