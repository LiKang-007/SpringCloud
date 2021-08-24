package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther:LiKang
 * @Date:2021/8/22 -08 -22 -22:57
 * @Description: com.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient //表示是eureka的客户端
@EnableFeignClients(basePackages = {"com.springcloud"})
@ComponentScan(value={"com.springcloud"})
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }
}
