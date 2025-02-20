package com.eatloop.rest.controller

import com.eatloop.domain.model.User
import com.eatloop.domain.service.AuthService
import com.eatloop.rest.dto.auth.LoginRequest
import com.eatloop.rest.dto.auth.LoginResponse
import com.eatloop.rest.dto.auth.SignupRequest
import com.eatloop.rest.dto.auth.SignupResponse
import com.eatloop.rest.mapper.LoginMapper.toLoginResponse
import com.eatloop.rest.mapper.SignupMapper.toSignupResponse
import com.eatloop.rest.mapper.SignupMapper.toUser
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/auth")
class AuthController(private val authService: AuthService) {

    @PostMapping("/signup")
    fun createNewAccount(@RequestBody requestBody: SignupRequest): ResponseEntity<SignupResponse> {
        val response = authService.handleUserRegistration(requestBody.toUser())
        return ResponseEntity.ok(response.toSignupResponse("iasediuuysadhfhhksdhf"))
    }

    @PostMapping("/login")
    fun handleUserLogin(@RequestBody requestBody: LoginRequest): ResponseEntity<LoginResponse> {
        val response = authService.handleUserLogin(requestBody.email, requestBody.password)
        return ResponseEntity.ok(response.toLoginResponse(""))
    }

    @PostMapping("/forgot-password")
    fun handleForgotPassword(): ResponseEntity<String> {
        val response = authService.handleForgotPassword()
        return ResponseEntity.ok(response)
    }

    @DeleteMapping("/logout")
    fun handleUserLogout(): ResponseEntity<Unit> {
        authService.handleUserLogout()
        return ResponseEntity.ok().build()
    }

    @GetMapping("/me")
    fun getCurrentUser(): ResponseEntity<User> {
        val response = authService.getCurrentUser()
        return ResponseEntity.ok(response)
    }

    @GetMapping("/refresh-token/{refreshToken}")
    fun refreshJwtToken(@PathVariable refreshToken: String): ResponseEntity<String> {
        val response = authService.refreshJwtToken(refreshToken)
        return ResponseEntity.ok(response)
    }

}