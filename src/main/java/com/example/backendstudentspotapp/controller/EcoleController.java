package com.example.backendstudentspotapp.controller;

import com.example.backendstudentspotapp.entities.EcoleEntity;
import com.example.backendstudentspotapp.service.ServiceEcole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EcoleController {

    @Autowired
    ServiceEcole serviceEcole;

    @GetMapping("/getEcoleByIdGroupe/{id_groupe}")
    public List<EcoleEntity> getEcoleByIdGroupe(@PathVariable Long id_groupe) {


        // -- Test
        List<EcoleEntity> listSemiAbstract = serviceEcole.getEcoleByIdGroupeWithQueryAnnotation(id_groupe);


        for(EcoleEntity unit : listSemiAbstract){
            System.out.println("Semi abstract class=" + unit.getNom_ecole());
        }


        System.out.println("Group received : " + id_groupe);

        return serviceEcole.getEcoleByIdGroupe(id_groupe);

    }
}
