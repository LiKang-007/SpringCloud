package com.springcloud.service;

import com.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Auther:LiKang
 * @Date:2021/8/22 -08 -22 -15:09
 * @Description: com.springcloud.service
 * @version: 1.0
 */
public interface DeptService {
    public boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAll();
}
