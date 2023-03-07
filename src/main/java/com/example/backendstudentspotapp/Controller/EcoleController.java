package com.example.backendstudentspotapp.Controller;

import com.example.backendstudentspotapp.Entities.Ecole;
import com.example.backendstudentspotapp.ServiceEcole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class EcoleController {

    @Autowired
    ServiceEcole serviceEcole;

    @GetMapping("/ecoles/{id_groupe}")
    public Optional<Ecole> getEcolesByIdGroupe(@PathVariable Long id_groupe) {

        System.out.println("Group received : " + id_groupe);

        return serviceEcole.getEcolesByIdGroupe(id_groupe);

    }
}
