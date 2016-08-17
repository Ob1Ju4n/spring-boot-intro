package com.ob1ju4n.repository;

import com.ob1ju4n.domain.Game;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Juan on 16/08/2016.
 */
public interface GameRepository extends CrudRepository<Game, Long> {
}
