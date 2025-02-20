package com.ark.eatloop.data.database.repository

import com.ark.eatloop.domain.model.User
import com.ark.eatloop.domain.repository.UserRepository

class UserRepoImpl: UserRepository {
    override fun getUserById(): User {
        TODO("Not yet implemented")
    }

    override fun getUserByEmail(email: String): User {
        TODO("Not yet implemented")
    }

    override fun createUser(user: User): User {
        TODO("Not yet implemented")
    }
}