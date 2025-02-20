package com.ark.eatloop.domain.model

import com.ark.eatloop.domain.enum.Country
import com.ark.eatloop.domain.enum.Currency

data class User(
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
