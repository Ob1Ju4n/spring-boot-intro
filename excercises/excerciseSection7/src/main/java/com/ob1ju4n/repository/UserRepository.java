package com.ob1ju4n.repository;

import com.ob1ju4n.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Juan on 11/09/2016.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
}
