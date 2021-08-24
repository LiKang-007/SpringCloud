package com.springcloud.service;

import com.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:LiKang
 * @Date:2021/8/23 -08 -23 -20:49
 * @Description: com.springcloud.service
 * @version: 1.0
 */
@Component
@FeignClient(value="SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClinentServiceFallbackFactory.class)
public interface DeptClinentService {
    @GetMapping("/dept/get/{id}")
     Dept queryById(@PathVariable("id") Long id);
    @GetMapping("/dept/list")
    List<Dept> queryAll();
    @PostMapping("/dept/add")
     boolean addDept(Dept dept);
}
