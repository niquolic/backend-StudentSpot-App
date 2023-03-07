package com.example.backendstudentspotapp.Controller;

import com.example.backendstudentspotapp.Entities.Ecole;
import com.example.backendstudentspotapp.ServiceEcole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EcoleController {

    @Autowired
    ServiceEcole serviceEcole;

    @GetMapping("/getEcoleByIdGroupe/{id_groupe}")
    public List<Ecole> getEcoleByIdGroupe(@PathVariable Long id_groupe) {

        System.out.println("Group received : " + id_groupe);

        return serviceEcole.getEcoleByIdGroupe(id_groupe);

    }
}
