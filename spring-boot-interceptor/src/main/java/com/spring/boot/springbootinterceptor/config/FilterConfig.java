package com.spring.boot.springbootinterceptor.config;

import com.spring.boot.springbootinterceptor.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:FilterConfig
 * Package:com.spring.boot.springbootinterceptor.config
 * Description:过滤器创建方式二   方式二不需要在启动类上加上@ServletComponentScan 和自定义过滤器上的@WebFilter
 *
 * @Date:2022/6/30 17:34
 * @Author:gaomingfa
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFilterRegistration(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        //过滤所有请求
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
