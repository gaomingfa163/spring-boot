package com.spring.boot.springbootinterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 *
 * 拦截器
 */
@SpringBootApplication
//@ServletComponentScan(basePackages = "com.spring.boot.springbootinterceptor.filter") //扫描 过滤器配置的注解
//@ServletComponentScan(basePackages = "com.spring.boot.springbootinterceptor.servlet") //servlet
public class SpringBootInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInterceptorApplication.class, args);
    }

}
