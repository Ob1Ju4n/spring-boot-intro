package com.ob1ju4n.rsad.controller;

import com.ob1ju4n.rsad.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Juan on 4/08/2016.
 */
@RestController
public class HomeController {

    @Value("${mywallet.funds}")
    private String currentFunds;

    private ExampleService exampleService;

    @RequestMapping("/")
    public String home(){
        return "This is the home page";
    }

    @RequestMapping("/funds")
    public String showFunds(){
        return currentFunds;
    }

    @RequestMapping("/user")
    public String currentUser(){
        return exampleService.getUserFullName();
    }

    @Autowired
    public void setExampleService(ExampleService exampleService) {
        this.exampleService = exampleService;
    }
}

