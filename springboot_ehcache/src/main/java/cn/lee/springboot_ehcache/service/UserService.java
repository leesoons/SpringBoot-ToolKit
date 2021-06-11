package cn.lee.springboot_ehcache.service;

import cn.lee.springboot_ehcache.Entity.User;
import cn.lee.springboot_ehcache.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Cacheable(value = "user", key = "#userName")
    public List<User> getUsersByName(String userName){
        List<User> users = userMapper.getUsersByName(userName);
        System.out.println("读取数据库数据中...");
        return users;
    }
}
