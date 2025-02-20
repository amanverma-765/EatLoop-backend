package com.ark.eatloop.data.database.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collection = "users")
data class UserEntity(
    @Id
    val id: String?,
    val email: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val mobileNumber: String,
    val password: String,
    val createdAt: Instant = Instant.now(),
)
