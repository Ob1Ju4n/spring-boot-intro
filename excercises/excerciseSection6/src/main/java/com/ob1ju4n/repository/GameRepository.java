package com.ob1ju4n.repository;

import com.ob1ju4n.domain.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by Juan on 16/08/2016.
 */
@Repository
public interface GameRepository extends CrudRepository<Game, Long> {

    Game findFirstByOrderByReleaseDateDesc();
    Game findByName(String name);
    Iterable<Game> findByReleaseDateBetween(Date from, Date To);
}
