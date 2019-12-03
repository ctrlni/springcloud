package com.leam.springbootd.scheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * boot 计划任务
 *
 */
@Configuration
@ComponentScan("com.leam.springbootd.scheduler")
@EnableScheduling
@EnableAspectJAutoProxy
public class SchedulerConfig {
}
