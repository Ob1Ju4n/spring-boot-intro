package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Juan on 4/08/2016.
 */
@RestController
public class indexController {

    @RequestMapping("/")
    public String message(){
        return "Hello World!";
    }

    @RequestMapping("/sboot")
    public String messageSpringBoot(){
        return "Hello spring boot!";
    }

}
