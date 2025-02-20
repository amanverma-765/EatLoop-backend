package com.ark.eatloop.data.database.repository

import com.ark.eatloop.data.database.jpa.UserJpaRepo
import com.ark.eatloop.data.database.mapper.UserEntityMapper.toUser
import com.ark.eatloop.data.database.mapper.UserEntityMapper.toUserEntity
import com.ark.eatloop.domain.model.User
import com.ark.eatloop.domain.repository.UserRepository
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