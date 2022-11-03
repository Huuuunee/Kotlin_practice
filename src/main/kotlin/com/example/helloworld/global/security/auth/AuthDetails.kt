package com.example.helloworld.global.security.auth

import com.example.helloworld.domain.user.domain.entitiy.User
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class AuthDetails(
        private val user: User
): UserDetails {
    override fun getAuthorities(): Collection<GrantedAuthority?> =
            listOf()

    override fun getPassword(): String? =
            null

    override fun getUsername(): String =
            user.email

    override fun isAccountNonExpired(): Boolean =
            true

    override fun isAccountNonLocked(): Boolean =
            true

    override fun isCredentialsNonExpired(): Boolean =
            true

    override fun isEnabled(): Boolean =
            isAccountNonExpired && isAccountNonLocked && isCredentialsNonExpired
}