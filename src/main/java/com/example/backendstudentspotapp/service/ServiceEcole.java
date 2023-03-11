package com.example.backendstudentspotapp.service;

import com.example.backendstudentspotapp.entities.EcoleEntity;
import com.example.backendstudentspotapp.repository.EcoleRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEcole {

    @Autowired
    EcoleRepository ecoleRepository;

    @PersistenceContext
    private EntityManager entityManager;


    // -- LE PLUS ABSTRAIT
    public List<EcoleEntity> getEcoleByIdGroupe(Long id_groupe) {

        return ecoleRepository.findByGroupe(id_groupe);

    }


    // -- SEMI ABSTRAIT
    @Query(value = "SELECT * FROM ecole ecoleUnit WHERE ecoleUnit.id_groupe = ?1", nativeQuery = true)
    public List<EcoleEntity> getEcoleByIdGroupeWithQueryAnnotation(Long id_groupe) {

        return ecoleRepository.findByGroupe(id_groupe);

    }

    // -- A L'ANCIENNE

    public List<Object> getEcoleByIdGroupeWithRawQuery(Long id_groupe) {

        String request = String.format("SELECT * FROM ecole WHERE id_groupe = %s;", id_groupe);
        // request = "SELECT * FROM ecole ecoleUnit WHERE ecoleUnit.id_group = " + id_groupe;

        List<Object> results = entityManager.createNativeQuery(request).getResultList();

        return results;

    }



}
