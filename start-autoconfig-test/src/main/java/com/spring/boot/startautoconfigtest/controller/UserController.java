package com.spring.boot.startautoconfigtest.controller;

import com.gmf.start.springbootautoconfig.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:UserController
 * Package:com.spring.boot.startautoconfigtest.controller
 * Description:
 *
 * @Date:2022/7/12 15:39
 * @Author:gaomingfa
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/validate")
    public boolean validate(){
        return userService.validate();
    }
}
