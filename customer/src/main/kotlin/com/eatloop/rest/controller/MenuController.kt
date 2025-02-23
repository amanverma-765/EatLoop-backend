package com.eatloop.rest.controller

import com.eatloop.rest.dto.menu.MenuItemResponse
import com.eatloop.rest.mapper.MenuDtoMapper.toResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.eatloop.service.CustomerMenuService
import org.springframework.http.MediaType

@RestController
@RequestMapping("/v1/menu-items")
class MenuController(private val menuItemService: CustomerMenuService) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getMenuItems(
        @RequestParam(required = false) restaurant: String?,
        @RequestParam(required = false) category: String?,
        @RequestParam(required = false) query: String?
    ): ResponseEntity<List<MenuItemResponse>> {
        val menuItems = when {
            restaurant != null -> menuItemService.getMenuItemsByRestaurant(restaurant)
            category != null -> menuItemService.getMenuItemsByCategory(category)
            query != null -> menuItemService.searchMenuItemsByName(query)
            else -> menuItemService.getAllMenuItems()
        }
        return ResponseEntity.ok(menuItems.map { it.toResponse() })
    }

    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getMenuItem(@PathVariable id: String): ResponseEntity<MenuItemResponse> {
        return menuItemService.getMenuItemById(id)?.let {
            ResponseEntity.ok(it.toResponse())
        } ?: ResponseEntity.notFound().build()
    }
}