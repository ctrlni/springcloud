package com.leam.springbootd.service;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello "+word;
    }
}
