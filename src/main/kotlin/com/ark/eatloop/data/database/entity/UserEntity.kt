package com.ark.eatloop.data.database.entity

import com.ark.eatloop.domain.enum.Country
import com.ark.eatloop.domain.enum.Currency
import org.springframework.boot.autoconfigure.domain.EntityScan


data class UserEntity(
    val id: Long?,
    val email: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val mobileNumber: String,
    val countryCode: String,
    val country: Country,
    val password: String,
    val currency: Currency
)
