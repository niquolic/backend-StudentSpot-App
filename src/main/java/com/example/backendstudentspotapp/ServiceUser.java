package com.example.backendstudentspotapp;

import com.example.backendstudentspotapp.Entities.User;
import com.example.backendstudentspotapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {

    @Autowired
    UserRepository userRepo;

    public User getUserByLoginAndPassword(String login, String password){

        User us = userRepo.findByLoginAndPassword(login, password).orElseThrow();

        return us;

    }

}
