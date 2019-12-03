package com.leam.springbootd.config;

import com.leam.springbootd.service.BeanWayService;
import com.leam.springbootd.service.FunctionForBeanService;
import com.leam.springbootd.service.JSR250Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration 定义当前类是配置类
    @Bean 注解某个bean 可根据 name 和type 获取
 *
 */
@Configuration
public class PreConfig {
    @Bean
    public JSR250Service jsr250Service(){
        return new JSR250Service();
    }
    @Bean(initMethod = "post",destroyMethod = "pre")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }
}
