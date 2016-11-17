package com.dude.repository;

import com.dude.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by can.yegane on 17/11/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByUserName(String username);

}
