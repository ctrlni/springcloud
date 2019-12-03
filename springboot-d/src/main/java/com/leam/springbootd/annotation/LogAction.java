package com.leam.springbootd.annotation;

import java.lang.annotation.*;

/**
 * 注解 运行时
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAction {
    String name();
}
