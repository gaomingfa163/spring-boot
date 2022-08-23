package com.gmf.start.springbootautoconfig;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * ClassName:UserService
 * Package:com.gmf.start.springbootautoconfig
 * Description:
 *
 * @Date:2022/7/12 15:04
 * @Author:gaomingfa
 */

public class UserService {

    private UserProperties userProperties;

    public UserService(UserProperties user){
        this.userProperties = user;
    }
    public UserService(){

    }

    public boolean validate(){
        if("admin".equals(userProperties.getName()) && "123".equals(userProperties.getPassword())){
            return true;
        }
        return false;
    }
}
