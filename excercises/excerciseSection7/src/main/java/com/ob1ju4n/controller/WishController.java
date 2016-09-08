package com.ob1ju4n.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Juan on 23/08/2016.
 */
@RestController
@RequestMapping("/api/wishes")
public class WishController {

    @RequestMapping(method = RequestMethod.GET)
    public String list(){
        return "Hello wishes!";
    }

    @Secured("ROLE_USER")
    @RequestMapping( value = "/{id}", method = RequestMethod.POST)
    public String read(@PathVariable(value = "id") String id){
        return "Specific wish";
    }

    @Secured({"ROLE_ADMIN","ROLE_USER"})
    @RequestMapping(value = "/add")
    public String addWish(){

        foo();
        return "Wish added...";
    }

    private void foo(){
        // do something
    }
}
