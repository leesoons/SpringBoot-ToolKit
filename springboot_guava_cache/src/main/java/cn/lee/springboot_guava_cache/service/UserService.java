package cn.lee.springboot_guava_cache.service;

import cn.lee.springboot_guava_cache.entity.User;
import cn.lee.springboot_guava_cache.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers(){
        return userMapper.getUsers();
    }

    public int addUser(User user){
        return userMapper.addUser(user);
    }

    @Cacheable(value = "user", key = "#userName")
    public List<User> getUsersByName(String userName){
        List<User> users = userMapper.getUsersByName(userName);
        System.out.println("数据库读取数据中...");
        return users;
    }
}
