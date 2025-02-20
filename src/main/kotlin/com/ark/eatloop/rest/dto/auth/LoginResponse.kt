package com.ark.eatloop.rest.dto.auth

data class LoginResponse(
    val email: String,
    val token: String
)