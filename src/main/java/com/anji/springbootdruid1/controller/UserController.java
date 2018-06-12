package com.anji.springbootdruid1.controller;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/12 10:28
 */

import com.anji.springbootdruid1.model.User;
import com.anji.springbootdruid1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService ;

    @RequestMapping(value = "/userlist")
    public List<User> getUserList(){
        return userService.findAll() ;
    }
}