package com.example.backendstudentspotapp.service;
import com.example.backendstudentspotapp.entities.ClasseEntity;
import com.example.backendstudentspotapp.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceClasse {

    @Autowired
    ClasseRepository classeRepository;

    public List<ClasseEntity> getClasseByIdEcole(Long id_ecole){
        return classeRepository.findByEcole(id_ecole);
    }
}
