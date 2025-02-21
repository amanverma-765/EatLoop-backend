package com.eatloop.service

import com.eatloop.domain.model.User
import com.eatloop.domain.repository.UserRepository
import com.eatloop.domain.service.AuthService
import org.springframework.stereotype.Service


@Service
class AuthServiceImpl(private val userRepository: UserRepository): AuthService {

    override fun handleUserRegistration(user: User): User {
        return userRepository.createUser(user) ?: throw Exception("User registration failed")
    }

    override fun handleUserLogin(email: String, password: String): User {
        // handle user login
        return userRepository.getUserByEmail(email) ?: throw Exception("User not found")
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