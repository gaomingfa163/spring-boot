package com.spring.boot.springbootinterceptor.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * ClassName:MyFilter
 * Package:com.spring.boot.springbootinterceptor.filter
 * Description:过滤器  方式一
 *
 * @Date:2022/6/30 17:22
 * @Author:gaomingfa
 */
//@WebFilter(urlPatterns = "/*") //过滤所有的  搭配ServletComponentScan一起使用
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("我的过滤器");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
