package cn.lee.springboot_security_jwt.controller;

import cn.lee.springboot_security_jwt.entity.User;
import cn.lee.springboot_security_jwt.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(value = "/authentication/login")
    public String createToken(String username, String password){
        return authService.login(username, password);//登录成功返回token
    }

    @PostMapping(value = "/authentication/register")
    public User register(@RequestBody User user){
        return authService.register(user);//注册用户
    }
}
