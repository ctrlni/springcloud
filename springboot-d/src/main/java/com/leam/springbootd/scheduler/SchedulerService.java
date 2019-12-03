package com.leam.springbootd.scheduler;

import org.springframework.context.annotation.Conditional;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * boot 计划任务
 *
 */
@Service
public class SchedulerService{
    private static final SimpleDateFormat DATE_FORMAT=new SimpleDateFormat("HH:mm:ss");
    /**
     * 初始化2秒执行、每个五秒执行
     */
    @Scheduled(fixedRate = 5000)
    public void currentTime(){
        System.out.println("执行事件: "+DATE_FORMAT.format(new Date()));
    }
}
