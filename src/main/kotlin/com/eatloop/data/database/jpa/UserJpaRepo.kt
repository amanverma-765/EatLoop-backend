package com.eatloop.data.database.jpa

import com.eatloop.data.database.entity.UserEntity
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.Optional

interface UserJpaRepo: MongoRepository<UserEntity, String> {

    fun findByEmail(email: String): Optional<UserEntity>

}