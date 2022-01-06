package com.ideapp.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {
    @Autowired lateinit var userService: UserService

    @GetMapping("")
    @ResponseBody
    fun getUser(): User {
        return userService.getUserInfo()
    }
}
