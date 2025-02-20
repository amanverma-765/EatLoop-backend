package com.ark.eatloop.rest.dto.auth

data class SignupResponse(
    val id: String,
    val email: String,
    val token: String
)