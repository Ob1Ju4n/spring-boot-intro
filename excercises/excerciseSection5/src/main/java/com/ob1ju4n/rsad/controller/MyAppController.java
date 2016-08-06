package com.ob1ju4n.rsad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by j.ortiz on 05/08/2016.
 */
@Controller
public class MyAppController {

    @RequestMapping("/")
    public String home(){
        return "Here is the home page...";
    }

    @RequestMapping("/watches")
    public String watches(){
        return "Pebble steel, Sony SmartWatch 3";
    }

}
