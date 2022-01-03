package com.ideapp.kotlinspringboot

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @RequestMapping("getUser")
    fun getUser(): String {
        val userName = User().userName;
        val age = User().age;
        return "name $userName,age $age ";
    }
}

class User () {
    var userName:String = "系统用户";
    var age:Int = 18;
}