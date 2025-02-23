package com.eatloop.service

import com.eatloop.model.MenuItem
import org.springframework.stereotype.Service
import com.eatloop.repository.CustomerMenuRepository
import com.eatloop.service.CustomerMenuService

@Service
class MenuServiceImpl(private val menuRepository: CustomerMenuRepository): CustomerMenuService {

    override fun getAllMenuItems(): List<MenuItem> {
        return menuRepository.getAllMenuItems()
    }

    override fun getMenuItemById(id: String): MenuItem? {
        return menuRepository.getMenuItemById(id)
    }

    override fun getMenuItemsByCategory(category: String): List<MenuItem> {
        return menuRepository.getMenuItemsByCategory(category)
    }

    override fun getMenuItemsByRestaurant(restaurantId: String): List<MenuItem> {
        return menuRepository.getMenuItemsByRestaurant(restaurantId)
    }

    override fun searchMenuItemsByName(name: String): List<MenuItem> {
        return menuRepository.searchMenuItemsByName(name)
    }

}