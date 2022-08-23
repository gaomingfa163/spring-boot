package com.spring.boot.springbootinterceptor.config;

import com.spring.boot.springbootinterceptor.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName:InterceptorConig
 * Package:com.spring.boot.springbootinterceptor.config
 * Description:拦截器配置类     配置自定义的拦截器
 *
 * @Date:2022/6/30 17:08
 * @Author:gaomingfa
 */
@Configuration
public class InterceptorConig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new MyInterceptor());
        //添加拦截请求  所有的都拦截
        interceptorRegistration.addPathPatterns("/*");
        //添加不拦截的请求
        interceptorRegistration.excludePathPatterns("/login");
    }
}
