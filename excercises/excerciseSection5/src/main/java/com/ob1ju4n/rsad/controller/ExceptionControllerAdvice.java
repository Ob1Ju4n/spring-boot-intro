package com.ob1ju4n.rsad.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Juan on 12/08/2016.
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String exception(Exception ex, Model model){

        model.addAttribute("exception", ex);
        return "exceptionHandler";
    }
}
