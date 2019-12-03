package com.leam.springbootd.config;

import com.leam.springbootd.service.FunctionForBeanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration 定义当前类是配置类
    @Bean 注解某个bean 可根据 name 和type 获取
 *
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionForBeanService functionForBeanService1(){
        return new FunctionForBeanService();
    }
}
