package com.ark.eatloop.rest.dto.auth

data class SignupRequest(
    val email: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val mobileNumber: String,
    val password: String,
)
