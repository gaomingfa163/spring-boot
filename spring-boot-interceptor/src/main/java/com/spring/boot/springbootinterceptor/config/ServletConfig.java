package com.spring.boot.springbootinterceptor.config;

import com.spring.boot.springbootinterceptor.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:ServletConfig
 * Package:com.spring.boot.springbootinterceptor.config
 * Description:servlet 创建方式二
 *
 * @Date:2022/7/1 14:38
 * @Author:gaomingfa
 */
@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet());
        servletRegistrationBean.addUrlMappings("/servlet");
        return servletRegistrationBean;
    }
}
