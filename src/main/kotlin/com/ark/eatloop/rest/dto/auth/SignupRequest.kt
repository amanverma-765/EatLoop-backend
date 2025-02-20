package com.ark.eatloop.rest.dto.auth

import com.ark.eatloop.domain.enum.Country
import com.ark.eatloop.domain.enum.Currency

data class SignupRequest(
    val email: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val mobileNumber: String,
    val country: Country,
    val password: String,
    val termsAccepted: Boolean,
    val currency: Currency
)
