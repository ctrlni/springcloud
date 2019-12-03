package com.leam.springbootd.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.stereotype.Component;

/**
 * 发布类
 */
@Component
public class MyPublish  {
    @Autowired
   ApplicationContext context;
   public void publish(String msg){
       context.publishEvent(new MyEvent(msg,msg));
   }


}
