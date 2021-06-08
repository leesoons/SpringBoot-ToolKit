package cn.lee.springboot_guava_cache.controller;

import cn.lee.springboot_guava_cache.entity.User;
import cn.lee.springboot_guava_cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    CacheManager cacheManager;

    @RequestMapping(value = "/getuserbyname", method = RequestMethod.GET)
    public List<User> getUsersByName(@RequestBody User user){
        System.out.println("------------------");
        System.out.println("call /getuserbyname");
        System.out.println(cacheManager.toString());
        List<User> users = userService.getUsersByName(user.getUserName());
        return users;
    }
}
