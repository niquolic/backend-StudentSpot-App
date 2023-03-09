package com.example.backendstudentspotapp.Controller;

import com.example.backendstudentspotapp.Entities.User;
import com.example.backendstudentspotapp.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    ServiceUser serviceUser;

    @GetMapping("/getUserByLoginAndPassword")
    public User getUserByLoginAndPassword(@RequestParam() String login, @RequestParam() String password){

        System.out.println("User received : " + login + " " + password);
        User user = serviceUser.getUserByLoginAndPassword(login, password);

        return serviceUser.getUserByLoginAndPassword(login, password);

    }

}
