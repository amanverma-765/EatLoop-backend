package com.eatloop.domain.repository

import com.eatloop.domain.model.User

interface UserRepository {

    fun getUserById(id: String): User?

    fun getUserByEmail(email: String): User?

    fun createUser(user: User): User?

}