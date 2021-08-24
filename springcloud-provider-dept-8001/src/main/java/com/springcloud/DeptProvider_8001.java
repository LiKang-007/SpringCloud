package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther:LiKang
 * @Date:2021/8/22 -08 -22 -15:19
 * @Description: com.springcloud
 * @version: 1.0
 */
//启动类
@EnableEurekaClient //在服务启动后自动注册到Eureka server中
@SpringBootApplication
public class DeptProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001.class,args);
    }
}
