package com.example.backendstudentspotapp.Controller;

import com.example.backendstudentspotapp.Entities.User;
import com.example.backendstudentspotapp.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    ServiceUser serviceUser;

    @GetMapping("/getUserById")
    public String getUserById(@RequestParam() String id){

        System.out.println("ID RECEIVE:" + id);
        User user = serviceUser.getUserByMyId(id);

        return "Le nom de mon user est:" + user.getPrenom();

    }

}
