package com.eatloop.rest.controller

import com.eatloop.rest.dto.menu.MenuItemRequest
import com.eatloop.rest.dto.menu.MenuItemResponse
import com.eatloop.rest.mapper.MenuDtoMapper.toDomain
import com.eatloop.rest.mapper.MenuDtoMapper.toResponse
import com.eatloop.service.RestaurantMenuService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/restaurants/{restaurantId}/menu-items")
class MenuController(private val menuItemService: RestaurantMenuService) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getMenuItems(
        @PathVariable restaurantId: String,
        @RequestParam(required = false) category: String?,
        @RequestParam(required = false) query: String?
    ): ResponseEntity<List<MenuItemResponse>> {
        val menuItems = when {
            category != null -> menuItemService.getMenuItemsByCategory(restaurantId, category)
            query != null -> menuItemService.searchMenuItemsByName(restaurantId, query)
            else -> menuItemService.getMenuItemsByRestaurant(restaurantId)
        }
        return ResponseEntity.ok(menuItems.map { it.toResponse() })
    }

    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getMenuItem(
        @PathVariable restaurantId: String,
        @PathVariable id: String
    ): ResponseEntity<MenuItemResponse> {
        return menuItemService.getMenuItemById(restaurantId, id)?.let {
            ResponseEntity.ok(it.toResponse())
        } ?: ResponseEntity.notFound().build()
    }

    @PostMapping(
        produces = [MediaType.APPLICATION_JSON_VALUE],
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun createMenuItem(
        @PathVariable restaurantId: String,
        @RequestBody request: MenuItemRequest
    ): ResponseEntity<MenuItemResponse> {
        val menuItem = menuItemService.addNewMenuItem(request.toDomain(restaurantId))
        return ResponseEntity.ok(menuItem.toResponse())
    }

    @PutMapping(
         "/{id}",
        produces = [MediaType.APPLICATION_JSON_VALUE],
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun updateMenuItem(
        @PathVariable restaurantId: String,
        @PathVariable id: String,
        @RequestBody request: MenuItemRequest
    ): ResponseEntity<MenuItemResponse> {
        val menuItem = menuItemService.updateMenuItem(id, request.toDomain(restaurantId))
        return ResponseEntity.ok(menuItem.toResponse())
    }

    @DeleteMapping("/{id}")
    fun deleteMenuItem(
        @PathVariable restaurantId: String,
        @PathVariable id: String
    ): ResponseEntity<Void> {
        return if (menuItemService.deleteMenuItem(restaurantId, id)) {
            ResponseEntity.noContent().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }
}