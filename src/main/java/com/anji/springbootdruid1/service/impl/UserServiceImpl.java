package com.anji.springbootdruid1.service.impl;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/12 10:27
 */


import com.anji.springbootdruid1.model.User;
import com.anji.springbootdruid1.repository.UserRepository;
import com.anji.springbootdruid1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository ;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User book) {

    }

    @Override
    public User findOne(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }
}
