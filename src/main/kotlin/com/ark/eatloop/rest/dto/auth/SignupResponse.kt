package com.ark.eatloop.rest.dto.auth

import java.time.Instant

data class SignupResponse(
    val id: String,
    val email: String,
    val token: String,
    val createdAt: Instant
)