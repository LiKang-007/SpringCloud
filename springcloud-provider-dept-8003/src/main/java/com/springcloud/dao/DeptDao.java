package com.springcloud.dao;

import com.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:LiKang
 * @Date:2021/8/22 -08 -22 -14:59
 * @Description: com.springcloud.dao
 * @version: 1.0
 */
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAll();
}
