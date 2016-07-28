package com.theironyard.services;

import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by will on 7/18/16.
 */
public interface UserRepository extends CrudRepository<User, Integer>{
    User findFirstByNickname(String nickname);
}
