package com.example.backendstudentspotapp.Repository;

import com.example.backendstudentspotapp.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByLoginAndPassword(String login, String password);

}
