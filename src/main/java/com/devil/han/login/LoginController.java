package com.devil.han.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Han
 * @date 2020/9/13
 */
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {},allowCredentials = "true")
public class TestController {

    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password){
        System.out.println("login");
        System.out.println(username+"-"+password);
        return "success";
    }

    @RequestMapping("/auth/2step-code")
    public Boolean stepCode(){
        System.out.println("前端框架自带验证规则");
        return true;
    }
}
