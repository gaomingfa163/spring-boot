package com.spring.boot.springboot01.controller;

import com.spring.boot.springboot01.config.SchoolConfig;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * ClassName:FisrtController
 * Package:com.spring.boot.springboot01.controller
 * Description:
 *
 * @Date:2022/6/23 16:39
 * @Author:gaomingfa
 */
@RestController
public class FisrtController {


    /*
    配置属性引入注入
     */
    @Value("${school.name}")
    private String schoolName;

    @Value("${school.address}")
    private String schoolAddress;

    @Value("${school.age}")
    private int age;

    @RequestMapping(value = "/first")
    public String getFisrtMethod(){
        String result = schoolName + ", " + schoolAddress + ", " + age;

        System.out.println(result);
        return result;
    }

    /*
    使用配置类  使配置的属性方法配置类中，然后引用类进行使用，更加的方便
     */
    @Autowired
    private SchoolConfig schoolConfig;

    @RequestMapping("/school")
    public String schoolConfigTest(){
        return schoolConfig.getAddress() + ", " + schoolConfig.getName() + ", " +schoolConfig.getAge();
    }
}
