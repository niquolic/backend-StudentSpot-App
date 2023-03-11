package com.example.backendstudentspotapp.repository;

import com.example.backendstudentspotapp.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByLoginAndPassword(String login, String password);

}
