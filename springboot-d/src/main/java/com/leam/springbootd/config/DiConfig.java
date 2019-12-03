package com.leam.springbootd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

/**
 * Configuration 定义当前类是配置类
 * ComponentScan 定义自动扫描包下所有 Service Component Repository Controller{
 *     includeFilters = { @Filter(type = FilterType.ANNOTATION, value = Component.class) 加在指定注解
 *     excludeFilters 过滤指定注解
 *     FilterType 限制类型
 *
 * }
 *
 */
@Configuration
@ComponentScan(value = "com.leam.springbootd")
public class DiConfig {
}
