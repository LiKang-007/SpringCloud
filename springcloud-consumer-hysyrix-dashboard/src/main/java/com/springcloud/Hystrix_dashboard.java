package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Auther:LiKang
 * @Date:2021/8/24 -08 -24 -20:17
 * @Description: com.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard //开启Dashboard监控
public class Hystrix_dashboard {
    public static void main(String[] args) {
        SpringApplication.run(Hystrix_dashboard.class,args);

    }
}
