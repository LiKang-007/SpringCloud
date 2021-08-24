package com.springcloud;

import com.myRule.Rule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Auther:LiKang
 * @Date:2021/8/22 -08 -22 -22:57
 * @Description: com.springcloud
 * @version: 1.0
 */
//Ribbon和Eureka集成之后，客户端可以直接调用，不用关心IP地址和端口号

@SpringBootApplication
@EnableEurekaClient //表示是eureka的客户端
@RibbonClient(name="SPRINGCLOUD-PROVIDER-DEPT",configuration = Rule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
