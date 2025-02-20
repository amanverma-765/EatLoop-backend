package com.ark.eatloop.data.database.jpa

import com.ark.eatloop.data.database.entity.UserEntity
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.Optional

interface UserJpaRepo: MongoRepository<UserEntity, String> {

    fun findByEmail(email: String): Optional<UserEntity>

}