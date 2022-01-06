package com.ideapp.user

import org.springframework.stereotype.Service

class User {
    var name: String = ""
    var age: Int = 0
}

@Service
class UserService {
    fun getUserInfo(): User {
        var user = User()
        user.name = "诗杰"
        user.age = 18
        return user
    }
}
