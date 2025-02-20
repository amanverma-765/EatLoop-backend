package com.ark.eatloop.rest.mapper

import com.ark.eatloop.domain.model.User
import com.ark.eatloop.rest.dto.auth.LoginResponse

object LoginMapper {

    fun User.toLoginResponse(token: String): LoginResponse {
        return LoginResponse(
            email = this.email,
            token = token
        )
    }

}