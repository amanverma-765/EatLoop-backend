package com.eatloop.rest.mapper

import com.eatloop.domain.model.User
import com.eatloop.rest.dto.auth.LoginResponse

object LoginMapper {

    fun User.toLoginResponse(token: String): LoginResponse {
        return LoginResponse(
            email = this.email,
            token = token
        )
    }

}