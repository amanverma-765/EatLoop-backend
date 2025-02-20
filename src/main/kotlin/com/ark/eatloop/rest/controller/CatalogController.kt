package com.ark.eatloop.rest.controller

import com.ark.eatloop.rest.dto.catalog.CatalogItemResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/catalog")
class CatalogController {

    @PostMapping
    fun createNewCatalogItem(): ResponseEntity<CatalogItemResponse> {
        TODO("Not yet implemented")
    }

    @GetMapping
    fun getAllCatalogs(): ResponseEntity<List<CatalogItemResponse>> {
        TODO("Not yet implemented")
    }

    @GetMapping("/{id}")
    fun getCatalogItemById(@PathVariable id: String): ResponseEntity<CatalogItemResponse> {
        TODO("Not yet implemented")
    }

    @GetMapping("/search")
    fun searchFoodItems(
        @RequestParam query: String,
        @RequestParam(required = false) category: String?,
        @RequestParam(required = false) priceRange: String?,
        @RequestParam(required = false, defaultValue = "0") page: Int,
        @RequestParam(required = false, defaultValue = "20") size: Int
    ): ResponseEntity<List<CatalogItemResponse>> {
        TODO("Not yet implemented")
    }


}