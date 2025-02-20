package com.ark.eatloop.rest.mapper

import com.ark.eatloop.domain.model.User
import com.ark.eatloop.rest.dto.auth.SignupRequest
import com.ark.eatloop.rest.dto.auth.SignupResponse

object SignupMapper {

    fun SignupRequest.toUser(): User {
        return User(
            id = null,
            email = this.email,
            password = this.password,
            firstName = this.firstName,
            lastName = this.lastName,
            gender = this.gender,
            mobileNumber = this.mobileNumber,
            createdAt = null,
        )
    }

    fun User.toSignupResponse(token: String): SignupResponse {
        return SignupResponse(
            id = this.id!!,
            email = this.email,
            token = token,
            createdAt = this.createdAt!!,
        )
    }
}