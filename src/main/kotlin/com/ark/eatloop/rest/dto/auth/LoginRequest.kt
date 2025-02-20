package com.ark.eatloop.rest.dto.auth

data class LoginRequest(
    val email: String,
    val password: String
)
