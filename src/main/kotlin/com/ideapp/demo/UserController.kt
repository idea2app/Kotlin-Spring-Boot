package com.ideapp.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @Autowired
    lateinit var userService: UserService;

    @RequestMapping("getUser")
    fun getUser(): String {
        return userService.getUserInfo();
    }
}
