package com.example.backendstudentspotapp.controller;

import com.example.backendstudentspotapp.entities.UserEntity;
import com.example.backendstudentspotapp.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    ServiceUser serviceUser;

    @GetMapping("/getUserByLoginAndPassword")
    public UserEntity getUserByLoginAndPassword(@RequestParam() String login, @RequestParam() String password){

        System.out.println("User received : " + login + " " + password);

        return serviceUser.getUserByLoginAndPassword(login, password);

    }

}
