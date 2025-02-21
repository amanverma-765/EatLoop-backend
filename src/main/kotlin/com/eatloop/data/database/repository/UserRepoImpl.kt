package com.eatloop.data.database.repository

import com.eatloop.data.database.jpa.UserJpaRepo
import com.eatloop.data.database.mapper.UserEntityMapper.toUser
import com.eatloop.data.database.mapper.UserEntityMapper.toUserEntity
import com.eatloop.domain.model.User
import com.eatloop.domain.repository.UserRepository
import org.springframework.stereotype.Component
import kotlin.jvm.optionals.getOrNull

@Component
class UserRepoImpl(private val userJpaRepo: UserJpaRepo): UserRepository {

    override fun getUserById(id: String): User? {
        return userJpaRepo.findById(id).getOrNull()?.toUser()
    }

    override fun getUserByEmail(email: String): User? {
        return userJpaRepo.findByEmail(email).getOrNull()?.toUser()
    }

    override fun createUser(user: User): User? {
        return userJpaRepo.save(user.toUserEntity()).toUser()
    }
}