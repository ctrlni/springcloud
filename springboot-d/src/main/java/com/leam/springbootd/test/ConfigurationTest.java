package com.leam.springbootd.test;

import com.leam.springbootd.aware.AwareBean;
import com.leam.springbootd.aware.AwareConfig;
import com.leam.springbootd.aware.AwareService;
import com.leam.springbootd.config.DiConfig;
import com.leam.springbootd.config.JavaConfig;
import com.leam.springbootd.config.PreConfig;
import com.leam.springbootd.event.EventConfig;
import com.leam.springbootd.event.MyPublish;
import com.leam.springbootd.proflie.ProfileBean;
import com.leam.springbootd.proflie.ProfileConfig;
import com.leam.springbootd.scheduler.SchedulerConfig;
import com.leam.springbootd.scheduler.SchedulerService;
import com.leam.springbootd.service.*;
import com.leam.springbootd.task.AsyncService;
import com.leam.springbootd.task.TaskExecutorConfig;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解测试
 */

public class ConfigurationTest {
    /**
     * 测试ComponentScan
     */
    public static void testComponentScan(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        FunctionService functionService=context.getBean(FunctionService.class);
        System.out.println(functionService.sayHello("ComponentScan"));
    }
    /**
     * 测试Bean
     */
    public static void testBeanAnnotation(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        FunctionForBeanService functionService= (FunctionForBeanService) context.getBean("functionForBeanService1");

        FunctionForBeanService functionService1= context.getBean(FunctionForBeanService.class);
        System.out.println(functionService.sayHello("BeanAnnotation for Name"));
        System.out.println(functionService1.sayHello("BeanAnnotation for Type"));
    }
    /**
     * 测试Bean
     */
    public static void testAspect(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        DemoAnnotAspectService annotAspectService=context.getBean(DemoAnnotAspectService.class);
        DemoAspectService aspectService=context.getBean(DemoAspectService.class);
        annotAspectService.add("123","4546");
        aspectService.add("ABC","EFG");
    }
    /**
     * 测试Bean初始化和销毁
     */
    public static void testPre(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PreConfig.class);
        JSR250Service annotAspectService=context.getBean(JSR250Service.class);
        BeanWayService aspectService=context.getBean(BeanWayService.class);

    }
    /**
     * 测试Profile注解，根据不同配置加载不同环境
     */
    public static void testProfile(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("test");
        context.register(ProfileConfig.class);
        context.refresh();
        context.getBean(ProfileBean.class);

    }
    /**
     * 测试事件监听
     */
    public static void testEvent(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EventConfig.class);
        MyPublish publish=context.getBean(MyPublish.class);
        publish.publish("test publish");

    }
    /**
     * 测试Aware
     */
    public static void testAware(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService service=context.getBean(AwareService.class);
        service.out();
    }
    /**
     * 测试 Task 线程
     */
    public static void testTask(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncService service=context.getBean(AsyncService.class);
        for (int i = 0; i < 25; i++) {
            service.execute(i);
            service.executePlus(i);
        }
    }
    /**
     * 测试 Scheduler
     */
    public static void testScheduler(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SchedulerConfig.class);

    }
    public static void main(String[] args) {
//       testComponentScan();
//        testBeanAnnotation();
//        testAspect();
        testScheduler();
    }
}
