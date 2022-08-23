package com.gmf.start.springbootautoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName:UserProperties
 * Package:com.gmf.start.springbootautoconfig
 * Description:自定义配置类
 *
 * @Date:2022/7/12 14:52
 * @Author:gaomingfa
 */
@Component //添加注解@Component，声明将这个组件添加至容器中，这样才可以被使用
@ConfigurationProperties(prefix = "gmf.user")
public class UserProperties {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
