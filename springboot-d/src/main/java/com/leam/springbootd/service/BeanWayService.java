package com.leam.springbootd.service;

import javax.annotation.PostConstruct;

/**
 * Bean的初始化于销毁 Spring
 *
 */
public class BeanWayService {
    public BeanWayService() {
        System.out.println(" BeanWayService");
    }

    /**
     * 初始化
     */
    public void post(){
        System.out.println("Spring PostConstruct");
    }
    /**
     * 销毁
     */

    public void pre(){
        System.out.println("Spring pre");
    }
}
