package com.devil.han.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Han
 * @date 2020/9/13
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("this is a test");
        return " ";
    }
}
