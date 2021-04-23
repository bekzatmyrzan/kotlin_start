package com.example.blog.service

import com.example.blog.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
        private val userRepository: UserRepository
) {
    fun findAll() = userRepository.findAll()
}
