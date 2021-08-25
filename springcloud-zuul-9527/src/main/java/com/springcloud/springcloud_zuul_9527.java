package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import javax.swing.*;

/**
 * @Auther:LiKang
 * @Date:2021/8/25 -08 -25 -11:28
 * @Description: com.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class springcloud_zuul_9527 {
    public static void main(String[] args) {
        SpringApplication.run(springcloud_zuul_9527.class,args);
    }
}
