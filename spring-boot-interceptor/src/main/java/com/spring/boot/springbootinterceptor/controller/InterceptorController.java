package com.spring.boot.springbootinterceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:InterceptorController
 * Package:com.spring.boot.springbootinterceptor.controller
 * Description:
 *
 * @Date:2022/6/30 17:17
 * @Author:gaomingfa
 */
@RestController
public class InterceptorController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/add")
    public String add(){
        System.out.println("---add---");
        return "add";
    }
}
