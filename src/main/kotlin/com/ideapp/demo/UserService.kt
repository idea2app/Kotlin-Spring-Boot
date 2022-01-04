package com.ideapp.demo

import org.springframework.stereotype.Service

@Service
class UserService {
    fun getUserInfo():User {
        var user = User();
        user.name = "诗杰";
        user.age = 18;
        return user;
    }
}

class User{
    var name:String = "";
    var age:Int=0;
}