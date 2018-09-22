package com.zc.tower.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangchi
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.zc.tower")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
