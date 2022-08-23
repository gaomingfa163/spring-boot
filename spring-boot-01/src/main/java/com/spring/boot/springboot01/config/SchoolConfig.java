package com.spring.boot.springboot01.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * ClassName:SchoolConfig
 * Package:com.spring.boot.springboot01.config
 * Description:
 *
 * @Date:2022/6/28 17:04
 * @Author:gaomingfa
 */
@Component
@PropertySource(value = "classpath:schools.properties") //这一行注解只是用来使自己配置的properties的，如果用系统的则不需要配置
@ConfigurationProperties(prefix = "school") //读取配置文件中school开头的属性
public class SchoolConfig {

    private String name;

    private String address;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
