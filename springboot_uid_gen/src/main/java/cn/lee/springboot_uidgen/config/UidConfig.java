package cn.lee.springboot_uidgen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:uid/cached-uid-spring.xml"})
public class UidConfig {
}
