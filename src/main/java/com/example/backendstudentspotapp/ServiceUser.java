package com.example.backendstudentspotapp;

import com.example.backendstudentspotapp.Entities.User;
import com.example.backendstudentspotapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {

    @Autowired
    UserRepository userRepo;

    public User getUserByMyId(String id){

      // return this.userRepo.findById(Long.valueOf(id)).orElseThrow();
        User us = new User();
        us.setPrenom("Nicolas");
        return us;
    }

}
