package com.leam.springbootd.service;

import com.leam.springbootd.annotation.LogAction;
import org.springframework.stereotype.Service;

@Service
public class DemoAnnotAspectService {
    @LogAction(name = "注解式拦截")
    public void add(String name,String key){}
}
