package cn.lee.springboot_guava_cache.mapper;

import cn.lee.springboot_guava_cache.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> getUsers();
    int addUser(User user);
    //也可以直接采用注解方式
    /*@Select("select * from guava_user.user where user_name = #{userName}")
    @Results(id = "UserMapper", value = {
            @Result(id = true, column = "user_id", property = "userId"),
            @Result(id = true, column = "user_name", property = "userName"),
            @Result(id = true, column = "user_age", property = "userAge")
    })*/
    List<User> getUsersByName(String userName);
}
