package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther:LiKang
 * @Date:2021/8/23 -08 -23 -9:23
 * @Description: com.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer //@EnableEurekaServer 服务端的启动类，可以接受别人注册进来
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
