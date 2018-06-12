package com.anji.springbootdruid1.repository;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/12 10:29
 */

import com.anji.springbootdruid1.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    @Query("select l from User l ")
    public List<User> findAll();
}