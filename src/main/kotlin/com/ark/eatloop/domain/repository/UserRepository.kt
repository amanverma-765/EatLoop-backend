package com.ark.eatloop.domain.repository

import com.ark.eatloop.domain.model.User

interface UserRepository {

    fun getUserById(): User

    fun getUserByEmail(email: String): User

    fun createUser(user: User): User

}