package com.netease.kaola.springboot.test01.HelloWorld.controller;

import com.netease.kaola.springboot.test02.config.bean.DataSource;
import com.netease.kaola.springboot.test02.config.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @Autowired
    private Person person;

    @Autowired
    private DataSource dataSource;
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        System.out.println(person);
        System.out.println(dataSource);
        return "helloworld";
    }
}
