package com.ark.eatloop.rest.mapper

import com.ark.eatloop.domain.model.User
import com.ark.eatloop.rest.dto.auth.SignupRequest
import com.ark.eatloop.rest.dto.auth.SignupResponse

object SignupMapper {

    fun SignupRequest.toUser(onTermsAccepted: (accepted: Boolean) -> Unit): User {
        onTermsAccepted(this.termsAccepted)
        return User(
            id = null,
            email = this.email,
            password = this.password,
            firstName = this.firstName,
            lastName = this.lastName,
            gender = this.gender,
            currency = this.currency,
            mobileNumber = this.mobileNumber,
            countryCode = this.country.isdCode,
            country = this.country
        )
    }

    fun User.toSignupResponse(token: String): SignupResponse {
        return SignupResponse(
            id = this.id!!,
            email = this.email,
            token = token
        )
    }
}