package cn.lee.springboot_security_jwt.service;

import cn.lee.springboot_security_jwt.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    User register(User user);
    String login(String username, String password);
}
