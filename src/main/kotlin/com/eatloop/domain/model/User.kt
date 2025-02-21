package com.eatloop.domain.model

import java.time.Instant

data class User(
    val id: String?,
    val email: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val mobileNumber: String,
    val password: String,
    val createdAt: Instant?
)
