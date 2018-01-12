package com.ichromanrd.apps.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dell
 */

@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    
}
