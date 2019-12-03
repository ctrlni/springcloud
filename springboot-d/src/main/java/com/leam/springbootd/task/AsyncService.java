package com.leam.springbootd.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Async 异常处理
 */
@Component
public class AsyncService {
    @Async
    public void execute(int index){
        System.out.println("execute: "+index);
    }
    @Async
    public void executePlus(int index){
        System.out.println("executePlus: "+(index+1));
    }
}
