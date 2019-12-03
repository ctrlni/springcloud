package com.leam.springbootd.proflie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Profile 是环境变量根据不同的环境配置加载不同的配置
 *
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public ProfileBean devBean(){
        return new ProfileBean("dev");
    }
    @Bean
    @Profile("test")
    public ProfileBean testBean(){
        return new ProfileBean("test");
    }
}
