package cn.lee.springboot_uidgen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baidu.fsg.uid.worker.dao")
public class SpringbootUidgenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUidgenApplication.class, args);
    }

}
