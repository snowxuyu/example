package org.snow.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by snowxuyu on 2016/7/13.
 */
@RestController
public class HellowController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(String name) {
        System.out.println("=========== hello " + name);
        return  "hello" + name;
    }
}
