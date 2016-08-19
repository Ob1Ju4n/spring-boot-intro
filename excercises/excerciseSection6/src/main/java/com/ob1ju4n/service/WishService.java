package com.ob1ju4n.service;

import com.ob1ju4n.domain.Wish;
import com.ob1ju4n.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by j.ortiz on 19/08/2016.
 */
@Service
public class WishService {

    private WishRepository wishRepository;

    @Autowired
    public WishService(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    public Iterable<Wish> list(){
        return wishRepository.findAll();
    }
}
