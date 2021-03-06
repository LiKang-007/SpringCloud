package com.springcloud.controller;


import com.springcloud.pojo.Dept;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;


/**
 * @Auther:LiKang
 * @Date:2021/8/22 -08 -22 -22:27
 * @Description: com.springcloud.controller
 * @version: 1.0
 */
@RestController
public class DeptConsumerController {
    //理解：消费者，不应该有server层
    //RestTemplate .....供我们直接调用就可以了，注册到Spring中
    //(url,实体：Map，Class<T> reponseType)
    @Autowired
    private RestTemplate restTemplate;//提供多种便捷访问远程http服务的方法，简单的restful服务模板

    //private static  final String REST_URL_PREFIX="http://localhost:8001";//写死了访问的地址（相当于直连）
    //Ribbon实现负载均衡，这里的地址应该是一个变量，通过服务名来访问
    private static  final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> queryAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

}