package com.example.backendstudentspotapp.controller;

import com.example.backendstudentspotapp.entities.ClasseEntity;
import com.example.backendstudentspotapp.service.ServiceClasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClasseController {

    @Autowired
    ServiceClasse serviceClasse;

    @GetMapping("/getClasseByIdEcole/{id_ecole}")
    public List<ClasseEntity> getClasseByIdEcole(@PathVariable long id_ecole){
        System.out.println("Ecole reçue: " + id_ecole);
        return serviceClasse.getClasseByIdEcole(id_ecole);
    }

}
