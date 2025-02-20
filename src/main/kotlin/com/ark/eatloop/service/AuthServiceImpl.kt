package com.ark.eatloop.service

import com.ark.eatloop.domain.model.User
import com.ark.eatloop.domain.service.AuthService
import org.springframework.stereotype.Service


@Service
class AuthServiceImpl: AuthService {

    override fun handleUserRegistration(user: User): User {
        // account creation logic
        return user
    }

    override fun handleUserLogin(email: String, password: String): User {
        TODO("Not yet implemented")
    }

    override fun handleUserLogout() {
        TODO("Not yet implemented")
    }

    override fun refreshJwtToken(refreshToken: String): String {
        TODO("Not yet implemented")
    }

    override fun getCurrentUser(): User {
        TODO("Not yet implemented")
    }

    override fun handleForgotPassword(): String {
        TODO("Not yet implemented")
    }

}