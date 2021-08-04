package com.example.blog.controller

import com.example.blog.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController (
        private val userService: UserService
        ){
    @GetMapping("/users")
    fun getUsers() = userService.findAll()
}
//from commit 1
//from commit 2