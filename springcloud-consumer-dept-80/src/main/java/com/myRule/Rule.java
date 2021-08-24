package com.myRule;

import org.springframework.context.annotation.Configuration;

/**
 * @Auther:LiKang
 * @Date:2021/8/23 -08 -23 -20:04
 * @Description: com.myRule
 * @version: 1.0
 */
/*
    自定义的Rule应该是指定使用的时候，加载。不指定使用的时候不加载
    所以自定义的Rule需要放在springboot默认扫描的范围之外，否则就会被所有的Ribbon共享（将不能在使用Ribbon提供的方式，会被自定义的rule代替）。

* */
@Configuration
public class Rule {

}
