package com.example.backendstudentspotapp.repository;

import com.example.backendstudentspotapp.entities.EcoleEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EcoleRepository extends CrudRepository<EcoleEntity, Long> {

    List<EcoleEntity> findByGroupe(Long id_groupe);

}
