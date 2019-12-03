package com.leam.springbootd.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 发布类
 */
@Configuration
@ComponentScan("com.leam.springbootd.event")
public class EventConfig {
    @Autowired
   ApplicationContext context;
   public void publish(String msg){
       context.publishEvent(new MyEvent(this,msg));
   }
}
