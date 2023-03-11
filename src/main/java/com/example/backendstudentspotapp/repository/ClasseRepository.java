package com.example.backendstudentspotapp.repository;

import com.example.backendstudentspotapp.entities.ClasseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClasseRepository extends CrudRepository<ClasseEntity, Long> {

    List<ClasseEntity> findByEcole(Long id_ecole);

}
