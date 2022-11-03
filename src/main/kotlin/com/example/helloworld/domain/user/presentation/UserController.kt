package com.example.helloworld.domain.user.presentation

import com.example.helloworld.domain.user.presentation.dto.request.SaveUserRequestDto
import com.example.helloworld.domain.user.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController (
    private val userService: UserService
){

    @PostMapping
    fun saveUser(@RequestBody saveUserRequestDto: SaveUserRequestDto): ResponseEntity<Void>{
        userService.signin(saveUserRequestDto)
        return ResponseEntity.ok().build()
    }

}