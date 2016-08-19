package com.ob1ju4n.controller;

import com.ob1ju4n.domain.Game;
import com.ob1ju4n.service.GameService;
import com.ob1ju4n.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by j.ortiz on 17/08/2016.
 */
@Controller
@RequestMapping("/gtb")
public class HomeController {

    private GameService gameService;
    private WishService wishService;

    @Autowired
    public HomeController(GameService gameService, WishService wishService) {
        this.gameService = gameService;
        this.wishService = wishService;
    }

    @RequestMapping("/")
    public String home(Model model){

        model.addAttribute("wishes", wishService.list());
        return "views/home";
    }

    @RequestMapping("/wish/{id}")
    public String game(@PathVariable(value = "id") String id, Model model) throws Exception{

        Game game = new Game();
        game.setId(new Long(id));
        model.addAttribute("game", gameService.getGame(game));
        return "views/game";
    }



}
