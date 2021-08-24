package com.springcloud.controller;


import com.springcloud.pojo.Dept;
import com.springcloud.service.DeptClinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @Autowired
    private DeptClinentService deptClinentService;
    private static  final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return this.deptClinentService.queryById(id);
    }
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){

        return this.deptClinentService.addDept(dept);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> queryAll(){

        return this.deptClinentService.queryAll();
    }
}