package cn.lee.springboot_ehcache.mapper;

import cn.lee.springboot_ehcache.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> getUsers();

    int addUser(User user);

    List<User> getUsersByName(String name);
}
