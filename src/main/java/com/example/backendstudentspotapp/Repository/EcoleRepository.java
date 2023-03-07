package com.example.backendstudentspotapp.Repository;

import com.example.backendstudentspotapp.Entities.Ecole;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EcoleRepository extends CrudRepository<Ecole, Long> {

    List<Ecole> findByGroupe(Long id_groupe);
}
