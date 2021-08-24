package com.springcloud.config;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther:LiKang
 * @Date:2021/8/22 -08 -22 -22:31
 * @Description: com.springcloud.config
 * @version: 1.0
 */
/*
* Ribbon提供的负载均衡算法
*   IRule接口
*       1、RoundRobinRule： 默认 轮询
*       2、AvailabilityFilteringRule：先过滤掉跳闸，访问故障的服务，对剩下的进行轮询
*       3、RandomRule： 随机
*       4、RetryRule：会先按照轮询获取服务，如果服务获取失败，则会在指定的时间内进行重试
*
* */
/*
    自定义负载均衡算法
    实现IRule接口
* */

@Configuration//配置类
public class ConfigBean {

    @Bean
    @LoadBalanced//Ribbon 配置负载均衡实现RestTemplate
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //指定随件代替轮询
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }



}
