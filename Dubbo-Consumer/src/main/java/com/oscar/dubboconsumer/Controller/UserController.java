package com.oscar.dubboconsumer.Controller;

import com.Oscar.Service.Service;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference(url = "dubbo://127.0.0.1:20880")
    private Service service;

    @RequestMapping("/")
    public Object getStudent(){
        return service.getUser(1);
    }

    @RequestMapping("/hello")
    public String hello(){
        return service.hello("oscar");
    }
}