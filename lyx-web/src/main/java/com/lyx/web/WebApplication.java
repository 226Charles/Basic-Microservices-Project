package com.lyx.web;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.lyx.web","com.lyx.common"})
@EnableDubbo
public class WebApplication {
    public static void main(String args[]){
        SpringApplication.run(WebApplication.class,args);
    }
}
