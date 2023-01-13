package com.boot.controller;

import com.boot.bean.Person;
import com.boot.bean.Student;
import com.boot.bean.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController
public class HelloController {
    @Autowired
    private Student student;
    @Autowired
    private Type type;

    @Autowired
    private Person person;

    @RequestMapping("/student")
    public Student student(){
        return student;
    }

    @RequestMapping("/hello2")
    public String hello(@RequestParam("name") String name){
        return "Hello SpringBoot 2!"+name;
    }

    @RequestMapping("/type")
    public Type Ttype(){
        return  type;
    }

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
