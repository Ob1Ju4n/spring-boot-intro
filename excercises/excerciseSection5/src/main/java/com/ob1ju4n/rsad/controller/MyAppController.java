package com.ob1ju4n.rsad.controller;

import com.ob1ju4n.rsad.domain.Watch;
import com.ob1ju4n.rsad.service.MyAppService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by j.ortiz on 05/08/2016.
 */
@Controller
@RequestMapping("/watches")
public class MyAppController {

    private static final Logger logger = LoggerFactory.getLogger(MyAppController.class);
    private MyAppService myAppService;

    @RequestMapping("/")
    public String home(Model model){
        return "views/home";
    }

    @RequestMapping("/main")
    public String watches(Model model){

        model.addAttribute("watches", myAppService.getWatches());

        return "views/list";
    }

    @RequestMapping("{id}")
    public String findWatch(@PathVariable(value = "id") String id) throws Exception{

        Watch watch = null;
        if(watch == null){
            throw new Exception("The item with the ID " +id+ " is not available in our inventory");
        }

        return "watch";
    }

    /*@ExceptionHandler(Exception.class)
    public String handleException(HttpServletRequest request, Exception ex, Model model){
        model.addAttribute("errorMessage", ex.getMessage());
        return "watchError";
    }*/

    @Autowired
    public void setMyAppService(MyAppService myAppService) {
        this.myAppService = myAppService;
    }
}
