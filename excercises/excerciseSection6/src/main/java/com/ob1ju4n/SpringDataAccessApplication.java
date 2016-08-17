package com.ob1ju4n;

import com.ob1ju4n.domain.Game;
import com.ob1ju4n.repository.GameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringDataAccessApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringDataAccessApplication.class);

	@Autowired
	GameRepository gameRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataAccessApplication.class, args);
	}

	@PostConstruct
	void seeGames(){
		logger.info("seeGames method called...");
		for(Game game: gameRepository.findAll()){
			logger.info(game.toString());
		}
	}
}
