package com.xuecheng.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Map;

/**
 * @author Administrator
 * @title: UserController
 * @projectName xc-houduan
 * @description: TODO
 * @date 2019/8/5/000514:23
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Environment environment;

    @RequestMapping
    public String info(Map<String,Object> root) {
        String name = environment.getProperty("student.name");
        System.out.println("name:"+ name);
        root.put("javaee73", "helloWorld");
        return "index";
    }


}
