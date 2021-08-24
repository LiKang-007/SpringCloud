package com.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther:LiKang
 * @Date:2021/8/22 -08 -22 -14:13
 * @Description: com.springcloud.pojo
 * @version: 1.0
 */
@Data
@NoArgsConstructor//无参构造
@Accessors(chain=true)//链式写法
public class Dept implements Serializable { //实体类，orm 类表关系映射
    private Long deptno;//主键
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
    /*
    *
    *   Dept dept =new Dept();
    *   dept.setDeptNo(11);
    * 链式写法：
    *   dept.setDeptNo(11).setDname().setDb_source();
    * */
}
