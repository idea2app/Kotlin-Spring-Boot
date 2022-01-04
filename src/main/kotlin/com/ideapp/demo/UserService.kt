package com.ideapp.demo

import org.springframework.stereotype.Service

@Service
class UserService {
    fun getUserInfo():String{
        var user  = User();
        user.userName = "诗杰";
        user.age = 25;
        return "user ${user.userName} age ${user.age}";
    }
}

class User () {
    var userName: String = "";
    var age:Int = 0;
}