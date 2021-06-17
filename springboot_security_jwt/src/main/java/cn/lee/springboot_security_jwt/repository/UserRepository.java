package cn.lee.springboot_security_jwt.repository;

import cn.lee.springboot_security_jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
