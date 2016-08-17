package com.ob1ju4n.service;

import com.ob1ju4n.domain.Game;
import com.ob1ju4n.domain.Manufacturer;
import com.ob1ju4n.domain.Platform;
import com.ob1ju4n.repository.GameRepository;
import com.ob1ju4n.repository.ManufacturerRepository;
import com.ob1ju4n.repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by j.ortiz on 17/08/2016.
 */
@Service
public class DataLoader {

    private GameRepository gameRepository;
    private ManufacturerRepository manufacturerRepository;
    private PlatformRepository platformRepository;

    @Autowired
    public DataLoader(GameRepository gameRepository, ManufacturerRepository manufacturerRepository, PlatformRepository platformRepository) {
        this.gameRepository = gameRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.platformRepository = platformRepository;
    }

    @PostConstruct
    private void loadData(){

        //Create Manufacturer
        Manufacturer manufacturer = new Manufacturer("PC");
        manufacturerRepository.save(manufacturer);

        //Create a platform
        Platform platform = new Platform("Steam", manufacturer);
        platformRepository.save(platform);

        //Create game
        Calendar c = GregorianCalendar.getInstance();
        c.set(2016, Calendar.FEBRUARY, 5);
        String description = "XCOM: Enemy Unknown is a turn-based tactical video game, developed by Firaxis" +
                " Games and published by 2K Games. The game is a reimagined remake of the 1994 cult classic" +
                " strategy game UFO: Enemy Unknown (also known as X-COM: UFO Defense) and a reboot of" +
                " MicroProse's 1990s X-COM series.";
        Game game = new Game("XCOM 2", true, 9D, c.getTime(), description, Arrays.asList(platform));
        game.setImgName("xcom2.jpg");
        gameRepository.save(game);

    }
}
