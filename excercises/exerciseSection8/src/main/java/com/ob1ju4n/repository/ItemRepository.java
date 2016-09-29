package com.ob1ju4n.repository;

import com.ob1ju4n.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Juan on 26/09/2016.
 */
@Repository
public interface ItemRepository extends CrudRepository<Item,Long> {

    List<Item> findAll();
}
