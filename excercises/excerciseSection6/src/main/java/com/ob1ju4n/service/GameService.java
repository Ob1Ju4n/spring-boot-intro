package com.ob1ju4n.service;

import com.ob1ju4n.domain.Game;
import com.ob1ju4n.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by j.ortiz on 17/08/2016.
 */
@Service
public class GameService {

    private GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game getLatestGame(){
        return gameRepository.findFirstByOrderByReleaseDateDesc();
    }
}
