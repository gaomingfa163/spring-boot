package com.spring.boot.springbootinterceptor.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:MyServlet
 * Package:com.spring.boot.springbootinterceptor.servlet
 * Description:自定义servlet  也有两种方式 和过滤器一样
 *
 * @Date:2022/7/1 14:29
 * @Author:gaomingfa
 */
//@WebServlet("/servlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
