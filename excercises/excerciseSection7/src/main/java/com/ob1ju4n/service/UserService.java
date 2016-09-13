package com.ob1ju4n.service;

import com.ob1ju4n.domain.User;

/**
 * Created by Juan on 11/09/2016.
 */
public interface UserService {

    public User findByEmail(String email);
}
