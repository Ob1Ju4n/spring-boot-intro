package com.ob1ju4n.controller;

import com.ob1ju4n.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by j.ortiz on 17/08/2016.
 */
@Controller
@RequestMapping("/games")
public class HomeController {

    private GameService gameService;

    @Autowired
    public HomeController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping("/")
    public String home(Model model){

        model.addAttribute("game", gameService.getLatestGame());
        return "home";
    }


}
