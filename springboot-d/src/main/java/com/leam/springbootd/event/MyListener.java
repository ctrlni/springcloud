package com.leam.springbootd.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听类
 */
@Component
public class MyListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        applicationEvent.getSource();
        System.out.println(applicationEvent.getSource());
    }
}
