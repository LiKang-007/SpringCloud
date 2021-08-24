package com.springcloud.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
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
    //获取一些配置信息，得到具体的微服务
    @Autowired
    private DiscoveryClient clinent;
    @Autowired
    DeptService deptService;
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
         return deptService.addDept(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id ){
        return deptService.queryById(id);
    }
    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
    //注册进来的微服务，获取一些消息
    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> services = clinent.getServices();
        System.out.println("discovery=>services:"+services);

        //得到一个具体的微服务信息,通过具体的微服务ID，也就是applciationName
        List<ServiceInstance> instances = clinent.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance:instances){
            System.out.println(
                            instance.getHost()+"\t"+
                            instance.getPort()+"\t"+
                            instance.getUri()+"\t"+
                            instance.getServiceId()+"\t"
            );
        }
        return this.clinent;

    }


}
