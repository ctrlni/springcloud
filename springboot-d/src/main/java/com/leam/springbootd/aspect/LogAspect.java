package com.leam.springbootd.aspect;

import com.leam.springbootd.annotation.LogAction;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Aop
 *   @After("annotationPointCut()") 注解 切面
 * @Before("execution(* com.leam.springbootd.service.DemoAspectService.*(..))") 编程切面
 */
@Aspect
@Component
public class LogAspect {
    /**
     * 根据注解南京
     */
    @Pointcut("@annotation(com.leam.springbootd.annotation.LogAction)")
    public void annotationPointCut(){}

    /**
     * 获取注解值 入参参数 参数名
     * @param joinPoint
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
            System.out.println(joinPoint.getArgs().toString());
        Method method=signature.getMethod();
        LogAction logAction=method.getAnnotation(LogAction.class);
        System.out.println("注解式拦截 注解参数"+logAction.name());
        System.out.println("注解式拦截 入口参数"+signature.getParameterNames().toString());
        System.out.println("注解式拦截 方法名称"+method.getName());

    }

    /**
     * 编程式Aop
     * @param joinPoint
     */
    @Before("execution(* com.leam.springbootd.service.DemoAspectService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        System.out.println(joinPoint.getArgs().toString());
        Method method=signature.getMethod();
        System.out.println("编程式Aop 入口参数"+signature.getParameterNames().toString());
        System.out.println("编程式Aop 方法名称"+method.getName());
    }
}
