package com.spring.boot.springbootthymeleaf.controller;

import com.spring.boot.springbootthymeleaf.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:ThymeleafController
 * Package:com.spring.boot.springbootthymeleaf.controller
 * Description:
 *
 * @Date:2022/7/12 19:35
 * @Author:gaomingfa
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/first")
    public String first(Model model){
        model.addAttribute("name","jdck");

        User user = new User();
        user.setId(1001);
        user.setName("mack");
        model.addAttribute("user",user);
        //视图解析器默认的后缀是html
        return "index";
    }
}
