package cn.lee.springboot_guava_cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("cn.lee.springboot_guava_cache")
public class SpringbootGuavaCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGuavaCacheApplication.class, args);
    }

}
