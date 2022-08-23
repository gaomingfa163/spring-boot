package com.gmf.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:JSPController
 * Package:com.gmf.springbootjsp.controller
 * Description:springboot 使用jsp
 *
 * @Date:2022/6/29 15:55
 * @Author:gaomingfa
 */
@Controller
public class JSPController {

    @GetMapping("/show")
    public String showJsp(Model model){
        System.out.println("------------------------");
        model.addAttribute("msg","hello");
        //因为在properties中配置了视图解析器，所以直接返回jsp文件的名称
        //这个有个问题就是找不到jsp   怎么解决呢  设置working directory 工作路径为$MODULE_DIR$,右侧的下拉选可以选

        return "test";
    }
}
