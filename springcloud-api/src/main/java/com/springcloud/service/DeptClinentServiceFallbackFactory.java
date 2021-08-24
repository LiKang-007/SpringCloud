package com.springcloud.service;

import com.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther:LiKang
 * @Date:2021/8/24 -08 -24 -16:31
 * @Description: com.springcloud.service
 * @version: 1.0
 */
//配置服务降级
@Component
public class DeptClinentServiceFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptClinentService() {
            @Override
            public Dept queryById(Long id) {
                return new Dept().setDeptno(id).setDname("id==>"+id+"没有对应的信息，现在正在服务降级，该服务不可用");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
