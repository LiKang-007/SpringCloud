package com.springcloud.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.pojo.Dept;
import com.springcloud.service.DeptService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther:LiKang
 * @Date:2021/8/22 -08 -22 -15:13
 * @Description: com.springcloud.controller
 * @version: 1.0
 */
//提供RestController服务
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod ="hystriyget")//服务熔断时返回方法 "hystriyget"
    public Dept get(@PathVariable("id")Long id){
        Dept dept=deptService.queryById(id);
        if(dept==null){
            //运行时异常不捕获就崩了
            throw new RuntimeException("id"+id+"--不存在");
        }
        return dept;
    }
    //备选方案
    public Dept hystriyget(Long id){
       return new Dept().setDeptno(id).setDname("id"+id+"不存在");
    }
    }



