package com.gmf.start.springbootautoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:UserAutoConfiguration
 * Package:com.gmf.start.springbootautoconfig
 * Description:自动配置类
 *
 * @Date:2022/7/12 15:07
 * @Author:gaomingfa
 */


@Configuration
@ConditionalOnWebApplication//在web应用下启用
@EnableConfigurationProperties(UserProperties.class) //开启配置类
public class UserAutoConfiguration {

    @Autowired
    private UserProperties userProperties;

    @Bean
    @ConditionalOnMissingBean(UserService.class)//当容器中没有的时候就创建这个对象
    public UserService addUserService(){
        return new UserService(userProperties);
    }
}
