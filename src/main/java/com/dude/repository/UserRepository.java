package com.dude.repository;

import com.dude.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by can.yegane on 17/11/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {


}
