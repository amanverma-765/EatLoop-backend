package com.eatloop.data.database.mapper

import com.eatloop.data.database.entity.UserEntity
import com.eatloop.domain.model.User

object UserEntityMapper {

    fun UserEntity.toUser(): User {
        return User(
            id = this.id,
            email = this.email,
            password = this.password,
            firstName = this.firstName,
            mobileNumber = this.mobileNumber,
            lastName = this.lastName,
            gender = this.gender,
            createdAt = this.createdAt

        )
    }

    fun User.toUserEntity(): UserEntity {
        return UserEntity(
            id = this.id,
            email = this.email,
            password = this.password,
            firstName = this.firstName,
            mobileNumber = this.mobileNumber,
            lastName = this.lastName,
            gender = this.gender
        )
    }
}