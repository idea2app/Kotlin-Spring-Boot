package com.ideapp.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @Autowired
    lateinit var userService: UserService;

    @RequestMapping("getUser")
    @ResponseBody
    fun getUser(): User {
        return userService.getUserInfo();
    }
}
