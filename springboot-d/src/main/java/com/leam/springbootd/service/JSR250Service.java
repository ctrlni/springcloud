package com.leam.springbootd.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Bean的初始化于销毁 JSR250
 *
 */
public class JSR250Service {
    public JSR250Service() {
        System.out.println(" JSR250Service");
    }

    /**
     * 初始化
     */
    @PostConstruct
    public void post(){
        System.out.println("JSR250 PostConstruct");
    }
    /**
     * 销毁
     */
    @PostConstruct
    public void pre(){
        System.out.println("JSR250 pre");
    }
}
