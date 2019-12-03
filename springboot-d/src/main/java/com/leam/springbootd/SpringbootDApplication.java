package com.leam.springbootd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app=SpringApplication.run(SpringbootDApplication.class, args);
    }

}
