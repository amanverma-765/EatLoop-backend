package com.ark.eatloop.domain.service

import com.ark.eatloop.domain.model.User

interface AuthService {

    fun handleUserRegistration(user: User): User

    fun handleUserLogin(email: String, password: String): User

    fun handleUserLogout()

    fun refreshJwtToken(refreshToken: String): String

    fun getCurrentUser(): User

    fun handleForgotPassword(): String

}