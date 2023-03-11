package com.example.backendstudentspotapp.service;

import com.example.backendstudentspotapp.entities.UserEntity;
import com.example.backendstudentspotapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {

    @Autowired
    UserRepository userRepo;

    public UserEntity getUserByLoginAndPassword(String login, String password){

        UserEntity us = userRepo.findByLoginAndPassword(login, password).orElseThrow();

        return us;

    }

}
